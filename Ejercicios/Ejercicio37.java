//Nombre:Brandon Garcia
//Fecha:02/20/2019
//Hora:10:58pm

import java.util.Scanner;//importacion de la libreria scanner para leer datos ingresados por el usuario

public class Ejercicio37{

public static void main(String[] args){//inicializacion de main

Scanner in = new Scanner(System.in);//declaracion de scanner 

System.out.println("Ingrese una palabra o palabras");//print que le pide al usuario ingresar palabras
char[] A = in.nextLine().toCharArray();//declaracion de una variable de tipo char y siendo un arreglo para contener las letras ingresadas por el usuario
System.out.println("Al reves: ");//print que indica que se va a mostrar la o las palabras al reves 
for (int i = A.length - 1; i >= 0; i--) {//utilizacion del ciclo for para alterar el orden de las letras del arreglo junto con la declaracion de una variable entera i para utilizarla en el for 
System.out.print(A[i]);//print que imprime las palabras al reves
        }
}
}
    



