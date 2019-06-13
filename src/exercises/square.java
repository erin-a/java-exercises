package exercises;

import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("What is the rectangle height?");
        Integer rectHeight = myObj.nextInt();
        System.out.println("What is the rectangle width?");
        Integer rectWidth = myObj.nextInt();
        Integer rectArea = rectHeight * rectWidth;

        System.out.println("Area of rectangle: " + rectArea);

    }
}
