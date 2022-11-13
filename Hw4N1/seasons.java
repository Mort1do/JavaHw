package Hw4N1;

public class seasons {
    public enum Seasons{
        Summer(20, "Warm season"),
        Autumn(6, "Cold season"),
        Winter(-14, "Cold season"),
        Spring(4, "Cold season");

        private int temp;
        private String info;

        int gettemp() {
            return temp;
        }

        String getDescription(){
            return info;
        }

        Seasons(int temp, String info){
            this.temp = temp;
            this.info = info;
        }
    }
}
