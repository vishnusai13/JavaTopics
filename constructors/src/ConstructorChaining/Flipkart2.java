package ConstructorChaining;

public class Flipkart2 {

    // Default Constructor
    public Flipkart2() {
        System.out.println("Default Constructor");
    }

    // Constructor with Order
    Flipkart2(String order) {
        System.out.println("Order: " + order);
    }

    // Constructor with Order and ID
    Flipkart2(String order, int id) {
        System.out.println("Order: " + order);
        System.out.println("ID: " + id);
    }

    // Constructor with Quantity and Order
    Flipkart2(int quantity, String order) {

        // Constructor Chaining
        this(order);

        System.out.println("Quantity: " + quantity);
    }

    // Constructor with ID, Order and Price
    Flipkart2(int id, String order, double price) {

        // Constructor Chaining
        this(order, id);

        System.out.println("Price: " + price);
    }

    // Constructor with ID, Quantity, Order and Price
    Flipkart2(int id, int quantity, String order, double price) {

        // Constructor Chaining
        this(id, order, price);

        System.out.println("Quantity: " + quantity);
    }

    public static void main(String[] args) {

    // 1) Order
        new Flipkart2("Book");

        	System.out.println();

        	//2) Order and ID
        		new Flipkart2("Mobile", 101);

        			System.out.println();

        				//3)Quantity and Order
        					new Flipkart2(2, "Laptop");

        						System.out.println();

        					// 4)ID, Order and Price
        							new Flipkart2(102, "Mobile", 25000.0);

        								System.out.println();

        								//5) ID, Quantity, Order and Price
        										new Flipkart2(103, 3, "Laptop", 55000.0);
    
    }
    
}

