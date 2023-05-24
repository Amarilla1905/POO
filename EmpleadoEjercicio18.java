package EjerciciosT2;

import java.util.Scanner;

public class EmpleadoEjercicio18 {
    /**
     * @param args
     */
    @SuppressWarnings("resource")
    public static void main(String[] args){

      Scanner datos = new Scanner(System.in);
      //Definicion de variables
      double codigoEmpleado;
      String nombreEmpleado;
      double horasTrabajadas;
      double valorHoraTrabajada;
      double porcRetencionFuente;
     


      //Capturar datos de entrada
      System.out.println("Señor usuario por favor digite el codigo del empleado: ");
      codigoEmpleado=datos.nextDouble();
      System.out.println("Señor usuario por favor digite el  nombre del empleado: ");
      datos.nextLine();
      nombreEmpleado=datos.nextLine();
      System.out.println("Señor usuario por favor digite las horas trabajadas: ");
      horasTrabajadas=datos.nextDouble();
      System.out.println("Señor usuario por favor digite el valor por hora de trabajo: ");
      valorHoraTrabajada=datos.nextDouble();
      System.out.println("Señor usuario por favor digite el porcentaje de retencion en la fuente: ");
      porcRetencionFuente=datos.nextDouble();

      //Calcular despues de recibir datos
      double salarioBruto=horasTrabajadas*valorHoraTrabajada;
      double retencionFuente=salarioBruto*(porcRetencionFuente/100);
      double salarioNeto= ((salarioBruto)-(retencionFuente));
       


      System.out.println("El codigo del empleado es: "+codigoEmpleado );
      System.out.println("El nombre del empleado es: "+nombreEmpleado );
      System.out.println("El salario bruto del trabajador a la semana es "+salarioBruto+ "Pesos");
      System.out.println("La retencion de fuente del trabajador a la semana es "+retencionFuente+ "Pesos");
      System.out.println("El salario neto del trabajador a la semana es " +salarioNeto+ "Pesos");



   }
}

