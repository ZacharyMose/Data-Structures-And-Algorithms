package Algorithms.Sorting;

import java.util.Arrays;

class ValidAnagram {
    public static boolean isAnagramSorting(String s, String t){
        // length check
         if (s.length() != t.length()){
            return false;
         }

         // convert string to char arrays
         char[] sArray = s.toCharArray();
         char[] tArray = t.toCharArray();

         // sort both arrays
         Arrays.sort(sArray);
         Arrays.sort(tArray);

         // compare sorted arrys
         return Arrays.equals(sArray, tArray);
    }

    public static void main(String[] args) {
        System.out.println(isAnagramSorting("listen","silent"));
    }
}
