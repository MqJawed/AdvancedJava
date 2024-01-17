public class Thread2 implements Runnable{

    Thread2(String name)
    {
        Thread t = new Thread(this, name);
        t.start();
    }

    @Override
    public void run()
    {
        mult(7);
       
    }
    
}
