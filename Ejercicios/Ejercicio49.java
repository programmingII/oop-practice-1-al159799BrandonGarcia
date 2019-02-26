//Nombre:Brandon Garcia
//Fecha:25/02/2019
//Hora:8:07pm

import java.util.Scanner;//importacion de libreria scanner

public class Ejercicio49{
public static void main(String[] args){//inicializacion de main
Scanner in = new Scanner(System.in);//declaracion del scanner
System.out.println("Ingrese un numero");//print que le pide al usuario un numero

int A = in.nextInt();//declaracion de una variable que recibira datos ingresados por el usuario
if((A % 2) != 0)//condicional if que su condicion se cumple si el resuido de una division de la variable A entre 2 no da 0 
System.out.println("0");//print que muestra un 0 si el numero es impar
else//else para que en caso de que no se cumpla la condicion ocurrira lo siguiente
System.out.println("1");//print que muestra un 1 si el numero es par
 }
}