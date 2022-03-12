class Suiteroom extends Hotelroom {

    private int ratepersqfeet = 15;

    Suiteroom() {
    }

    Suiteroom(int ratepersqfeet) {
        this.ratepersqfeet = 15;
    }

    public void setRatepersqfeet(int sq) {
        this.ratepersqfeet = sq;
    }

    public int getRatepersqfeet() {
        return this.ratepersqfeet;
    }

    public int display123(int a) {
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