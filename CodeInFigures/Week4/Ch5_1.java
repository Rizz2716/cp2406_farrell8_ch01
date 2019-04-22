package Week4;
import java.util.*;
public class Ch5_1 {
    public static void main (String [] args)
    {
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter a number");
       int a = Integer.parseInt(scan.nextLine());
       if (a%2==0){
           System.out.println("The number is even");
       }
       else
           System.out.println("The number is Odd");
    }
}
