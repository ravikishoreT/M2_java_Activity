public class ODImatch extends match {

    public ODImatch() {
        super();
        // TODO Auto-generated constructor stub

    }

    float calculateRunRate() {
        return ((getTarget() - getCurrentScore()) / (50 - getCurrentOver()));

    }

    float calculateBalls() {

        return 6 * (50 - getCurrentOver());
    }

    public void display() {
        System.out
                .println("Need " + (getTarget() - getCurrentScore()) + " runs in " + (int) calculateBalls() + " balls");
        System.out.println("Required Runrate: " + calculateRunRate());

    }
}