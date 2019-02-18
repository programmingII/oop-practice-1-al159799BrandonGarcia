//Nombre:Brandon Garcia
//Fecha:02/17/2019
//Hora:11:39

import java.util.Scanner;//importacion de la libreria scanner

public class Ejercicio26{
public static void main(String[] args){//declaracion de main

Scanner in = new Scanner(System.in);//declaracion del scanner

System.out.println("Ingrese el numero octal");//print que le pide al usuario ingresar un numero octal
String A = in.nextLine();//declaracion de variable entera sin valor especifico y scanner para leer un dato dado por un usuario 

int conversion1 = Integer.parseInt(A,8);//declaracion de una variable entera para recibir el valor de una variable anterior y convertirla a decimal

String conversion2 = Integer.toString(conversion1,2);//declaracion de una variable string para recibir el valor de una variable anterior y convertirla a binario

System.out.println("El numero binario es: "+ conversion2);//print para motrar el resultado de la conversion a binario

}
}