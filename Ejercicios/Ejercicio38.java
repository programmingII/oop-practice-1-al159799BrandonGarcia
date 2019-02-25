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

for (int i=0; i<frase.length();i++){//uso de un ciclo for para que "cuente" cada caracter 
if(Character.isLetter(A[i])){//uso de un condicional if para que si se cumple la condicion de que el caracter es letra se le sume 1 a la variable letra
letras ++;}
else if(Character.isDigit(A[i])){//uso de un condicional if para que si se cumple la condicion de que el caracter es un numer se le sume 1 a la variable numero
numeros ++;}
else if(Character.isSpaceChar(A[i])){//uso de un condicional if para que si se cumple la condicion de que el caracter es un espacio se le sume 1 a la variable espacio
espacios ++;}
else{//uso de un else para que si no se cumple la ninguna de las condiciones anteriores se le sume 1 a la variable otro
otros ++;}

}
System.out.println("El numero de letras es: "+ letras);//print que imprime la cantidad de letras en la frase
System.out.println("El numero de espacios es: "+ espacios);//print que imprime la cantidad de espacios en la frase
System.out.println("El numero de numeros es: "+ numeros);//print que imprime la cantidad de numeros en la frase
System.out.println("El numero de otros caracteres es: "+ otros);//print que imprime la cantidad de otros caracteres en la frase
}
}
