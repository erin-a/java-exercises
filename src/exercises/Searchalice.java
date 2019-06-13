package exercises;

import java.util.Scanner;
import java.io.*;
import java.lang.*;



public class Searchalice {
    public static void main (String[] args) {
        String aliceExcerpt = "Alice was beginning to get very tired of sitting " +
                "by her sister on the bank, and of having nothing to do: once" +
                " or twice she had peeped into the book her sister was reading," +
                " but it had no pictures or conversations in it, 'and what is the " +
                "use of a book,' thought Alice 'without pictures or conversation?'";

        Scanner myObj = new Scanner(System.in);
        System.out.println("What word are you looking for");
        CharSequence searchWord =  myObj.next();

        boolean bool = aliceExcerpt.contains(searchWord);
        System.out.println("Found '" + searchWord + "' in excerpt? " + bool);


    }

}
