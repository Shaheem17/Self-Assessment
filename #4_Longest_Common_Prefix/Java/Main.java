public class Main {
    public static void main(String[] args) {
        LCP lcp = new LCP();
        String[] strs = new String[]{"flower","flow","flight"};
        System.out.println("Longest common prefix is \"" + lcp.solution(strs) + "\"");
    }
}
