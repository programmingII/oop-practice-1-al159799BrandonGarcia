//Nombre:Brandon Garcia
//Fecha:26/02/2019
//Hora:12:54pm

import java.util.Scanner;//importacion de la libreria scanner 

public class Ejercicio53{
public static void main(String[] args){//inicializacion de main
Scanner in = new Scanner(System.in);//declaracion de un Scanner

System.out.println("Ingrese el primer numero");//print que le pide al usuario que ingrese un numero
int A = in.nextInt();//declaracion de una variable int que recibira datos ingresados por el usuario 
System.out.println("Ingrese el segundo numero");//print que le pide al usuario que ingrese un numero
int B = in.nextInt();//declaracion de una variable int que recibira datos ingresados por el usuario
System.out.println("Ingrese el tercer numero");//print que le pide al usuario que ingrese un numero
int C = in.nextInt();//declaracion de una variable int que recibira datos ingresados por el usuario

if( A < B && B < C){//condicional if que su condicion se cumple si la variable A es menor que B y B es menor que C
System.out.println("El resultado es: true");//print que se imprime si se cumple la condicion afirmando que la variable A es menor que B y B es menor que C
}
else//else que se ejecuta si no se cumple la condicion del if
System.out.println("El resultado es: false");//print que se imprime si no se cumple la condicion del if negando que la suma no es igual a la tercera variable

}
}