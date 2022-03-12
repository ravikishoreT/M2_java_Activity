import java.util.Scanner;

public class Match {

    public static void main(String[] args) {

        Scanner S = new Scanner(System.in);

        System.out.println("Enter the team name:");
        String teamname = S.nextLine();

        System.out.println("Enter inning: ");
        String innname = S.nextLine();

        System.out.println("Enter runs: ");
        int runs = S.nextInt();

        System.out.println("Name: " + teamname);
        System.out.println("Scored: " + runs);
        // System.out.println("")

        if (innname.equals("first")) {

            runs = runs + 1;
            System.out.println("Needed run to win: " + runs);

        } else if (innname.equals("second")) {
            System.out.println("Match Ended");
        } else {
            System.out.println("Invalid input");
        }

    }

}