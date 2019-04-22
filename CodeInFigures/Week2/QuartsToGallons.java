package Week2;

public class QuartsToGallons {

    public static void main (String [] args)
    {
        int quartsInGallons = 4;
        int job = 18;
        int quarts = job%quartsInGallons;
        int gallons = job/quartsInGallons;
        System.out.print("A job that requires 18 quarts of paint requires "+ gallons+" gallons plus "+quarts+" quarts");
    }
}
