package Ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Número de inscripción:");

        int inscripcion = myObj.nextInt();
        System.out.println("Nombre:");
        String nombre = myObj.next();
        System.out.println("Patrimonio:");
        int patrimonio = myObj.nextInt();
        System.out.println("Estrato social:");
        int estrato = myObj.nextInt();
        int matricula = 50000;

        if ((patrimonio > 2000000) && (estrato > 3)) {
            matricula += patrimonio * (0.03);
        }

        System.out.printf("El estudiante con número de inscripción %d, y nombre %s debe pagar %d", inscripcion, nombre, matricula);
    }
}
