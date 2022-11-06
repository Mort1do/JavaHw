package Hw2N9;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Poker {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Random rnd = new Random();
        ArrayList<Card> deck= new ArrayList<Card>(52);

            for(int i = 1; i < 56; i++){
                if(i/14 == 0){
                    deck.add(new Card(i%14+1,"spades"));
                }
                else if(i/14 == 1){
                    if(i%14 == 0){
                        i++;
                    }
                    deck.add(new Card(i%14+1,"hearts"));
                }
                else if(i/14 == 2){
                    if(i%14 == 0){
                        i++;
                    }
                    deck.add(new Card(i%14+1,"clubs"));
                }
                else{
                    if(i%14 == 0){
                        i++;
                    }
                    deck.add(new Card(i%14+1,"diamonds"));
                }
            }

        for(int i = 0; i < 1000; i++){
            int rn1 = rnd.nextInt(52);
            int rn2 = rnd.nextInt(52);
            Card cash = deck.get(rn1);
            deck.set(rn1, deck.get(rn2));
            deck.set(rn2, cash);
        }
        //System.out.println(deck.toString());

        int num_players = cin.nextInt();
        for(int i = 0; i < num_players; i++){
            System.out.println("Player " + (i+1) + ':');
            int z = i + 1;
            int n = 0;
            for(int u = i * 5; u < z * 5; u++){
                n++;
                System.out.println("Card " + n + ": " + deck.get(u));
            }
        }
    }

    //public static int re(Card cd) {
    //    return cd.getNum();
    //}
}
