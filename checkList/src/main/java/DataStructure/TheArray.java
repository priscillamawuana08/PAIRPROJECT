package DataStructure;

import java.util.Arrays;

public class TheArray {
    public static void main(String[] args){
        String[] names = new String[4];
        names[0] = "Sam";
        names[1] = "Leticia";
        names[2] = "Mike";
        names[3]= "Priscilla";


        System.out.println(Arrays.toString(names));
        names[1] = "Joe";

        System.out.println(Arrays.toString(names));
        System.out.println(names.length);
    }
}
