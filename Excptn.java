import java.util.Scanner;
public class Excptn
{
   public static void main(String[ ] args)
  {
    int x,y,ans;
    System.out.println("Enter two numbers: ");
    Scanner sc = new Scanner(System.in);
    x = sc.nextInt();
    y = sc.nextInt();
    
    try
    {
      ans = x/y;
      System.out.println(ans);
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
   }
} 
