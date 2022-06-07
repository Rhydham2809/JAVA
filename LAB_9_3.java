import java.util.Scanner;
public class LAB_9_3
{
   public static int m,n;
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number of columns:");
        m = input.nextInt();
        System.out.println("Please enter number of rows:");
        n = input.nextInt();
       int[][] matrix = new int[m][n];

        for(int i=0;i<m;i++)
        {
            System.out.println("FOR ROW "+(i+1));
            for(int j=0;j<n;j++)
            {
                System.out.println("ENTER VALUE "+(j+1));
                matrix[i][j] = input.nextInt();
            }
        }
        System.out.println("THE ENTERED MATRIX IS AS FOLLOWS:");

        for(int k=0;k<m;k++)
        {
            for (int l = 0; l < n; l++) {
                System.out.print(matrix[k][l]+"  ");
            }
            System.out.println("");
        }

        ThreadMaking t1 = new ThreadMaking();
        t1.display();
    }
}
class ThreadMaking extends LAB_9_3
{

    public void display()
    {
        System.out.println(super.m);
        System.out.println(super.n);
       try
       {
           for(int i=0;i<super.m;i++)
           {
               for(int j=0;j<super.n;j++)
               {
                   System.out.print(super.matrix[i][j]);
               }
           }
       }catch (Exception e)
       {
           e.printStackTrace();
       }
    }
}
