import java.util.Scanner;
public class ejercicio_21 {
    public static void main(String[] args) {
        Scanner valor1 = new Scanner(System.in);
        double ladoA = valor1.nextFloat();
        Scanner valor2 = new Scanner(System.in);
        double ladoB = valor2.nextFloat();
        Scanner valor3 = new Scanner(System.in);
        double ladoC = valor3.nextFloat();
        double semiperimetro = (ladoA+ladoB+ladoC)/2;
        double Area= Math.sqrt(semiperimetro*(semiperimetro-ladoA)*(semiperimetro-ladoB)*(semiperimetro-ladoC));

        System.out.print("El perimetro del triangulo es: \n"+(ladoA+ladoB+ladoC)+"\n");
        System.out.print("El semiperimetro del triangulo es: \n"+semiperimetro+"\n");
        System.out.print("El Area del triangulo es: \n"+Area+"\n");
    }
}
