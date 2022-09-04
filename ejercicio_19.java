import java.util.Scanner;

public class ejercicio_19 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        double lado = valor.nextFloat();
        double h = (lado*Math.sqrt(3))/2 ;
        double area = (Math.sqrt(3)/4)*Math.pow(lado,2);
        System.out.print("El perimetro del triangulo es: \n"+(3*lado)+"\n");
        System.out.print("La altura del triangulo es: \n"+h+"\n");
        System.out.print("El Area del triangulo es: \n"+area);
    }
}
