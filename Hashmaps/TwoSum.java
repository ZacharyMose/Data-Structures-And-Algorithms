import java.util.HashMap;

class TwoSum{
    public int[] twoSumBruteForce(int[] nums,int target){
       for(int i = 0; i < nums.length; i++){
        for (int j = i +1; j < nums.length; j++){
            if (nums[i] + nums[j] == target){
                return new int[]{i,j};
            }
        }
       }
         return new int[]{-1,-1};
     }

     public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] nums = {2,7,11,15};
        int target = 18;
        int[] result = twoSum.twoSumBruteForce(nums, target);
        System.out.println("Indices: [" + result[0] + "," + result[1] + "]");
     }

     public int[] twoSumHashMap(int[] nums, int target){
        // key = number, value = index
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }

            map.put(nums[i], i);
        }
        return new int[]{-1,-1};
     }
}