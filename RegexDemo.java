import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {

        String regexstr = "[0-9][a-z][0-8]";
        Pattern pattern = Pattern.compile(regexstr);
        Matcher matcher = pattern.matcher("12345a9");
        boolean val = matcher.find();
        if(val)
        {
            System.out.println("Ok");
        }
        else
        {
            System.out.println("Not ok");
        }
    }
}
