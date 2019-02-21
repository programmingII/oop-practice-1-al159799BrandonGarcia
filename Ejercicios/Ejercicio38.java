//Nombre:Brandon Garcia
//Fecha:21/02/2019
//Hora:12:33pm

import java.util.Scanner;//importacion de la libreria scanner para leer datos ingresados por el usuario

public class Ejercicio38{
public static void main(String[] args){//inializacion de main

Scanner in = new Scanner(System.in);//inializacion de main


System.out.println("Ingrese la frase a evaluar");//print que le solicita al usuario ingresar una frase
String frase = in.nextLine();//declaracion de un variable string que va a recibir la frase ingresada por el usuario

char[] A = frase.toCharArray();//declaracion de un arreglo de tipo char que recibe como valor el string convertido a arreglo de char 
int letras = 0;//declaracion de una variable dandole como valor 0
int espacios = 0;//declaracion de una variable dandole como valor 0
int numeros = 0;//declaracion de una variable dandole como valor 0
int otros = 0;//declaracion de una variable dandole como valor 0

for (int i=0; i<frase.length();i++){//uso de un ciclo for 
if(Character.isLetter(A[i])){
letras ++;}
else if(Character.isDigit(A[i])){
numeros ++;}
else if(Character.isSpaceChar(A[i])){
espacios ++;}
else{
otros ++;}

}
System.out.println("El numero de letras es: "+ letras);
System.out.println("El numero de espacios es: "+ espacios);
System.out.println("El numero de numeros es: "+ numeros);
System.out.println("El numero de otros caracteres es: "+ otros);
}
}