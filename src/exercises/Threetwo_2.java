package exercises;

public class Threetwo_2 {

    public static void main(String[] args) {

        // declare / define list of words
        String[] wordList = {"cat", "maven", "soda", "jelly", "cramp"};

        // loop through each word in list
        for (String thing : wordList) {

        // test if word is 5 characters
        if (thing.length() == 5) {
            System.out.println(thing);

        }

        }

    }
}
