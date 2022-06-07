class a
{
    public int a = 12;

    public void method1()
    {
        System.out.println("METHOD FROM PARENT CLASS");
    }
    a()
    {
        System.out.println("PARENT CLASS CONSTRUCTOR");
    }
    public void method2(int a,int b)
    {
        System.out.println("SUM = "+(a+b));
    }
}

class b extends a
{
    public void display()
    {
        System.out.println(super.a);
//        PARENT CLASS VARIABLE

        super.method1();
//        PARENT CLASS METHOD
    }
    b()
    {
        super();
    }
}

public class Lab_6_6
{
    public static void main(String[] args)
    {
        b b1 = new b();
        b1.display();
    }
}
