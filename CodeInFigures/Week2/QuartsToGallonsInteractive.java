package Week2;

import java.util.Scanner;

public class QuartsToGallonsInteractive {
    public static void main (String [] args)
    {
        int qaurtsInGallon = 4;
        int job;
        Scanner userInput = new Scanner (System.in);
        System.out.print("Enter the quarts required for the job >> ");
        job = userInput.nextInt();
        int gallons = job/qaurtsInGallon;
        int quarts = job%qaurtsInGallon;
        System.out.print("A job that requires "+ job +" quarts of paint requires "+ gallons + " gallons plus "+quarts+" quarts");
    }


}
