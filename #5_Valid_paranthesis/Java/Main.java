public class Main {

    public static void main(String[] args) {
        ValidParenthesis validParenthesis = new ValidParenthesis();
        boolean isValid = validParenthesis.isValid("((([]})))");
        System.out.println("Is provided string valid? " + isValid);
    }

}
