//Nombre:Brandon garcia 
//Dia:07/02/2019
//Hora:1:02

import java.util.Scanner; //importacion de la libreria scanner para leer datos

public class Ejercicio5{

public static void main(String[] args){ // inializacion de main
Scanner in =new Scanner(System.in); //inializacion del scanner 

System.out.println("Ingrese el primer numero"); //println para pedir al usuario ingresar datos 
int A = in.nextInt(); //inicializacion de una variable sin valor especifico y el programa espera que ingrese los datos
System.out.println("Ingrese el segundo numero"); //println para pedir al usuario ingresar datos 
int B = in.nextInt(); //inicializacion de una variable y se espera el ingreso de datos
System.out.println("El resutado es: "+ (A*B)); //muestra el resultado del producto

}
}