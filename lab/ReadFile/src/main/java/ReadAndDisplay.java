import java.io.*;

public class ReadAndDisplay {
    public static void main(String []arg) throws IOException{
        FileWriter writer = new FileWriter("Test.txt");
        String content = "This is the Test.txt file I am writing to.\n \tAnd my name is Badri Thapa.";
        writer.write(content);
        writer.close();
        FileReader reader = new FileReader("Test.txt");
        char []a =new char[content.length()];
        reader.read(a);
        for(char i:a){
            System.out.print(i);
        }
        reader.close();
    }
}
