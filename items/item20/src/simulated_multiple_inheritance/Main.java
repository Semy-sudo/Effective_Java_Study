package simulated_multiple_inheritance;

public class Main {
    public static void main(String[] args) {
        Vending coffeeVending = new CoffeeVending();
        Vending beverageVending = new BeverageVending();
        Vending snackVending = new SnackVending();

        coffeeVending.process();
        System.out.println();

        beverageVending.process();
        System.out.println();

        snackVending.process();
        
        //만약 여기서 
    }
} 