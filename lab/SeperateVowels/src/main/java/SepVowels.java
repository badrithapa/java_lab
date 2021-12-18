import java.io.*;
import java.util.Arrays;
import java.util.*;

public class SepVowels {
    public static void main(String []arg) throws IOException{
        FileWriter writer = new FileWriter("VC.txt");
        String content = "This is the Test.txt file I am writing to.\n \tAnd my name is Badri Thapa.";
        writer.write(content);
        writer.close();

        FileWriter vowelWriter = new FileWriter("Vowels.txt");
        vowelWriter.write("The Vowels in file File.txt are: ");


        FileWriter consonantWriter = new FileWriter("Consonants.txt");
        consonantWriter.write("The Consonants in file File.txt are: ");

        String vowels = "aeiouAEIOU";
        FileReader reader = new FileReader("VC.txt");
        char []a =new char[content.length()];
        reader.read(a);

        for(char i:a){
           if (vowels.contains(i+"")){
               vowelWriter.write(i+", ");
           }
           else{
               if(i!=' '&&i!='.'&&i!=','&&i!=(char)Integer.parseInt("\\u0009".substring(2),16) && i!=(char)Integer.parseInt("\\u000a".substring(2),16)) {
                   consonantWriter.write(i + ", ");
               }
//               (char)Integer.parseInt("\\u0009".substring(2),16) this line convert unicode for tab into char
           }
        }
        vowelWriter.close();
        consonantWriter.close();
        reader.close();
    }
}
