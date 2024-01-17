public class GenericDemo<T>
{
    T obj;
    GenericDemo(T objt)
    {
        this.obj = objt;
    }

    public T returnobj()
    {
        return this.obj;
    }
    public static void main(String[] args) {

        GenericDemo<Integer> gd = new GenericDemo<Integer>(5); // here generic demo is creating an integer object with value 5;
        System.out.println(gd.returnobj()); // since we are printing an integer object toString() will not print the string represntation of the object rather the value

        
    }
}