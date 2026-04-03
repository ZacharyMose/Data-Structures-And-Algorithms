import java.util.HashMap;

public class ValidAnagram {
    public static boolean isAnagramHashMap(String s, String t){
        if (s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> freq = new HashMap<>();

        // count the characters in s
        for (char c: s.toCharArray()){
            freq.put(c, freq.getOrDefault(c,0) + 1);
        }

        // subtract using t
        for (char c: t.toCharArray()){
            if (!freq.containsKey(c) ){
                return false;
            }
            freq.put(c, freq.get(c) - 1);

            // check all value are zero
            for (int count : freq.values()){
                if (count != 0){
                    return false;
                }
            }
        }
        return true;
    }
    
}
