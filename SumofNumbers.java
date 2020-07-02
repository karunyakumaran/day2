import java.util.Scanner;
public class SumofNumber
{ 
  public static void main(String[]args)
{
   Scanner s =new Scanner(System.in);
        int A=s.nextlnt();
        int B=s.nextlnt();
        int C=A+B;
        if(C&2==0)
             System.out.println("Sum is Even");
         else
             System.out.println("Sum is Odd");
           }
    }
        