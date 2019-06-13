package exercises;

import java.util.Scanner;

public class Mpg {
    public static void main (String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        Integer milesDriven = myObj.nextInt();
        Scanner myObj2 = new Scanner(System.in);
        System.out.println("How many gallons of gas have you used?");
        Float gallonsUsed = myObj2.nextFloat();

        Float mPg = milesDriven / gallonsUsed;

        System.out.println("You are averaging " + mPg + " miles per gallon.");

    }
}
