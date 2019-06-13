package org.launchcode.java.studios;

import java.util.Scanner;
import java.lang.Float;
import java.text.DecimalFormat;

public class Area_Bonus2 {
    public static void main(String[] args) {

        DecimalFormat numberFormat = new DecimalFormat("#.000");
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the radius of your circle (round decimals to the nearest hundredth).");
        Float cirleRadius = myObj.nextFloat();
        while (cirleRadius > 0);
            double circleArea = Math.PI * cirleRadius * cirleRadius;
                System.out.println("Area of your circle: " + (numberFormat.format(circleArea)));

    }
}