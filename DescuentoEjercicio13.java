package EjerciciosT2;

import java.util.Scanner;


public class DescuentoEjercicio13 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        //Definicion de variables
        double valorCompra;
        double descuento=0;
        double valorPago;
        String colorBolita;

        //Capturar datos de entrada
        System.out.println("Señor usuario por favor digite el valor de su compra");
        valorCompra= datos.nextInt(); 
        System.out.println("Señor usuario por favor digite el color de la bolita");
        datos.nextLine();
        colorBolita=datos.nextLine(); 

        //Estructura del condicional con las restricciones
        //Comparar string se utiliza equals
        if("blanco".equals(colorBolita) || "BLANCO".equals(colorBolita)){
            descuento=10;
            System.out.println("Señor usuario su descuento es: "+descuento+"%");
         }else if("verde".equals(colorBolita) || "VERDE".equals(colorBolita)){
            descuento=10;
            System.out.println("Señor usuario su descuento es: "+descuento+"%");
         }else if("amarillo".equals(colorBolita) || "AMARILLO".equals(colorBolita)){
            descuento=25;
            System.out.println("Señor usuario su descuento es: "+descuento+"%");
         }else if("azul".equals(colorBolita) || "AZUL".equals(colorBolita)){
            descuento=50;
            System.out.println("Señor usuario su descuento es: "+descuento+"%"); 
         }else{
            descuento=100;
            System.out.println("Señor usuario su descuento es: "+descuento+"%");
        }
    //Mensaje de salida
    valorPago=valorCompra-descuento*valorCompra/100;
    System.out.println("El cliente debe pagar $"+valorPago);
    }
}
