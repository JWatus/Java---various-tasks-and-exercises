package com.company.bingo;

public class BingoCard {
    public static String[] getCard() {

        String[] bingoTab = new String[24];

        for (int i = 0; i < 5; i++) {
            bingoTab[i] = "B" + String.valueOf((int)(Math.random() * 15 + 1));
            for (int j = 0; j < i; j++) {
                if (!(bingoTab[i].equals(bingoTab[j]))) {
                    continue;
                } else {
                    bingoTab[i] = "B" + String.valueOf((int)(Math.random() * 15 + 1));
                    j = 0;
                }
            }
        }

        for (int i = 5; i < 10; i++) {
            bingoTab[i] = "I" + String.valueOf((int)((Math.random() * 15 + 1) + 15));
            for (int j = 0; j < i; j++) {
                if (!(bingoTab[i].equals(bingoTab[j]))) {
                    continue;
                } else {
                    bingoTab[i] = "I" + String.valueOf((int)((Math.random() * 15 + 1) + 15));
                    j = 0;
                }
            }
        }

        for (int i = 10; i < 14; i++) {
            bingoTab[i] = "N" + String.valueOf((int)((Math.random() * 15 + 1) + 30));
            for (int j = 0; j < i; j++) {
                if (!(bingoTab[i].equals(bingoTab[j]))) {
                    continue;
                } else {
                    bingoTab[i] = "N" + String.valueOf((int)((Math.random() * 15 + 1) + 30));
                    j = 0;
                }
            }
        }

        for (int i = 14; i < 19; i++) {
            bingoTab[i] = "G" + String.valueOf((int)((Math.random() * 15 + 1) + 45));
            for (int j = 0; j < i; j++) {
                if (!(bingoTab[i].equals(bingoTab[j]))) {
                    continue;
                } else {
                    bingoTab[i] = "G" + String.valueOf((int)((Math.random() * 15 + 1) + 45));
                    j = 0;
                }
            }
        }

        for (int i = 19; i < 24; i++) {
            bingoTab[i] = "O" + String.valueOf((int)((Math.random() * 15 + 1) + 60));
            for (int j = 0; j < i; j++) {
                if (!(bingoTab[i].equals(bingoTab[j]))) {
                    continue;
                } else {
                    bingoTab[i] = "O" + String.valueOf((int)((Math.random() * 15 + 1) + 60));
                    j = 0;
                }
            }
        }

        return bingoTab;
    }
}

/*
    After yet another dispute on their game the Bingo Association decides to change course and automize the game.

        Can you help the association by writing a method to create a random Bingo card?

        Task:

        Finish method:
        BingoCard.getCard()
        A Bingo card contains 24 unique and random numbers according to this scheme:
        5 numbers from the B column in the range 1 to 15
        5 numbers from the I column in the range 16 to 30
        4 numbers from the N column in the range 31 to 45
        5 numbers from the G column in the range 46 to 60
        5 numbers from the O column in the range 61 to 75

        The card must be returned as an array of Bingo style numbers:
        { "B14", "B12", "B5", "B6", "B3", "I28", "I27", ... }
        The numbers must be in the order of their column: B, I, N, G, O. Within the columns the order of the numbers is random.*/

/*
import java.util.*;

public class BingoCard {
    private static String[] res;
    private static int counter;

    public static String[] getCard() {
        counter = 0;
        res = new String[24];
        getRow( 1,15,5,"B");
        getRow(16,30,5,"I");
        getRow(31,45,4,"N");
        getRow(46,60,5,"G");
        getRow(61,75,5,"O");
        return res;
    }

    private static void getRow(int b, int e, int n, String l) {
        ArrayList<Integer> row = new ArrayList<Integer>();
        for (int i = b; i <= e; i++) row.add(new Integer(i));
        Collections.shuffle(row);
        for (int i = 0; i < n; i++) res[counter++] = l + Integer.toString(row.get(i));
    }
}*/
