//Nombre:Brandon Garcia
//Fecha:02/17/2019
//Hora:10:51

import java.util.Scanner;//importacion de la libreria scanner

public class Ejercicio19{
public static void main(String[] args){//declaracion de main

Scanner in = new Scanner(System.in);//declaracion del scanner

System.out.println("Ingrese el numero entero");//print que le pide al usuario ingresar un numero entero
int A = in.nextInt();//declaracion de variable entera sin valor especifico y scanner para leer un dato dado por un usuario 

String conversion1 = Integer.toString(A,2);//declaracion de una variable string para recibir el valor de una variable anterior y convertirla a binario

System.out.println("El numero binario es: "+ conversion1);//print para motrar el resultado de los binarios 

}
}