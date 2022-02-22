package codeWar;


import java.util.Arrays;
import java.util.stream.IntStream;

public class AddAll {
    public static int addAll(final int[] numbers) {
        int cost = 0;
      for(int i: numbers){
          cost += i;
      }
        return cost;
    }
}
