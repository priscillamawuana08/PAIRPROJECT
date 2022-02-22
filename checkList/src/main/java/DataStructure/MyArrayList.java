package DataStructure;

import java.util.ArrayList;

public class MyArrayList {
    public static void main(String[] args) {


        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(0,"Sam");
        arrayList.add(1,"Leticia");
        arrayList.add(2,"Mike");
        arrayList.add(3,"Priscilla");
        arrayList.add(4,"Christy");
        arrayList.add(5,"Victor");
        arrayList.add(6,"Priscilla");
        arrayList.add(7,"Bright");
        arrayList.add(8,"Eduji");
        arrayList.add(9,"Timothy");
        arrayList.add(10,"Jessica");

        System.out.println(arrayList);
        final long startTimeAL = System.nanoTime();
        arrayList.get(6);
        final long endTimeAL = System.nanoTime();
        long totalTime = endTimeAL - startTimeAL;

        System.out.println("The totalTime is:" + " " +totalTime);

    }
}
