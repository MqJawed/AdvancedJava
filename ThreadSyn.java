public class ThreadSyn {
    
   synchronized void mult(int n)
    {
        for(int i = 1; i<=n; i++)
        {
            System.out.println(n*i);
            try{
                Thread.sleep(1000);
                }
                catch(InterruptedException e)
                {
                    System.out.println(e);
                }
        }
       
    }
}
