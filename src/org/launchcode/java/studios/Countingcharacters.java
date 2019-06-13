package org.launchcode.java.studios;

import java.lang.*;

public class Countingcharacters {

    public static void main(String[] args) {

        // define searchable text
        String searchableText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                "Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue." +
                " Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit " +
                "metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, " +
                "volutpat eget massa. Donec nec velit non ligula efficitur luctus.";

        // convert string into an array of characters
        char[] charactersInString = searchableText.toCharArray();

        // define character you're searching for
        char searchingFor = 'a';

        // define variable for total count
        int totalFound = 0;

        // loop through searchable text, if match, then total + 1
        for (char i : charactersInString) {
            if (i == searchingFor) {
                ++totalFound;

            }

        }
        System.out.println(totalFound);
    }
}
