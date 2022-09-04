package Ejercicios;
import java.util.Scanner;
class Ejercicio7 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Ingresar el valor de A:");
        int A = myObj.nextInt();
        System.out.println("Ingresar el valor de B:");
        int B = myObj.nextInt();
        if (A>B) {
            System.out.println("A es mayor que B");
        }
        else if (A==B) {
            System.out.println("A es igual que B");
        }
        else {
            System.out.println("A es menor que B");
        }
    }
}
