interface A1
{
    public int a1 = 23;
    public void a1();
}
interface A2
{
    public int a2 = 24;
    public void a2();
}
interface A extends A1,A2
{
    public int a = 25;
    public void a();
}
interface A12 extends A1,A2
{
    public int a12 = 26;
    public void a12();
}
class B implements  A12
{
    public void a12()
    {
        System.out.println(a12);
    }
    public void a1()
    {
        System.out.println(a1);
    }
    public void a2()
    {
        System.out.println(a2);
    }
}
public class Lab_7_2
{
    public static void main(String[] args)
    {
        B b1 = new B();
        b1.a1();
        b1.a2();
        b1.a12();
    }
}