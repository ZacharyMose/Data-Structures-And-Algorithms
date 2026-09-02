import com.sun.source.doctree.SeeTree;

import java.util.HashSet;
import java.util.Set;

public class ContainsDulplicate {
     static boolean checkDuplicates(int[] arr){
          int n =  arr.length;

          // outer loop to pick each element one by one
          for(int i = 0; i < n; i++){
               // inner loop to compare the current element
               // with the rest of the elements
               for (int j = i+1; j < n; j++){
                    // if duplicate is found return true
                    if (arr[i] == arr[j]){
                         return true;
                    }
               }
          }
          // if no duplicates found return false
          return false;
     }


     static boolean containsDuplicates(int[] arr){
          int n =  arr.length;

          Set<Integer> st = new HashSet<>();
          // Iterate through each element
          for(int i = 0; i < n; i++){
               // If element is already present return true
               // Else insert the element into the set
               if (st.contains(arr[i])){
                    return true;
               } else {
                    st.add(arr[i]);
               }
          }
          return false;
     }

     public static void main(String[] args) {

          int[] arr = {1,2,3,3,4,5};
          System.out.println(containsDuplicates(arr));


     }
}
