package DataStructure;

import java.util.ArrayList;


public class LinkedMyList {
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



       java.util.LinkedList<String> linkedList = new java.util.LinkedList<>();
       linkedList.add(0,"Sam");
       linkedList.add(1,"Leticia");
       linkedList.add(2,"Leticia");
       linkedList.add(3,"Leticia");
       linkedList.add(4,"Leticia");
       linkedList.add(5,"Leticia");
       linkedList.add(6,"Leticia");
       linkedList.add(7,"Leticia");
       linkedList.add(8,"Leticia");
       linkedList.add(9,"Leticia");
       linkedList.add(10,"Leticia");

        System.out.println(arrayList);
        final long startTimeAL = System.nanoTime();
        arrayList.get(6);
        final long endTimeAL = System.nanoTime();

        System.out.println(linkedList);
        final long startTimeLL = System.nanoTime();
        linkedList.get(6);
        final long endTimeLL = System.nanoTime();



        long totalTimeAL = endTimeAL - startTimeAL;
       long totalTimeLL = endTimeLL- startTimeLL;

        System.out.println("The totalTimeAL is:" + " " +totalTimeAL);
        System.out.println("The totalTimeLL is:" + " " +totalTimeLL);
        System.out.println();
    }
}
