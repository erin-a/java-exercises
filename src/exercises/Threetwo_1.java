package exercises;

import java.util.ArrayList;

public class Threetwo_1 {

    public static void main(String[] args) {

        int[] someList = {1, 2, 3, 2, 4, 5, 6, 7, 8, 10, 11};
        int total = 0;

        for (int thing : someList) {

            if  (thing % 2 == 0){
                total += thing;
            }
        }

        System.out.println(total);
    }

}
