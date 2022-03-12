import java.io.*;
import java.util.*;

class Hotelroom {
    private String hotelName;
    private int numberOfSqFeet;
    private boolean hasTV;
    private boolean hasWifi;

    Hotelroom() {
    }

    public Hotelroom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
        this.hotelName = hotelName;
        this.numberOfSqFeet = numberOfSqFeet;
        hasTV = hasTV;
        hasWifi = hasWifi;
    }

    public void setHotelName(String hotel) {
        this.hotelName = hotel;
    }

    public String getHotelName() {
        return this.hotelName;
    }

    public void setNumberOfSqFeet(int n) {
        this.numberOfSqFeet = n;
    }

    public int getNumberOfSqFeet() {
        return this.numberOfSqFeet;
    }

    public void setHasTV(boolean b1) {
        hasTV = b1;
    }

    public boolean getHasTV() {
        return hasTV;
    }

    public void setHasWifi(boolean b2) {
        hasWifi = b2;
    }

    public boolean getHasWifi() {
        return hasWifi;
    }
    // System.out.println(numberOfSqFeet);

    public void display(int n) {

        System.out.println("Room Traffic per Day is");
        // System.out.println(n);
        numberOfSqFeet = n * numberOfSqFeet;
        System.out.println(numberOfSqFeet);

    }
}