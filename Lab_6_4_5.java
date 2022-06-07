import java.util.Scanner;
class Mypoint
{
    Scanner input = new Scanner(System.in);
    double x,y;
//    public void getter()
//    {
//        System.out.print("X Coordinate: ");
//        x = input.nextDouble();
//        System.out.print("Y Coordinate: ");
//        y = input.nextDouble();
//    }
    Mypoint()
    {
        x = 0;
        y = 0;
    }
    Mypoint(double x,double y)
    {
        this.x = x;
        this.y = y;
    }
    public double distance(Mypoint my)
    {
        double d = Math.sqrt(Math.pow(this.x- my.x,2) + Math.pow(this.y- my.y,2));
        return d;
    }
    public double distance(double a, double b)
    {
        double d = Math.sqrt(Math.pow(this.x- a,2) + Math.pow(this.y- b,2));
        return d;
    }
}
class MyThreepoint extends Mypoint
{
    double z;
    MyThreepoint()
    {
        super();
        z = 0;
    }
    MyThreepoint(double z)
    {
        super(1,1);
        this.z = z;
    }
    public double getZ()
    {
        return this.z;
    }
//    public double distance(MyThreepoint my)
//    {
//        double d = Math.sqrt(Math.pow(this.x- my.x,2) + Math.pow(this.y- my.y,2)+Math.pow(this.z- my.z,2));
//        return d;
//    }

    @Override
    public double distance(Mypoint my) {
        return super.distance(my);
    }

    public double distance(double a, double b, double c)
    {
        double d = Math.sqrt(Math.pow(this.x- a,2) + Math.pow(this.y- b,2)+Math.pow(this.z- c,2));
        return d;
    }
}



public class Lab_6_4_5
{
    public static void main(String[] args)
    {
        Mypoint m1 = new Mypoint(1,1);
        Mypoint m2 = new Mypoint();
//        m1.getter();
        System.out.println("Distance between the points and origin: "+m1.distance(m2));
        System.out.println("Distance between the points and other points: "+m1.distance(1,1));

        MyThreepoint mt1 = new MyThreepoint(1);
        MyThreepoint mt2 = new MyThreepoint();
        System.out.println("VALUE OF Z = "+mt1.getZ());
        System.out.println("Distance between the points and origin: "+mt1.distance(mt2));
        System.out.println("Distance between the points and other points: "+mt1.distance(1,1,1));
    }
}
