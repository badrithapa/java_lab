import java.io.*;

public class CopyFile {
    public static void main(String []args) throws IOException {
        FileInputStream r = null;
        FileOutputStream w = null;
        try {
            r = new FileInputStream("original.txt");
            w = new FileOutputStream("copy.txt");
            int c;
            while ((c = r.read()) != -1){
                w.write(c);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally{
            r.close();
            w.close();
        }
    }
}
