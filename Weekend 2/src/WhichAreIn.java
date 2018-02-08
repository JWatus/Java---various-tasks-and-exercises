import java.util.*;

public class WhichAreIn {

    public static String[] inArray(String[] a, String[] b) {

        Set<String> commonElements = new TreeSet<>();

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < b.length; j++) {

                if (b[j].contains(a[i])) {

                        commonElements.add(a[i]);
                }
            }
        }

        String[] actualValue = commonElements.toArray(new String[commonElements.size()]);

        System.out.println(actualValue.toString());

        return actualValue;

    }
}

//      Given two arrays of strings a1 and a2 return a sorted array r in lexicographical order of the strings
//      of a1 which are substrings of strings of a2.
//
//        #Example 1: a1 = ["arp", "live", "strong"]
//
//        a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
//
//        returns ["arp", "live", "strong"]
//
//        #Example 2: a1 = ["tarp", "mice", "bull"]
//
//        a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
//
//        returns []