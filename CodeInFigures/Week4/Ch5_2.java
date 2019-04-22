package Week4;
import java.util.*;
public class Ch5_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = Integer.parseInt(scan.nextLine());
        System.out.println("Enter Second number");
        int b = Integer.parseInt(scan.nextLine());
        System.out.println("Enter third number");
        int c = Integer.parseInt(scan.nextLine());
        largesmall(a, b, c);
        smalllarge(a, b, c);
    }

    public static void largesmall(int one, int two, int three) {
        System.out.println("Descending order:");
        if (one > two && two > three) {
            System.out.println(one + "" + two + "" + three);
        } else if (two > one && one > three) {
            System.out.println(two + "" + one + "" + three);
        } else if (three > two && two > one) {
            System.out.println(three + "" + two + "" + one);
        } else {
            System.out.println(one + "" + three + "" + two);
        }
    }

    public static void smalllarge(int one, int two, int three) {
        System.out.println("Ascending order:");
        if (one < two && two < three) {
            System.out.println(one + "" + two + "" + three);
        } else if (two < one && one < three) {
            System.out.println(two + "" + one + "" + three);
        } else if (three < two && two < one) {
            System.out.println(three + "" + two + "" + one);
        } else {
            System.out.println(one + "" + three + "" + two);
        }
    }
}
