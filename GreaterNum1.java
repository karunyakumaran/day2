import java.util.Scanner;
public class GreaterNum1
{
    public static void main(String[]args)
    { 
       Scanner s=new Scanner(System.in);
       int A =s.nextlnt();
       int B =s.nextlnt();
       if(A>B)
             
           System.out.println(A);
       else if(B>A)
           System.out.println(B);
       else
           System.out.println("Numbers are Equal");
              }
          }