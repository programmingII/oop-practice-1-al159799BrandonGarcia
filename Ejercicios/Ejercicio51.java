//Nombre:Brandon Garcia
//Fecha:26/02/2019
//Hora:12:20pm

import java.util.Scanner;//importacion de la libreria scanner 

public class Ejercicio51{
public static void main(String[] args){//inicializacion de main
Scanner in = new Scanner(System.in);//declaracion de un Scanner

System.out.println("Ingrese un numero");//print que le pide al usuario que ingrese un numero
String A = in.nextLine();//declaracion de una variable String que recibira datos ingresados por el usuario 

int B = Integer.parseInt(A);//declaracion de una variable int que recibira como valor la convercion de la variable string a entera con la funcion parseInt 
System.out.println("En valor en integral es: "+ B);//print que imprime el valor de la convercion a entero 

}
}