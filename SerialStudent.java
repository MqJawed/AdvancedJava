import java.io.Serializable;
public class SerialStudent implements Serializable {
    
    private static final long serialVersionID = 1L;
    private String name;
    private int age;
    transient int x;

    SerialStudent(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString()
    {
        return this.name + " " + this.age + " " + this.x;
    }

}
