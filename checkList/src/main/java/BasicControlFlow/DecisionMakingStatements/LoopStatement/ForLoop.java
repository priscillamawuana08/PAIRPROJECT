package BasicControlFlow.DecisionMakingStatements.LoopStatement;

import java.util.ArrayList;

public class ForLoop {
    public static void main(String[] args) {
        ArrayList<Integer> Bag = new ArrayList<>();
        ArrayList<Integer> newBag = new ArrayList<>();
        Bag.add(1);
        Bag.add(2);
        Bag.add(3);
        Bag.add(4);
        Bag.add(5);

//        add one to each item in the bag
        for(int i=0; i < Bag.size();i++){
            newBag.add(Bag.get(i) + 1);
        }

            System.out.println(newBag);

        int[] intArray = {1,2,3,4,5,1};
         intArray[4] = 50;
         for(int a=0; a < intArray.length; a++){
             System.out.println(intArray[a]);
         }

    }
}
