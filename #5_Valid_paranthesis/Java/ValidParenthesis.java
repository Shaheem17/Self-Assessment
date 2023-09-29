import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Stack;

public class ValidParenthesis {

    public boolean isValidInitialTry(String s) {

        Map<String, String> openingParenthesis = new HashMap<>();
        openingParenthesis.put("(", ")");
        openingParenthesis.put("{", "}");
        openingParenthesis.put("[", "]");

        List<String> expectedClosingParenthesis = new ArrayList<>();
        for(int index =0; index < s.length(); index++){
            if(openingParenthesis.containsKey(s.substring(index, index+1))){
                expectedClosingParenthesis.add(openingParenthesis.get(s.substring(index, index+1)));
            }else if(expectedClosingParenthesis.size() > 0 && Objects.equals(expectedClosingParenthesis.get(expectedClosingParenthesis.size() - 1), s.substring(index, index + 1))){
                expectedClosingParenthesis.remove(expectedClosingParenthesis.size()-1);
            }else{
                return false;
            }
        }
        return expectedClosingParenthesis.size() == 0;
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

}
