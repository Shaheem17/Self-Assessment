import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] findAnswer(int[] numbers, int target){
        Map<Integer, Integer> numberMap = new HashMap<>();
        for(int index = 0; index < numbers.length; index++){
            int difference = target - numbers[index];
            if(numberMap.containsKey(difference)){
                return new int[]{numberMap.get(difference), index};
            }
            numberMap.put(numbers[index], index);
        }
        return new int[]{};
    }

}
