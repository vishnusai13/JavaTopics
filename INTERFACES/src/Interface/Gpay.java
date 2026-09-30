package Interface;

public class Gpay implements Payments {

    @Override
    public void pay() {
        System.out.println("Gpay");
    }
}