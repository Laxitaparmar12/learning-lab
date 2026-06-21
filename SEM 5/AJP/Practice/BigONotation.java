import java.util.Scanner;

public class BigONotation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter degree of polynomial: ");
        int degree = sc.nextInt();

        System.out.print("Enter leading coefficient: ");
        int coefficient = sc.nextInt();

        System.out.println("\nPolynomial Information");
        System.out.println("----------------------");
        System.out.println("Degree = " + degree);
        System.out.println("Leading Coefficient = " + coefficient);

        System.out.println("\nBig Oh Notation      : n raised to power " + degree);
        System.out.println("Big Omega Notation   : n raised to power " + degree);
    }
}