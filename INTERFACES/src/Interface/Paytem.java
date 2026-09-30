package Interface;

public class Paytem implements Payments {

    @Override
    public void pay() {
        System.out.println("Payments : Paytm");
    }
}