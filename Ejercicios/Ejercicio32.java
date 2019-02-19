//Nombre:Brandon Garcia
//Fecha:02/18/2019
//Hora:8:52

import java.util.Scanner;//importacion de la libreria scanner para leer datos ingresados por el usuario

public class Ejercicio32{

public static void main(String[] args){//inicializacion de main

Scanner in = new Scanner(System.in);//declaracion de scanner 

System.out.println("Ingrese el primer numero a comparar");//print para pedir al usuario que ingrese un numero
int A = in.nextInt();//declaracion de variable sin valor especifico para recibir el dato ingresado por el usuario
System.out.println("Ingrese el segundo numero a comparar");//print para pedir al usuario que ingrese un numero
int B = in.nextInt();//declaracion de variable sin valor especifico para recibir el dato ingresado por el usuario

if(A == B){ System.out.println(A + " = " + B);}//inicializacion condicional if y un print que se imprime si se cumple la condicion de igualdad de variables

else if(A < B){ //un condicional else if con print que imprime la desigualdad de las variables si la condicion de que A es menor que B se cumple 
System.out.println(A + " != " + B);//print que imprime la desigualdad de variables
System.out.println(A + " < " + B);//print que imprime que una variable es menor que otra
System.out.println(A + " <= " + B);//print que imprime que una variable es menor o igual que otra 
}

if (A > B){ //un condicional if con print que imprime la desigualdad de las variables si la condicion de que A es mayor que B se cumple 
System.out.println(A + " != " + B);//print que imprime la desigualdad de variables
System.out.println(A + " > " + B);//print que imprime que una variable es mayor que otra
System.out.println(A + " >= " + B);//print que imprime que una variable es mayor o igual que otra 
}



}
}