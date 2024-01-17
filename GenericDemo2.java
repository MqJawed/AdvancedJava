class Gener{

    public String toString()
    {
        return "Of Genre type";
    }


}

class Gener2{

    public String toString()
    {
       return "Of Genre2 type";
    }

}

public class GenericDemo2<T,U>{

    T obj1 ; U obj2;
    GenericDemo2(T objt1 , U objt2)
    {
        this.obj1 = objt1;
        this.obj2 = objt2;
    }

    // THE RELATION BETWEEN TWO TYPES IS DEFINED HERE. THIS IS A DEMO

    void print()
    {
        System.out.println(this.obj1);
        System.out.println(this.obj2);
    }
    public static void main(String[] args) {
        
        Gener gener = new Gener();
        Gener2 gener2 = new Gener2();
        GenericDemo2<Gener, Gener2> genericDemo2 = new GenericDemo2<>(gener , gener2);
        genericDemo2.print();

    }
}
