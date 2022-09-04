package Ejercicios;
import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Primer valor:");
        int A = myObj.nextInt();
        System.out.println("Segundo valor:");
        int B = myObj.nextInt();
        System.out.println("Tercer valor:");
        int C = myObj.nextInt();

        int max = C;
        if (A > B && A > C) {
            max = A;
        } else if (B > C && B > A) {
            max = B;
        }

        System.out.println(max + " es el número mayor");
    }
}
