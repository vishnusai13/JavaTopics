
package ConstructorOverLoading;

public class Flipkart {

    // Default Constructor
    public Flipkart() {
        System.out.println("Default Constructor");
    }

    // Constructor 1
    Flipkart(String order) {
        System.out.println("Default - 3");
        new Flipkart("Mobile", 12);
    }

    // Constructor 2
    Flipkart(String order, int id) {
        System.out.println("Order: " + order + ", ID: " + id);
         new Flipkart("Mobile");
    }

    // Constructor 3
    Flipkart(int id, String order, double price) {
        System.out.println("ID: " + id + ", Order: " + order + ", Price: " + price);

        new Flipkart(12, "Mobile", 25000.0);
    }

    // Constructor 4
    Flipkart(int quantity, String order) {
        System.out.println("Quantity: " + quantity + ", Order: " + order);
        new Flipkart();
    }

    public static void main(String[] args) {

//        new Flipkart();
////
//        new Flipkart("Mobile");
//
//        new Flipkart("Mobile", 12);
//
//        new Flipkart(12, "Mobile", 25000.0);
//
//        new Flipkart(2, "Mobile");
//    
//}
}}


