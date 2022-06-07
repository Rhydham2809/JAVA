import java.util.Scanner;
class Student
{
    int        id;
    int        no_of_subjects;
    double     spi=0;
    String[]   subject_code;
    int[]      marks_obtained;
    int[]      credit_obtained;
    int credit = 0;
    Scanner input = new Scanner(System.in);

    Student()
    {
        System.out.print("STUDENT ID: ");
        id              = input.nextInt();
        System.out.print("NO OF SUBJECTS: ");
        no_of_subjects  = input.nextInt();
        String[]   subject_code    = new String[no_of_subjects];
        int[]      grade_obtained  = new int[no_of_subjects];
        int[]      credit_obtained = new int[no_of_subjects];
        for(int i=0;i<no_of_subjects;i++)
        {
            System.out.println("FOR SUBJECT"+(i+1));
            System.out.print("SUBJECT CODE: ");
            subject_code[i]    =input.next();
            System.out.print("GRADE OBTAINED: ");
            grade_obtained[i]   =input.nextInt();
            System.out.print("CREDIT : ");
            credit_obtained[i] =input.nextInt();
        }
        for(int j=0;j<no_of_subjects;j++)
        {
            spi = grade_obtained[j]*credit_obtained[j] + spi;

            credit   = credit_obtained[j] + credit;
        }
        spi = spi/credit;

    }

    void spi()
    {
        System.out.println("SPI = "+spi);
    }
}

public class Lab_6_1
{
    public static void main(String[] args)
    {
        int a = Integer.parseInt(args[0]);
        Student[] s = new Student[a];
        for(int i=0;i<a;i++)
        {
            System.out.println("ENTER INFORMATION FOR STUDENT"+(i+1));
            s[i] = new Student();
            s[i].spi();
        }
    }
}
