import java.util.Scanner;

public class ejercicio_23 {
    public static void main(String[] args) {
        Scanner Ecuacion= new Scanner(System.in);
            System.out.println("Ingrese El valor A de la ecuacion:");
            int A = Ecuacion.nextInt();
            System.out.println("Ingrese El valor B de la ecuacion:");
            int B = Ecuacion.nextInt();
            System.out.println("Ingrese El valor C de la ecuacion:");
            int C = Ecuacion.nextInt();
            double resultado1=((-B+Math.sqrt((B*B)-4*A*C))/(2*A));
            double resultado2=((-B-Math.sqrt((B*B)-4*A*C))/(2*A));
       System.out.println("Las posibles Soluciones(Raices) de la ecuacion de grado 2 es: \n"+"1:"+resultado1+"\n2:"+resultado2);
    }
}
