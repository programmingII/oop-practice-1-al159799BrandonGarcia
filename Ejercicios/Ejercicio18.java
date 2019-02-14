//Nombre:Brandon Garcia
//Fecha:02/12/2019
//Hora:12:50

import java.util.Scanner;//importacion de la libreria scanner

public class Ejercicio18{
public static void main(String[] args){//declaracion de main

Scanner in = new Scanner(System.in);//declaracion del scanner

System.out.println("Ingrese el primer numero");//print que le pide al usuario ingresar un numero binario
String A = in.nextLine();//declaracion de variable String sin valor especifico y scanner para leer un dato dado por un usuario 
System.out.println("Ingrese el segundo numero");//print que le pide al usuario ingresar un numero binario
String B = in.nextLine();//declaracion de una variable String sin valor especifico y scanner para leer un dato dado por un usuario 

int conversion1 = Integer.parseInt(A,2);//declaracion de una variable entera para recibir el valor de una variable anterior y convertirla a decimal
int conversion2 = Integer.parseInt(B,2);//declaracion de una variable entera para recibir el valor de una variable anterior y convertirla a decimal

int resultado = conversion1 * conversion2;//declaracion de una variable entera y el producto de los datos dados 
String resultado1 = Integer.toString(resultado,2);//declaracion de una variable string y la conversion a binario
System.out.println("El resultado del producto es: "+ resultado1);//print para motrar el resultado de los binarios 

}
}