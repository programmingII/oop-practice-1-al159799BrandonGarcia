//Nombre:Brandon Garcia
//Fecha:24/02/2019
//Hora:7:35pm

import java.util.Scanner;//importacion de la libreria scanner

public class Ejercicio41{
public static void main(String[] args){//inicializacion del main
Scanner in = new Scanner(System.in);//declaracion para uso del scanner

System.out.println("Ingrese el caracter para saber su valor en ascii");//print que pide al usuario un ingresar un caracter
char A = in.next().charAt(0);//declaracion de variable de tipo char que recibe el caracter ingresado por el usuario
System.out.println("El valor en ascii de " + A + " es: "+ (int)A);//print que imprime el valor en ascii con una conversion 
}
}