package Ejercicios;
import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nombre:");
        String nombre = myObj.next();
        System.out.println("Número de horas trabajadas:");
        int trabajado= myObj.nextInt();
        System.out.println("Valor de las horas de trabajo:");
        int valorhoras = myObj.nextInt();
        int salario = 0;
        if (trabajado>40) {
            int horasextras = trabajado - 40;
            if (horasextras > 8){
                int excedente = horasextras - 8;
                salario = (40 * valorhoras) + (16 * valorhoras) + (excedente * 3 * valorhoras);
                }
            else {
                salario = 40 * valorhoras + horasextras * 2 * valorhoras;
            }
        }
        else {
            salario = trabajado * valorhoras;
        }
        System.out.println( "El trabajador " + nombre + " gana: $" + salario );
    }
}
