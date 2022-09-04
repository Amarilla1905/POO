    import java.util.Scanner;
    public class ejercicio_24 {
        public static void main(String[] args) {
            Scanner Esferas= new Scanner(System.in);
            System.out.println("Ingrese El Peso en Kg de la Esfera A:");
            double A = Esferas.nextInt();
            System.out.println("Ingrese El Peso en Kg de la Esfera B:");
            double B = Esferas.nextInt();
            System.out.println("Ingrese El Peso en Kg de la Esfera C:");
            double C = Esferas.nextInt();
            if ((A > C) & (A > B)) {
                System.out.println("La Esfera de mayor peso es: La A\n"+"con un peso de:"+A);

            } else if ((B > A) & (B> C)) {
                System.out.println("La Esfera de mayor peso es: La B\n"+"con un peso de:"+B);
            } else if ((C > A) & (C> B)) {
                System.out.println("La Esfera de mayor peso es: La C\n"+"con un peso de:"+C);
            }else{
                System.out.println("Es posible que dos o mas esferas tengan el mismo peso");
            }
        }

        }
