public class Thread1 implements Runnable {

    Thread1(String name)
    {
        Thread t = new Thread(this, name);
        t.start();
        
    }

    @Override
    public void run()
    {
        mult(5);
        
    }
    
}
