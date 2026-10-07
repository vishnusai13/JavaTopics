package Desktopallocation;

public class Lab extends Thread {

    String message;

    public Lab(String message) {
        this.message = message;
    }

    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.println(message + i);

            try {
                sleep(880);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println();
    }
}