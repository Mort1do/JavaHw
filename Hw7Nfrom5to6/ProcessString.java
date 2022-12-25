package Hw7Nfrom5to6;

public class ProcessString implements Str{
    @Override
    public int countSymbols(String str) {
        return str.toCharArray().length;
    }

    @Override
    public String oddString(String str) {
        StringBuilder new_str = new StringBuilder();
        for(int i = 1; i < countSymbols(str); i += 2){
            new_str.append(str.charAt(i));
        }
        return new_str.toString();
    }

    @Override
    public String reverse(String str) {
        StringBuilder new_str = new StringBuilder();
        for(int i = countSymbols(str) - 1; i >= 0; i--){
            new_str.append(str.charAt(i));
        }
        return new_str.toString();
    }

}
