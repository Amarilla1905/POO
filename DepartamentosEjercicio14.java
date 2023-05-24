package EjerciciosT2;

import java.util.Scanner;

public class DepartamentosEjercicio14 {
    /**
     * @param args
     */
    @SuppressWarnings("resource")
    
    public static void main(String[] args){
        Scanner datos= new Scanner(System.in);
        //Definicion de variables
        double ventasD1; //ventas del departamento 1
        double ventasD2; //ventas del departamento 2
        double ventasD3; //ventas del departamento 3
        double salarioVendedores; //salario inicial de los vendedores
        double totalVentas; //total de ventas de la empresa
        double porcVentas; //porcentaje equivalente al 33% de ventas totales.
        double salarioVendedores1; //salario de los vendedores en el depart. 1,aqui se le suma el 20% si se supera el 33% de las ventas totales por tipo de depart.
        double salarioVendedores2; //salario de los vendedores en el depart. 2,aqui se le suma el 20% si se supera el 33% de las ventas totales por tipo de depart.
        double salarioVendedores3; //salario de los vendedores en el depart. 3,aqui se le suma el 20% si se supera el 33% de las ventas totales por tipo de depart.

        //Datos de entrada
        System.out.println("Señor usuario digite las ventas obtenidas por el departamento 1 ");
        ventasD1=datos.nextInt();
        System.out.println("Señor usuario digite las ventas obtenidas por el departamento 2 ");
        ventasD2=datos.nextInt();
        System.out.println("Señor usuario digite las ventas obtenidas por el departamento 3 ");
        ventasD3=datos.nextInt();
        System.out.println("Señor usuario digite el salario de los vendedores");
        salarioVendedores=datos.nextInt();
        totalVentas=ventasD1+ventasD2+ventasD3;
        porcVentas=0.33*totalVentas;


        //Construccion del condicional
        if(ventasD1>porcVentas){
            salarioVendedores1=salarioVendedores+0.2*salarioVendedores;
        }else{
            salarioVendedores1=salarioVendedores;
        }

        if(ventasD2>porcVentas){
            salarioVendedores2=salarioVendedores+0.2*salarioVendedores;
        }else{
            salarioVendedores2=salarioVendedores;
        }
 
        if(ventasD3>porcVentas){
            salarioVendedores3=salarioVendedores+0.2*salarioVendedores;
        }else{
            salarioVendedores3=salarioVendedores;
        }
        //Mensaje de salida
        System.out.println("El salario del vendendor de departamentos 1 es: "+salarioVendedores1);
        System.out.println("El salario del vendendor de departamentos 2 es: "+salarioVendedores2);
        System.out.println("El salario del vendendor de departamentos 3 es: "+salarioVendedores3);
    }
}


