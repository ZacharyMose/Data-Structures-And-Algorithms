import java.util.ArrayDeque;
import java.util.Deque;

class ValidParenthesis{
    public boolean isValid(String s){
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()){
            // if opening bracket, push to stack
            if (c == '(' || c == '{' || c == '['){
                stack.push(c);
            }
            else{
                if (stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();

                // check if matching pair
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')){
                        return false;
                    }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParenthesis vp = new ValidParenthesis();
        String test1 = "()";
        String test2 = "()[]{}";
        String test3 = "(]";
        String test4 = "([)]";
        String test5 = "{[]}";

        System.out.println(vp.isValid(test1)); // true
        System.out.println(vp.isValid(test2)); // true
        System.out.println(vp.isValid(test3)); // false
        System.out.println(vp.isValid(test4)); // false
        System.out.println(vp.isValid(test5)); // true
    }
}