package Interface;

public interface Amazon {

    void pay();

    default void cgst() {
        System.out.println("GST");
    }

    static void sgst() {
        System.out.println("GST");
    }
}