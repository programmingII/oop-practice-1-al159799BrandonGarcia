//Nombre:Brandon Garcia
//Fecha:02/17/2019
//Hora:11:15

import java.util.Scanner;//importacion de la libreria scanner

public class Ejercicio22{
public static void main(String[] args){//declaracion de main

Scanner in = new Scanner(System.in);//declaracion del scanner

System.out.println("Ingrese el numero binario");//print que le pide al usuario ingresar un numero binario
String A = in.nextLine();//declaracion de variable entera sin valor especifico y scanner para leer un dato dado por un usuario 

int conversion1 = Integer.parseInt(A,2);//declaracion de una variable entera para recibir el valor de una variable anterior y convertirla a decimal

System.out.println("El numero decimal es: "+ conversion1);//print para motrar el resultado de la conversion a decimal

}
}