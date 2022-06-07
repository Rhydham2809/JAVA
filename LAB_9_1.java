class MyThread1 implements  Runnable
{
    @Override
    public void run()
    {
        System.out.println("GOOD MORNING");
        try
        {
            Thread.sleep(1000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
class MyThread2 implements  Runnable
{
    @Override

    public void run()
    {
        System.out.println("GOOD AFTERNOON");
        try
        {
            Thread.sleep(3000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
public class LAB_9_1
{
    public static void main(String[] args)
    {
        for(int i=1;i<=10;i++)
        {
           try
           {
               MyThread1 t1 = new MyThread1();
               Thread t2 = new Thread(t1);
               MyThread2 t3 = new MyThread2();
               Thread t4 = new Thread(t3);
               t2.start();
               t4.start();
           }catch (Exception e)
           {
               e.printStackTrace();
           }
        }
    }
}
