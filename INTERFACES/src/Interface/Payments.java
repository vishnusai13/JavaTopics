package Interface;

interface Payments {

    void pay();

    default void cgst() {
        System.out.println("CGST");
    }

    static void sgst() {
        System.out.println("SGST");
    }
}