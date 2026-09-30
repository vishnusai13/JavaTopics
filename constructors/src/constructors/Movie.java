package constructors;

public class Movie {
	
	    String movieName;
	    int budget;

	    // Constructor
	     
	    Movie() {
	        movieName = "RRR";
	        budget = 500;
	    }

	    public void display() {
	        System.out.println("Movie Name: " + movieName);
	        System.out.println("Budget: " + budget);
	    }

	    public static void main(String[] args) {
	    	// Creating object
	        Movie m1 = new Movie();

	        // Calling method
	        m1.display();
	    }
	}


