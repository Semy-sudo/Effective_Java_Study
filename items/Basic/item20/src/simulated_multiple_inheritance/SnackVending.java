package simulated_multiple_inheritance;
//문제점1. 이미 구현된 추상골격클래스가 있는데 다중 상속을 받아야 할때
//VendingManufacturer 을 상속받아야 해서 Vending 의 공통 부분을 추상 골격구현으로 확장할수 없는 상황일때

//문제점2. 다중상속을 받도록 내부 클래스의 인스턴스에 전달하여 우회적으로 사용하는 방법을 취했는데
//클래스를 하나 더 상속해야 할때
public class SnackVending extends VendingManufacturer implements Vending {
    InnerAbstractVending innerAbstractVending = new InnerAbstractVending();
   
    @Override
    public void start() {
        innerAbstractVending.start();
    }

    @Override
    public void chooseProduct() {
        innerAbstractVending.chooseProduct();
    }

    @Override
    public void stop() {
        innerAbstractVending.stop();
    }

    @Override
    public void process() {
        printManufacturerName();
        innerAbstractVending.process();
    }
    //해결책.
    //시뮬레이트한 다중상속: 
    //골격 구현 클래스를 우회적으로 이용
    //내부 클래스의 인스턴스에 전달하여 우회적으로 사용
    private class InnerAbstractVending extends AbstractVending {

        @Override
        public void chooseProduct() {
            System.out.println("choose product");
            System.out.println("chocolate");
            System.out.println("cracker");
        }

    }
}