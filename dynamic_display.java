class Answer
{
    public void answer()
    {
        System.out.println("THE ANSWER IS");
    }
}
class Addition extends Answer
{
    public void answer()
    {
        System.out.println("ADDITION");
    }
}
class Sub extends Answer
{
    public void answer()
    {
        System.out.println("SUB");
    }
}
public class dynamic_display
{
    public static void main(String[] args)
    {
        Answer a2 = new Answer();
        Answer a1 = new Addition();
        Answer s1 = new Sub();
        a2.answer();
        a1.answer();
        s1.answer();
    }
}
