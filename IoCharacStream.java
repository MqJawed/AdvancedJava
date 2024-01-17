import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IoCharacStream {
    public static void main(String[] args) {

        String filename1 = "C:\\Users\\MD QUZAL JAWED\\Documents\\AdvancedJava\\IoInput.txt";
        String filename2 = "C:\\Users\\MD QUZAL JAWED\\Documents\\AdvancedJava\\IoOutput.txt";

        FileReader filein = null;
        FileWriter fileout = null;

        try{
            filein = new FileReader(filename1);
            fileout = new FileWriter(filename2);

            int content;
            while((content = filein.read()) != -1)
            {
                fileout.write((char) content);
            }
            filein.close();
            fileout.close();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}
