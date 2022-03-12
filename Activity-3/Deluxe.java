class Deluxe extends Hotelroom {

    private int ratepersqfeet = 10;

    Deluxe() {
    }

    Deluxe(int ratepersqfeet) {
        this.ratepersqfeet = 10;
    }

    // Hotelroom h1=new Hotelroom();
    // Deluxe d1 = new Deluxe();
    // Boolean b1= new Boolean(true);
    public void setRatepersqfeet(int sq) {
        this.ratepersqfeet = sq;
    }

    public int getRatepersqfeet() {
        return this.ratepersqfeet;
    }

    // int a=0;
    public int display1(int a) {
        // System.out.println("Room has Wifi");
        if (a == 1) {
            // System.out.println(ratepersqfeet);
            a = ratepersqfeet + 2;

            return a;
        } else {
            a = ratepersqfeet;
            return a;
        }

    }
}