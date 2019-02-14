//Nombre:Brandon garcia 
//Dia:07/02/2019
//Hora:1:19

import java.util.Scanner; //importacion de la libreria scanner para leer datos

public class Ejercicio6{

public static void main(String[] args){ // inializacion de main
Scanner in =new Scanner(System.in); //inializacion del scanner 

System.out.println("Ingrese el primer numero"); //println para pedir al usuario ingresar datos 
int A = in.nextInt(); //inicializacion de una variable sin valor especifico y el programa espera que ingrese los datos
System.out.println("Ingrese el segundo numero"); //println para pedir al usuario ingresar datos 
int B = in.nextInt(); //inicializacion de una variable y se espera el ingreso de datos
System.out.println("La suma es: "+ (A+B)); //imprime la suma de las variables 
System.out.println("La resta es: "+ (A-B)); // imprime la resta de las variables
System.out.println("El producto es: "+ (A*B)); //imprime el producto de las variables
System.out.println("El resultado de la division es: "+ (A/B)); //imprime el resultado de la division
System.out.println("El resultado de mod es: "+ (A%B)); //imprime el resultado de mod

}
}
