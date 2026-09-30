
package Com.v1;

import java.util.Scanner;

public class PBS extends JNTUK {

    @Override
    void exam(int minimumInternals, String Syllabus, String Duration) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter External marks: ");
        int External = sc.nextInt();

        int total = minimumInternals + External;

        System.out.println("Total marks : " + total);
        System.out.println("Syllabus : " + Syllabus);
        System.out.println("Duration : " + Duration);
    }

    public static void main(String[] args) {

        PBS p = new PBS();

        p.exam(25, "Java Programming", "3 Hours");
    }}

