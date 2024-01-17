import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IoByteStream {
    public static void main(String[] args) {

        String filename1 = "C:\\Users\\MD QUZAL JAWED\\Documents\\AdvancedJava\\IoInput.txt";
        String filename2 = "C:\\Users\\MD QUZAL JAWED\\Documents\\AdvancedJava\\IoOutput.txt";

        FileInputStream filein = null;
        FileOutputStream fileout = null;

        try{
            filein = new FileInputStream(filename1);
            fileout = new FileOutputStream(filename2);

            int content;
            while((content = filein.read()) != -1)
            {
                fileout.write((byte) content);
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
