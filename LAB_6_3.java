class Member
{
    String  Name;
    int     Age;
    String  phone_number;
    String  address;
    double  Salary;

    Member(String Name,int Age,String phone_number,String address)
    {
        System.out.println("NAME          :"+Name);
        System.out.println("AGE           :"+Age);
        System.out.println("PHONE NUMBER  :"+phone_number);
        System.out.println("ADDRESS       :"+address);
    }
    public void printSalary(double Salary)
    {
        System.out.println("SALARY        :"+Salary);
    }
}
class Employee extends Member
{
    Employee(String Specialization)
    {
        super("ABHIJIT",34,"123456","RAJKOT");
        System.out.println("SPECIALIZATION :"+Specialization);
    }
    public void salary()
    {
        super.printSalary(134345);
    }

}
class Manager extends Member
{
   Manager(String Department)
   {
       super("RAJ",56,"123456","BARODA");
       System.out.println("DEPARTMENT      :"+Department);
   }
    public void salary()
    {
        super.printSalary(12345);
    }

}
public class LAB_6_3
{
    public static void main(String[] args)
    {
        Employee e1 = new Employee("JAVA");
        e1.salary();
        Manager m1  = new Manager("IT");
        m1.salary();
    }
}