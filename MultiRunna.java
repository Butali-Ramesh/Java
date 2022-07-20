
class MultiThread implements Runnable
{
    public void run()
    {
        try
        {
            System.out.println("Thread "+Thread.currentThread().getName()+" is running");
        }
        catch(Exception e)
        {
            System.out.println("Exception is caught");
        }
    }
}

public class MultiRunna
{
    public static void main(String [] args)
    {

        Thread t = new Thread(new MultiThread(),"Ram");
        t.start();

       Thread t1 = new Thread(new MultiThread(),"Ramesh");
        t1.start();



    }
}