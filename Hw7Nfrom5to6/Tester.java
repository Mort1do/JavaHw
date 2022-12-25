package Hw7Nfrom5to6;

public class Tester {
    public static void main(String[] args) {
        ProcessString ps = new ProcessString();
        String str = "Hello!";
        System.out.println(ps.countSymbols(str));
        System.out.println(ps.oddString(str));
        System.out.println(ps.reverse(str));
    }
}
