package EjerciciosT2;

import java.util.Scanner;

public class EsferasEjercicio15 {
    /**
     * @param args
     */
    @SuppressWarnings("resource")
    public static void main(String[] args){
      Scanner datos = new Scanner(System.in);
      //Definicion de variables
      double pesoEsferaA;
      double pesoEsferaB;
      double pesoEsferaC;
      double pesoEsferaD;

      //Capturar datos de entrada
      System.out.println("Señor usuario por favor digite el peso de la espera A: ");
      pesoEsferaA=datos.nextDouble();
      System.out.println("Señor usuario por favor digite el peso de la espera B: ");
      pesoEsferaB=datos.nextDouble();
      System.out.println("Señor usuario por favor digite el peso de la espera C: ");
      pesoEsferaC=datos.nextDouble();
      System.out.println("Señor usuario por favor digite el peso de la espera D: ");
      pesoEsferaD=datos.nextDouble();

      //Construccion del condicional
      //Comparacion de A con B y de A con C para determinar que D es la diferente
      if(pesoEsferaA==pesoEsferaB && pesoEsferaA==pesoEsferaC){
        System.out.println("La esfera de peso diferente es la esfera D"); 
            if(pesoEsferaD > pesoEsferaA){
                System.out.println("Y es de mayor peso");
            }else{
                System.out.println("Y es de menor peso");
                 }
         }
      //Comparacion de A con B y de A con D para determinar que C es la diferente
      if(pesoEsferaA==pesoEsferaB && pesoEsferaA==pesoEsferaD){
        System.out.println("La esfera de peso diferente es la esfera C"); 
            if(pesoEsferaC > pesoEsferaA){
                    System.out.println("Y es de mayor peso");
            }else{
                    System.out.println("Y es de menor peso");
                 }
         }
       //Comparacion de A con C y de A con D para determinar que B es la diferente
       if(pesoEsferaA==pesoEsferaC && pesoEsferaA==pesoEsferaD){
        System.out.println("La esfera de peso diferente es la esfera B"); 
            if(pesoEsferaB > pesoEsferaA){
                    System.out.println("Y es de mayor peso");
            }else{
                    System.out.println("Y es de menor peso");
                 }
         }
       //Comparacion de B con C y de B con D para determinar que A es la diferente
        if(pesoEsferaB==pesoEsferaC && pesoEsferaB==pesoEsferaD){
            System.out.println("La esfera de peso diferente es la esfera A"); 
            if(pesoEsferaA > pesoEsferaB){
                    System.out.println("Y es de mayor peso");
            }else{
                    System.out.println("Y es de menor peso");
                 }
         }

    }
    
}
