//Nombre:Brandon Garcia
//Fecha:02/20/2019
//Hora:10:38pm

import java.util.Scanner;//importacion de la libreria scanner para leer datos ingresados por el usuario

public class Ejercicio36{

public static void main(String[] args){//inicializacion de main

Scanner in = new Scanner(System.in);//declaracion de scanner 

double R = 6371.01;//declaracion de una variable dandole el valor de el radio de la tierra 

System.out.println("Ingrese la latitud de la coordinada 1");//print para pedir al usuario que ingrese un numero
double A = in.nextDouble();//declaracion de variable double sin valor especifico para recibir el dato ingresado por el usuario
System.out.println("Ingrese la longitud de la coordinada 1");//print para pedir al usuario que ingrese un numero
double B = in.nextDouble();//declaracion de variable double sin valor especifico para recibir el dato ingresado por el usuario
System.out.println("Ingrese la latitud de la coordinada 2");//print para pedir al usuario que ingrese un numero
double C = in.nextDouble();//declaracion de variable double sin valor especifico para recibir el dato ingresado por el usuario
System.out.println("Ingrese la longitud de la coordinada 2");//print para pedir al usuario que ingrese un numero
double D = in.nextDouble();//declaracion de variable double sin valor especifico para recibir el dato ingresado por el usuario

A = Math.toRadians(A);//convercion de los datos de la variable A a Radianes para obtener el resultado utilizando la libreria Math
B = Math.toRadians(B);//convercion de los datos de la variable B a Radianes para obtener el resultado utilizando la libreria Math
C = Math.toRadians(C);//convercion de los datos de la variable C a Radianes para obtener el resultado utilizando la libreria Math
D = Math.toRadians(D);//convercion de los datos de la variable D a Radianes para obtener el resultado utilizando la libreria Math

double Dis = R * Math.acos(Math.sin(A)*Math.sin(C)+Math.cos(A)*Math.cos(C)*Math.cos(B - D));//declaracion de una variable que tendra como valor el resultado de la formula para obtener la distancia entre dos puntos utilizando las variables anteriores y la libreria Math para realizar las operaciones

System.out.println("La distancia entre esos puntos es: "+ Dis + "  Km");//print que imprime la distancia entre los puntos
}
}
    



