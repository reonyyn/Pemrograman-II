package praktikum.Soal1;

import praktikum.Dice;

import java.util.*;

public class Soal1Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rollAmount;
        do {
            while(!sc.hasNextInt()) {
                System.out.println("Invalid input, try again");
                sc.next();
            }
            rollAmount = sc.nextInt();
            if (rollAmount < 1) System.out.println("Invalid input, try again");
        }
        while (rollAmount < 1);

        LinkedList<Dice> diceList = new LinkedList<>();
        for (int i = 1; i <= rollAmount; i++) {
            Dice dice = new Dice();
            dice.randomizeNumber();
            diceList.add(dice);
        }

        int total = 0;
        for (int i = 0; i < diceList.size(); i++) {
            int roll = diceList.get(i).getRolledDice();
            System.out.println("Dadu ke-" + (i + 1) + " bernilai " + roll);
            total += roll;
        }
        System.out.println("Total nilai dadu keseluruhan " + total);

        sc.close();
    }
}