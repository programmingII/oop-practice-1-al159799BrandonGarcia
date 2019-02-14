//Nombre:Brandon Garcia
//Fecha: 10/02/2019
//Hora: 9:37pm

import java.util.Scanner;//importacion de la libreria scanner

public class Ejercicio15{
public static void main (String[] args){ //inicializacion de main 
Scanner in = new Scanner(System.in);//inicializacion de scanner

System.out.println("Ingrese el dato de una variable");//print que solicita al usuario un valor
double A = in.nextDouble();//declaracion de una variable double y scanner para guardar su valor
System.out.println("Ingrese el dato de otra variable");//print que solicita al usuario otro valor
double B = in.nextDouble();//declaracion de una variable double y scanner para guardar su valor

System.out.println("El valor de las variables antes del cambio de valor es: "+ "A = "+ A + " B = "+ B);//print que muestra el valor de las variables antes de mmodificarlas

A = A*2;
B = B*A;

System.out.println("El valor de las variables despues del cambio de valor es: "+ "A = "+ A + " B = "+ B);//print que muestra el valor de las variables despues de modificarlas 

}
}	