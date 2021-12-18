package simulated_multiple_inheritance;
public class BeverageVending extends AbstractVending implements Vending {
    @Override
    public void chooseProduct() {
        System.out.println("choose menu");
        System.out.println("coke");
        System.out.println("energy drink");
    }
}