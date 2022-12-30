package string.problems;

import java.util.HashMap;
import java.util.Map;

public class DetermineLargestWord {
//    public static void main(String[] args) {
//        /*
//         Implement to Find the length and longest word in the given sentence below.
//         Should return "10 biological".
//         */
//        String s="Human brain is a biological learning machine";
//        Map<Integer, String> wordNLength = findTheLargestWord(s);
//        //implement
//
//    }
//
//    public static Map<Integer, String> findTheLargestWord(String wordGiven){
//        Map<Integer, String> map = new HashMap<Integer, String>();
//        String st = "";
//        //implement
//
//        return map;
//    }

    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s ="Human brain is a biological learning machine";

        HashMap<Integer, String> wordLengths = new HashMap<>();
        for (String word : s.split(" ")) {
            wordLengths.put(word.length(), word);

        }
        String longestWord = "";
        for (Map.Entry<Integer, String> entry : wordLengths.entrySet()) {
            if (entry.getKey() > longestWord.length()) {
                longestWord = entry.getValue();
            }


        }
        //ANSWER:
        System.out.println(longestWord.length() +" "+ longestWord);






        }



    public static Map<Integer, String> findTheLargestWord(String wordGiven){
        Map<Integer, String> map = new HashMap<Integer, String>();
        String st = "";
        String[] words = wordGiven.split("\\s+");
        //implement
        for (String word : words) {
            map.put(word.length(), word);
        }
        return map;
    }
}
