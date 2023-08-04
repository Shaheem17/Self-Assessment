import java.util.HashMap;
import java.util.Map;

public class Roman {

    public int toInteger(String s){
        Map<String, Integer> romanMapping = new HashMap<>();
        romanMapping.put("I", 1);
        romanMapping.put("V", 5);
        romanMapping.put("X", 10);
        romanMapping.put("L", 50);
        romanMapping.put("C", 100);
        romanMapping.put("D", 500);
        romanMapping.put("M", 1000);

        Map<String, Integer> romanSubtraction = new HashMap<>();
        romanSubtraction.put("IV", 4);
        romanSubtraction.put("IX", 9);
        romanSubtraction.put("XL", 40);
        romanSubtraction.put("XC", 90);
        romanSubtraction.put("CD", 400);
        romanSubtraction.put("CM", 900);

        int value = 0;
        int stringLength = s.length();

        for(int index = 0; index < stringLength; index++){
            if(index+2 <= stringLength && romanSubtraction.containsKey(s.substring(index,index+2))){
                value += romanSubtraction.get(s.substring(index,index+2));
                index++;
            }else{
                value += romanMapping.get(s.substring(index,index+1));
            }
        }
        return value;
    }

    public int toIntegerEfficient(String s){
        int res = 0, num = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'I' -> num = 1;
                case 'V' -> num = 5;
                case 'X' -> num = 10;
                case 'L' -> num = 50;
                case 'C' -> num = 100;
                case 'D' -> num = 500;
                case 'M' -> num = 1000;
            }

            if (4 * num < res) {
                res -= num;
            } else {
                res += num;
            }
        }
        return res;
    }

}
