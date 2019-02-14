//Nombre:Brandon Garcia
//Fecha:02/12/2019
//Hora:12:17

import java.util.Scanner;//importacion de la libreria Scanner para leer datos por el usuario

public class Ejercicio17{

public static void main(String[] args){//inicializacion de main

Scanner in = new Scanner(System.in);//declaracion de scanner 

System.out.println("Ingrese el primer numero");//print que le pide al usuario ingresar un numero binario
String A = in.nextLine();//declaracion de variable String sin valor especifico y scanner para leer un dato dado por un usuario 
System.out.println("Ingrese el segundo numero");//print que le pide al usuario ingresar un numero binario
String B = in.nextLine();//declaracion de una variable String sin valor especifico y scanner para leer un dato dado por un usuario 

int conversion1 = Integer.parseInt(A,2);//declaracion de una variable entera para recibir el valor de una variable anterior y convertirla a decimal
int conversion2 = Integer.parseInt(B,2);//declaracion de una variable entera para recibir el valor de una variable anterior y convertirla a decimal

int resultado = conversion1 + conversion2;//declaracion de una variable entera y la suma de los datos dados 
String resultado1 = Integer.toString(resultado,2);//declaracion de una variable string y la conversion a binario
System.out.println("El resultado de la suma es: "+ resultado1);//print para motrar el resultado de los binarios 

}
}