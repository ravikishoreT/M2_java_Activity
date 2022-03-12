import java.io.*;
import java.lang.*;
import java.util.*;

// Class 1

class Player {
    int runs;
    String name;

    // Constructor
    public Player(int runs, String name) {

        this.runs = runs;
        this.name = name;

    }

    public String toString() {
        return this.runs + " " + this.name;
    }
}

// Class 2

class Sortbyrun implements Comparator<Player> {

    public int compare(Player a, Player b) {
        return a.runs - b.runs;
    }
}

// Main class
class Main {

    public static void main(String[] args) {
        Player[] arr = { new Player(400, "virat"),
                new Player(352, "rohit"),
                new Player(200, "dhoni") };

        System.out.println("Unsorted");

        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);

        Arrays.sort(arr, new Sortbyrun());

        System.out.println("\nSorted by runs");

        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }
}