package com.example.helloworld;

import java.util.Objects;
import java.util.Scanner;

public class HelloWorld {
    public static void statement(int MinCost, String PaintName, int Labourcost){
        System.out.println("The cheapest to decorate is £" + MinCost + " using " + PaintName + ". With a labour cost of £" +
                Labourcost + " the total price is £" + (MinCost + Labourcost) + ".");
    }
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String again;
        do {
            String PaintName1 = "Classy";
            String PaintName2 = "Fancy";

            int PaintCoveragePerLitre = 12;
            int Litrespercan = 5;
            int Costpercan1 = (int) (Math.ceil(Math.random() * 20) + 20);
            int Costpercan2 = (int) (Math.ceil(Math.random() * 20) + 20);
            System.out.println("Do you want the exterior or the interior of the house painted?");
            String Location = myObj.next();
            if (Objects.equals(Location, "exterior")) {

                System.out.println("Enter house length, width and height:");
                int Walllength1 = myObj.nextInt();
                int Walllength2 = myObj.nextInt();
                int Wallheight = myObj.nextInt();

                System.out.println("How many windows are there in the house in total?:");
                int Windownumber = myObj.nextInt();
                int Averagewindow = 2;

                System.out.println("Enter budget:");
                int Budget = myObj.nextInt();

                int Surface_Area = ((2 * (Walllength1 + Walllength2) * Wallheight) - (Windownumber * Averagewindow));
                double Numberofcans = (double) (Surface_Area / PaintCoveragePerLitre) / Litrespercan;
                int Numberofcanswhole = (int) Math.ceil(Numberofcans);
                int Labourcostperday = 140;
                int Squaremetersperday = 100;

                int intTimeindaysforjob = (int) (Math.ceil(Surface_Area / Squaremetersperday));
                int realTimeindaysforjob = intTimeindaysforjob;
                int counter = 0;
                while (counter < intTimeindaysforjob) {
                    int Chanceofrain = (int) (Math.random() * 10);
                    if (Chanceofrain % 2 == 0) {
                        realTimeindaysforjob += 1;
                    }
                    counter += 1;
                }
                int Rainydays = realTimeindaysforjob - intTimeindaysforjob;

                int Labourcost = intTimeindaysforjob * Labourcostperday;
                int Cost1 = Costpercan1 * Numberofcanswhole;
                int Cost2 = Costpercan2 * Numberofcanswhole;
                int MinCost = Math.min(Cost1, Cost2);

                System.out.println("Length of walls are " + Walllength1 + " and " + Walllength2 + ".");
                System.out.println("Height of wall is " + Wallheight + ".");
                System.out.println("The cost to decorate the house with " + PaintName1 + " is £" + Cost1 + ".");
                System.out.println("The cost to decorate the house with " + PaintName2 + " is £" + Cost2 + ".");

                if ((MinCost == Cost1) && (Cost2 != Cost1)) {
                    statement(MinCost, PaintName1, Labourcost);
                } else if (Cost2 != Cost1) {
                    statement(MinCost, PaintName2, Labourcost);

                } else {
                    System.out.println("Both paints cost the same amount, £" + MinCost + ", so either can be used. With a labour cost of £" +
                            Labourcost + " the total price is £" + (MinCost + Labourcost) + ".");
                }
                System.out.println("The job originally would have taken " + intTimeindaysforjob +
                        " day(s), however it rained for " + Rainydays + " day(s), so the job took " + realTimeindaysforjob + " days.");
                String result = ((MinCost + Labourcost) >= Budget) ? "This job is over budget." : "This job is under budget.";
                System.out.println(result);

                switch (Numberofcanswhole) {
                    case 1 -> System.out.println("Only one tin needed");
                    case 2, 3, 4, 5 -> System.out.println("A few tins needed");
                    case 6, 7, 8, 9, 10, 11, 12 -> System.out.println("Many tins needed");
                    default -> System.out.println("Something has gone wrong");

                }
                System.out.println("Do you want to do another quote?");
                again = myObj.nextLine();
            }

            else if (Objects.equals(Location, "interior")) {

                int Dimension;


                System.out.println("How many rooms do you want painted?:");
                int Roomnumber = myObj.nextInt();
                int[][] Rooms = new int[Roomnumber][3];
                for (int i =0; i<Roomnumber;i++){
                    for (int j = 0;j<3;j++){
                        if (j==0) {
                            System.out.println("For room "+ (i+1) + " enter length of room in meters.");
                            Dimension = myObj.nextInt();
                            Rooms[i][j] = Dimension;
                        }
                        else if (j==1) {
                            System.out.println("For room "+ (i+1) + " enter width of room in meters.");
                            Dimension = myObj.nextInt();
                            Rooms[i][j] = Dimension;
                        }
                        else{
                            System.out.println("For room "+ (i+1) + " enter height of room in meters.");
                            Dimension = myObj.nextInt();
                            Rooms[i][j] = Dimension;
                        }


                    }
                }
                int Surfacearea = 0;
                for (int i =0; i<Roomnumber; i++){
                    Surfacearea += (2*(Rooms[i][0] +Rooms[i][1])*Rooms[i][2]);
                }
                System.out.println("How many windows are there in the rooms in total?:");
                int Windownumber = myObj.nextInt();
                int Averagewindow = 2;

                System.out.println("How many doors are there in the rooms in total?:");
                int Doornumber = myObj.nextInt();
                int Averagedoor = 2;

                System.out.println("Enter budget:");
                int Budget = myObj.nextInt();
                int Surface_Area =  Surfacearea - (Averagewindow * Windownumber) - (Averagedoor * Doornumber);
                double Numberofcans = (double) (Surface_Area / PaintCoveragePerLitre) / Litrespercan;
                int Numberofcanswhole = (int) Math.ceil(Numberofcans);
                int Labourcostperday = 140;
                int Squaremetersperday = 100;
                int intTimeindaysforjob = (int) (Math.ceil(Surface_Area / Squaremetersperday));
                int Labourcost = intTimeindaysforjob * Labourcostperday;
                int Cost1 = Costpercan1 * Numberofcanswhole;
                int Cost2 = Costpercan2 * Numberofcanswhole;
                int MinCost = Math.min(Cost1, Cost2);

                System.out.println("The cost to decorate the rooms with " + PaintName1 + " is £" + Cost1 + ".");
                System.out.println("The cost to decorate the rooms with " + PaintName2 + " is £" + Cost2 + ".");

                if ((MinCost == Cost1) && (Cost2 != Cost1)) {
                    statement(MinCost, PaintName1, Labourcost);
                } else if (Cost2 != Cost1) {
                    statement(MinCost, PaintName2, Labourcost);
                } else {
                    System.out.println("Both paints cost the same amount, £" + MinCost + ", so either can be used. With a labour cost of £" +
                            Labourcost + " the total price is £" + (MinCost + Labourcost) + ".");
                }
                System.out.println("The job would take " + intTimeindaysforjob + " days to complete.");
                String result = ((MinCost + Labourcost) >= Budget) ? "This job is over budget." : "This job is under budget.";
                System.out.println(result);

                switch (Numberofcanswhole) {
                    case 1 -> System.out.println("Only one tin needed");
                    case 2, 3, 4, 5 -> System.out.println("A few tins needed");
                    case 6, 7, 8, 9, 10, 11, 12 -> System.out.println("Many tins of paint needed");
                    default -> System.out.println("Something has gone wrong");

                }System.out.println("Do you want to do another quote?");

            }else{
                System.out.println("Whoops!");
                System.out.println("Do you want to do another quote?");
            }
            again = myObj.next();
        }
        while (again.equals("yes"));
    }

}

