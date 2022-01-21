package com.example.helloworld;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        String PaintName1 = "Classy";
        String PaintName2 = "Fancy";
        Scanner myObj = new Scanner(System.in);
        int PaintCoveragePerLitre = 12;
        int Litrespercan = 5;
        int Costpercan1 = (int) (Math.ceil(Math.random()*20)+20);
        int Costpercan2 = (int) (Math.ceil(Math.random()*20)+20);
        System.out.println("Enter house length, width and height:");
        int Walllength1 = myObj.nextInt();
        int Walllength2 = myObj.nextInt();
        int Wallheight = myObj.nextInt();
        System.out.println("Enter budget:");
        int Budget = myObj.nextInt();
        int Surface_Area = 2 * (Walllength1+Walllength2) * Wallheight;
        double Numberofcans = (double) (Surface_Area/PaintCoveragePerLitre)/Litrespercan;
        int Numberofcanswhole = (int) Math.ceil(Numberofcans);
        int Labourcostperday = 140;
        int Squaremetersperday = 100;
        int intTimeindaysforjob = (int)(Math.ceil(Surface_Area/Squaremetersperday));
        int realTimeindaysforjob =intTimeindaysforjob;
        int counter = 0;
        while (counter<intTimeindaysforjob) {
            int Chanceofrain = (int) (Math.random()*10);
            if ( Chanceofrain%2 == 0) {
                realTimeindaysforjob += 1;
            }
            counter +=1;
        }
        int Rainydays = realTimeindaysforjob- intTimeindaysforjob;
        int Labourcost = intTimeindaysforjob * Labourcostperday;
        int Cost1 = Costpercan1*Numberofcanswhole;
        int Cost2 = Costpercan2*Numberofcanswhole;
        int MinCost = Math.min(Cost1,Cost2);

        System.out.println("Length of walls are "+ Walllength1 +" and "+ Walllength2 +".");
        System.out.println("Height of wall is "+ Wallheight+".");
        System.out.println("The cost to decorate the house with " + PaintName1 + " is £" + Cost1 +".");
        System.out.println("The cost to decorate the house with " + PaintName2 + " is £" + Cost2+ ".");

        if ((MinCost == Cost1) && (Cost2 != Cost1)){
            System.out.println("The cheapest to paint the house is £" + MinCost + " using " + PaintName1 +". With a labour cost of £" +
                    Labourcost +" the total price is £" + (MinCost+ Labourcost)+".");
        }
        else if (Cost2 != Cost1){
            System.out.println("The cheapest to paint the house is £" + MinCost + " using " + PaintName2 +". With a labour cost of £" +
                    Labourcost +" the total price is £" + (MinCost+ Labourcost)+".");

        }
        else {
            System.out.println("Both paints cost the same amount, £" + MinCost + ", so either can be used. With a labour cost of £" +
                    Labourcost +" the total price is £" + (MinCost+ Labourcost) + ".");
        }
        System.out.println("The job originally would have taken "+ intTimeindaysforjob +
                " day(s), however it rained for " + Rainydays + " day(s), so the job took " +realTimeindaysforjob +" days.");
        String result = ((MinCost+ Labourcost) >= Budget) ? "This job is over budget." : "This job is under budget.";
        System.out.println(result);

        switch (Numberofcanswhole) {
            case 1 -> System.out.println("Only one tin needed");
            case 2, 3, 4, 5 -> System.out.println("A few tins needed");
            case 6, 7, 8, 9, 10, 11, 12 -> System.out.println("Many tins needed");
            default -> System.out.println("Something has gone wrong");
        }

    }
}

