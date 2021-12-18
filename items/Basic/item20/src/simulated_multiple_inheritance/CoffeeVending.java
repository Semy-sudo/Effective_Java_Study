package simulated_multiple_inheritance;
public class CoffeeVending extends AbstractVending implements Vending {
    @Override
    public void chooseProduct() {
        System.out.println("choose menu");
        System.out.println("americano");
        System.out.println("cafe latte");
    }
}