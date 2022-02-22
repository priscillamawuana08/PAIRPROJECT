package codeWar;

//Complete the solution so that it splits the string into pairs of two characters.
// If the string contains an odd number of characters then it should replace the missing second character of the final pair with an underscore ('_').
public class StingSplit {
    public static String[] solution(String s) {
//        if (s.length()==0) return new String[0];

        // if n, then add an underscore to the end
        if (s.length()%2!=0) {
            s+="_";
        }

        // determine the space needed for the return array
        int spaceNeeded = s.length()/2;

        // create a new array to populate and return
        String[] out = new String[spaceNeeded];

        // create a builder index
        int j = 0;

        // loop through the input string
        for (int i=0; i<s.length(); i++) {

            // create a new string to build
            StringBuilder sb = new StringBuilder();
            // add the current item
            sb.append(s.charAt(i));
            // add the next item
            sb.append(s.charAt(i+1));

            // populate our output string as we go
            out[j] = sb.toString();

            // increment both counters
            i++;
            j++;
        }

        // return the built string
        return out;
    }
}
