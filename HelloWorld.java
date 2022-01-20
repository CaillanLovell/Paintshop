package com.example.helloworld;

public class HelloWorld {
    public static void main(String[] args) {
        String PaintName1 = "Classy";
        String PaintName2 = "Fancy";

        int PaintCoveragePerLitre = 8;
        int Litrespercan = 5;
        int Costpercan1 = (int) (Math.ceil(Math.random()*30)+20);
        int Costpercan2 = (int) (Math.ceil(Math.random()*30)+20);
        int Walllength1 = (int) (Math.ceil(Math.random()*10)+10);
        int Walllength2 = (int) (Math.ceil(Math.random()*10)+10);
        int Wallheight = (int) (Math.ceil(Math.random()*4)+3);
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
        if (MinCost == Cost1){
            System.out.println("Length of walls are "+ Walllength1 +" and "+ Walllength2+".");
            System.out.println("Height of wall is "+ Wallheight+".");
            System.out.println("The cost to decorate the house with " + PaintName1 + " is £" + Cost1 +".");
            System.out.println("The cost to decorate the house with " + PaintName2 + " is £" + Cost2+ ".");
            System.out.println("The cheapest to paint the house is £" + MinCost + " using " + PaintName1 +". With a labour cost of £" +
                    Labourcost +" the total price is £" + (MinCost+ Labourcost)+".");
            System.out.println("It rained "+ Rainydays + " day(s), so the job took " +realTimeindaysforjob +" days.");
        }
        if (MinCost == Cost2){
            System.out.println("The length of the walls are "+ Walllength1 +"m and "+ Walllength2+"m.");
            System.out.println("The height of the walls is "+ Wallheight+"m.");
            System.out.println("The cost to decorate the house with " + PaintName1 + " is £" + Cost1 +".");
            System.out.println("The cost to decorate the house with " + PaintName2 + " is £" + Cost2+ ".");
            System.out.println("The cheapest to paint the house is £" + MinCost + " using " + PaintName2 +". With a labour cost of £" +
                    Labourcost +" the total price is £" + (MinCost+ Labourcost)+".");
            System.out.println("It rained "+ Rainydays + " day(s), so the job took " +realTimeindaysforjob +" days.");
        }
        if (Cost1 == Cost2){
            System.out.println("The length of the walls are "+ Walllength1 +"m and "+ Walllength2+"m.");
            System.out.println("The height of the walls is "+ Wallheight+"m.");
            System.out.println("The cost to decorate the house with " + PaintName1 + " is £" + Cost1 +".");
            System.out.println("The cost to decorate the house with " + PaintName2 + " is £" + Cost2+ ".");
            System.out.println("Both paints cost the same amount, £" + MinCost + ", so either can be used. With a labour cost of £" +
                    Labourcost +" the total price is £" + (MinCost+ Labourcost) + ".");
            System.out.println("It rained "+ Rainydays + " day(s), so the job took " +realTimeindaysforjob +" days.");
        }

    }
}

