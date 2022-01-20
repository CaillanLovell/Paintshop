package com.example.helloworld;

public class HelloWorld {
    public static void main(String[] args) {
        String PaintName1 = "Classy";
        String PaintName2 = "Fancy";

        int PaintCoveragePerLitre = 8;
        int Litrespercan = 5;
        int Costpercan1 = (int) (Math.ceil(Math.random()*20)+5);
        int Costpercan2 = (int) (Math.ceil(Math.random()*20)+5);
        int Walllength1 = (int) (Math.ceil(Math.random()*10)+5);
        int Walllength2 = (int) (Math.ceil(Math.random()*10)+5);
        int Wallheight = (int) (Math.ceil(Math.random()*5)+1);
        int Surface_Area = 2 * (Walllength1+Walllength2) * Wallheight;
        double Numberofcans = (double) (Surface_Area/PaintCoveragePerLitre)/Litrespercan;
        int Numberofcanswhole = (int) Math.ceil(Numberofcans);
        int Cost1 = Costpercan1*Numberofcanswhole;
        int Cost2 = Costpercan2*Numberofcanswhole;
        int MinCost = Math.min(Cost1,Cost2);
        if (MinCost == Cost1){
            String CheapPaint = PaintName1;
            System.out.println("Length of walls are "+ Walllength1 +" and "+ Walllength2);
            System.out.println("Height of wall is "+ Wallheight);
            System.out.println("The cost to decorate the house with " + PaintName1 + " is £" + Cost1);
            System.out.println("The cost to decorate the house with " + PaintName2 + " is £" + Cost2);
            System.out.println("The cheapest to paint the house is £" + MinCost + " using " + CheapPaint);
        }
        if (MinCost == Cost2){
            String CheapPaint = PaintName2;
            System.out.println("Length of walls are "+ Walllength1 +" and "+ Walllength2);
            System.out.println("Height of wall is "+ Wallheight);
            System.out.println("The cost to decorate the house with " + PaintName1 + " is £" + Cost1);
            System.out.println("The cost to decorate the house with " + PaintName2 + " is £" + Cost2);
            System.out.println("The cheapest to paint the house is £" + MinCost + " using " + CheapPaint);
        }

    }
}

