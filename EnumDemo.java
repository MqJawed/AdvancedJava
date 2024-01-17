public class EnumDemo {
    public static void main(String[] args) {
        Color c1 = Color.GREEN;
        System.out.println(c1.getval());
        System.out.println(c1);

        for (Color col : Color.values())
        {
            System.out.println(col);
        }
    }
}
