abstract class Vegetable
{
    abstract public void tostring();
}
class Potato extends Vegetable
{
    String a = "LIGHT BROWN";
    public void tostring()
    {
        System.out.println("Potato");
        System.out.println(a);
    }
}
class Tomato extends Vegetable
{
    String a = "RED";
    public void tostring()
    {
        System.out.println("Tomato");
        System.out.println(a);
    }
}
class Brinjal extends Vegetable
{
    String a = "PURPLE";
    public void tostring()
    {
        System.out.println("BRINJAL");
        System.out.println(a);
    }
}
public class Lab_7_1
{
    public static void main(String[] args)
    {
        Potato  p1 = new Potato();
        Tomato  t1 = new Tomato();
        Brinjal b1 = new Brinjal();
        p1.tostring();
        t1.tostring();
        b1.tostring();
    }
}

