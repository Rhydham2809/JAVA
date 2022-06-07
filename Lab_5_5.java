class complex
{
    double real;
    double img;
    complex()
    {
        real = 0;
        img  = 0;
    }
    complex(double real, double img)
    {
        this.real = real;
        this.img  = img;
    }
    complex(String a, double real,double img)
    {
        System.out.println(a);
        System.out.println("REAL :"+real);
        System.out.println("IMG  :"+img);
    }
    public void add(complex c1 , complex c2)
    {
        System.out.println((c1.real+c2.real)+" + "+(c1.img+c2.img)+"i");
    }
}
public class Lab_5_5
{
    public static void main(String[] args)
    {
        complex c1 = new complex();
        complex c2 = new complex(24,56);
        complex c3 = new complex("hello",34,56);
        c2.add(c2,c3);
    }

}