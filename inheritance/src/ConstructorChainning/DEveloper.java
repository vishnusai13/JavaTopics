package ConstructorChainning;

public class DEveloper {

    int id = 19;
    int Pass = 1318;

    public DEveloper() {

        final String name = "vishnu";

        // name = "sai";
        // ERROR: The final local variable name cannot be reassigned

    }

    final void login() {
        System.out.println("Login method");
    }

    void login(int id) {
        System.out.println("Login with ID: " + id);
    }
    	void loginpass(int pass) {
    		System.out.println("Login with Pass: " + Pass);
    	}
    public static void main(String[] args) {

        DEveloper d = new DEveloper();

        d.login();
        d.login(19);
        d.loginpass(1318);
    }

}
