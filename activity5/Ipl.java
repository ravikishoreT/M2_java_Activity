package ipl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ipl {

    public static void main(String[] args) {
        ArrayList<String> pl = new ArrayList<String>();

        pl.add("Sunrisers Hyderabad");
        pl.add("Delhi Capitals");
        pl.add("Royal Challengers Bangalore");
        pl.add("Kolkata Knight Riders");
        pl.add("Mumbai indins");

        for (String i : pl) {
            System.out.println(i);
        }
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num1 = sc.nextInt();

        Collections.swap(pl, num, num1);
        System.out.println(pl);

        // TODO Auto-generated method stub
    }

}