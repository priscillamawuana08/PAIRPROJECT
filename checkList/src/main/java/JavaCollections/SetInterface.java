package JavaCollections;

import java.util.ArrayList;
import java.util.List;

public class Set {
    public List<Integer> SetOfIntegerReturnsListOfIntegers(java.util.Set<Integer> values){
        List<Integer> IntegerValues = new ArrayList<>();
        for(int i : values){
            IntegerValues.add(i);
        }
        return IntegerValues;
    }
}
