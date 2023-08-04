public class Main {
    public static void main(String[] args) {
        Roman roman = new Roman();
        String romanString = "MCMXCIX";
        System.out.println("Integer for roman " + romanString + " is "+ roman.toIntegerEfficient(romanString));
    }
}
