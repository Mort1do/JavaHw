package Hw4N2;

public class ClSize {
    public enum clsize{
        XXS(32, "Child size"),
        XS(34, "Adult size"),
        S(36, "Adult size"),
        M(38, "Adult size"),
        L(40, "Adult size");

        private int euros;
        private String info;

        int getEuros(){
            return euros;
        }

        String getDescription(){
            return info;
        }


        clsize(int euros, String info){
            this.euros = euros;
            this.info = info;
        }
    }
}
