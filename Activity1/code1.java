import java.io.*;
import java.util.*;
import java.util.Scanner;

public class code1 {

    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String X = sc.next();
        System.out.println("Enter last name: ");
        String Y = sc.next();

        int len_M = X.length();
        int len_N = Y.length();
        System.out.println((("Output: " + X.substring(0, 1)).toUpperCase() + (X.substring(1, len_M).toLowerCase()))
                + " " + ((Y.toUpperCase())));
    }
}
