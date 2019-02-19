//Nombre:Brandon Garcia
//Fecha:02/18/2019
//Hora:10:23pm

import java.util.Scanner;//importacion de la libreria scanner para leer datos ingresados por el usuario

public class Ejercicio34{

public static void main(String[] args){//inicializacion de main

Scanner in = new Scanner(System.in);//declaracion de scanner 

System.out.println("Ingrese cuanto mide un lado del hexagono");//print para pedir al usuario que ingrese un numero
double A = in.nextDouble();//declaracion de variable double sin valor especifico para recibir el dato ingresado por el usuario
double Area = (6 * (A*A))/(4*Math.tan(Math.PI/6));//declaracion de una variable double para realizar la opreacion para obtener el area del hexagono utilizando la variable A tambien haciendo uso de la libreria Math
System.out.println("El area del hexagono es: "+ Area);//print que imprime el area del hexagono

}
}
    



