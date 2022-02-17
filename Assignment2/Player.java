package Assignment2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Player {

    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    class Checker implements Comparator<Player> {

        public int compare(Player a, Player b) {
            if (a.score == b.score) {
                return a.name.compareTo(b.name);
            }

            return ((Integer) b.score).compareTo(a.score);
        }
    }

    public static void main(String[] args) {

    }

}
