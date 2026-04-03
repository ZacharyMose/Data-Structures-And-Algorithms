package Hashset;

import java.util.HashSet;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums){
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums){
            if (set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate cd = new ContainsDuplicate();
        int[] test1 = {1,2,3,1};
        int[] test2 = {1,2,3,4};
        int[] test3 = {1,1,1,3,3,4,3,2,4,2};

        System.out.println(cd.containsDuplicate(test1)); // true
        System.out.println(cd.containsDuplicate(test2)); // false
        System.out.println(cd.containsDuplicate(test3)); // true
    }
}
