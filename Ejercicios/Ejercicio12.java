//Nombre:Brandon garcia 
//Dia:10/02/2019
//Hora:9:00

import java.util.Scanner; //importacion de la libreria scanner para leer datos

public class Ejercicio12{

public static void main(String[] args){ // inializacion de main
Scanner in =new Scanner(System.in); //inializacion del scanner

System.out.println("Ingrese el primer numero");//print solicitando al usuario ingresar un numero
double A = in.nextDouble();//declaracion de una variable double y un scann para recibir el valor de la variable
System.out.println("Ingrese el segundo numero");//print solicitando al usuario ingresar un numero
double B = in.nextDouble();//declaracion de una variable double y un scann para recibir el valor de la variable
System.out.println("Ingrese el tercer numero");//print solicitando al usuario ingresar un numero
double C = in.nextDouble();//declaracion de una variable double y un scann para recibir el valor de la variable
System.out.println("El promedio es: "+ (A+B+C)/3);

}
}