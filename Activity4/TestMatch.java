public class Testmatch extends match {

    public Testmatch() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    float calculateRunRate() {
        return ((getTarget() - getCurrentScore()) / (90 - getCurrentOver()));
    }

    @Override
    float calculateBalls() {
        // TODO Auto-generated method stub
        return 6 * (90 - getCurrentOver());
    }

    public void display() {
        System.out
                .println("Need " + (getTarget() - getCurrentScore()) + " runs in " + (int) calculateBalls() + " balls");
        System.out.println("Required Runrate: " + calculateRunRate());

    }
}