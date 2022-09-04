import java.util.Scanner;

public class ejercicio_22 {
    public static void main(String[] args) {
        Scanner usuario= new Scanner(System.in);
        System.out.println("Ingrese Nombre:");
        String nombre = usuario.next();
        System.out.println("Salario Basico/Hora:");
        int salario= usuario.nextInt();
        System.out.println("Numero de horas trabajadas en el ultimo mes:");
        int horas = usuario.nextInt();
        if ((salario*horas)>=450000) {
            System.out.println("Su nombre es: " + nombre+"\n y su salario es: "+(salario*horas));
        }
        else {
            System.out.println("Su nombre es: " + nombre);
        }
    }
}
