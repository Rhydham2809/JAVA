class Even  extends Thread
{
    public void run()
    {
        for(int i=1;i<=20;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
            try
            {
                sleep(500);
            }
            catch (Exception e1)
            {
                e1.printStackTrace();
            }
        }
    }
}

class Odd  extends Thread
{
    public void run()
    {
        for(int i=1;i<=20;i++)
        {
            if(i%2!=0)
            {
                System.out.println(i);
            }
            try
            {
                sleep(500);
            }
            catch (Exception e1)
            {
                e1.printStackTrace();
            }
        }
    }
}

class Hello
{
    public static void main(String[] args)
    {
        Even e = new Even();
        Odd o = new Odd();
        e.start();
        o.start();
    }
}

