class DeluxeSeaViewroom extends Deluxe {
    private int ratepersqfeets = 12;

    DeluxeSeaViewroom() {
    }

    DeluxeSeaViewroom(int ratepersqfeets) {
        this.ratepersqfeets = 12;
    }

    public void setRatepersqfeets(int sq1) {
        this.ratepersqfeets = sq1;
    }

    public int getRatepersqfeets() {
        return this.ratepersqfeets;
    }

    public int display11(int a) {
        // System.out.println("Room has Wifi");
        if (a == 1) {
            // System.out.println(ratepersqfeet);
            a = ratepersqfeets + 2;

            return a;
        } else {
            a = ratepersqfeets;
            return a;
        }
    }
}