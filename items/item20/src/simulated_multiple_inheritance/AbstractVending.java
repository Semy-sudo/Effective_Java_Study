package simulated_multiple_inheritance;

public abstract class AbstractVending implements Vending {
    @Override
    public void start() {
        System.out.println("vending start");
    }

    @Override
    public void stop() {
        System.out.println("stop vending");
    }

    @Override
    public void process() {
        start();
        chooseProduct();
        stop();
    }
}
