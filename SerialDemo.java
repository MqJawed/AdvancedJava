import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class SerialDemo {
    public static void main(String[] args) {
        SerialStudent s1 = new SerialStudent("MqJawed", 20);
        s1.x =5;

        System.out.println(s1);

        //Serialization
        String filename = "C:\\Users\\MD QUZAL JAWED\\Documents\\AdvancedJava\\serial.txt";
        FileOutputStream fileout = null;
        ObjectOutputStream objout = null;

        try{
            fileout = new FileOutputStream(filename);
            objout = new ObjectOutputStream(fileout);
            objout.writeObject(s1);

            objout.close();
            fileout.close();
        }
        catch (IOException e)
        {
            System.out.println(e);
        }

        //DeSerialization
        FileInputStream filein = null;
        ObjectInputStream objin = null;

        try{
            filein = new FileInputStream(filename);
            objin = new ObjectInputStream(filein);
        SerialStudent object = (SerialStudent) objin.readObject();
            System.out.println(object);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
         catch(ClassNotFoundException e)
        {
            System.out.println(e);
        }
    }
}
