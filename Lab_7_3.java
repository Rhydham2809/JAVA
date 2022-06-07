interface Transport
{
    public void deliver();
}
abstract class Animal
{
    void animal()
    {
        System.out.println("ANIMAL");
    }
}
class Tiger extends Animal
{
    void tigerl()
    {
        System.out.println("TIGER");
    }
}
class Camel extends Animal implements Transport
{
    public void deliver()
    {
        System.out.println("CAMEL");
    }
}
class Deer extends Animal
{
    void deer()
    {
        System.out.println("DEER");
    }
}
class Donkey extends Animal implements Transport
{
    public void deliver()
    {
        System.out.println("DONKEY");
    }
}
public class Lab_7_3
{
    public static void main(String[] args)
    {
        Deer   de  = new Deer();
        Donkey don = new Donkey();
        Camel  cm  = new Camel();
        Tiger  ti  = new Tiger();
        de.deer();
        don.deliver();
        cm.deliver();
        ti.tigerl();
    }
}

