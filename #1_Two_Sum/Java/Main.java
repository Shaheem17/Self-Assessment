public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{-1, 21, 4, -8, 28};
        int target = 20;
        TwoSum twoSum = new TwoSum();
        int[] answer = twoSum.findAnswer(numbers, target);
        if(answer.length == 2){
            System.out.println("index of two numbers are " + answer[0] + " and " + answer[1]);
        }
    }
}
