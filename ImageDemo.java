import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageDemo {
    public static void main(String[] args) {

        int height = 500;
        int width = 500;
        BufferedImage image = null;
        image = readImage(height, width);

        try{
        writetoImage(image);
        }
        catch (IOException e)
        {
            System.out.println(e);
        }

    }

    private static BufferedImage readImage(int height, int width)
    {
        try{
        File inp = new File("C:\\Users\\MD QUZAL JAWED\\Documents\\AdvancedJava\\th.jpg");
        
        //CREATING DIMENSIONS FOR IMAGE
        BufferedImage image = new BufferedImage(height , width, BufferedImage.TYPE_4BYTE_ABGR);

        //ADDING IMAGE TO THAT DIMENSION
        image = ImageIO.read(inp);
        return image;
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        return null;

    }
    private static void writetoImage(BufferedImage image) throws IOException
    {
        File out = new File("C:\\Users\\MD QUZAL JAWED\\Documents\\AdvancedJava\\thwrite.jpg");
        ImageIO.write(image, "jpg", out);
    }
}
