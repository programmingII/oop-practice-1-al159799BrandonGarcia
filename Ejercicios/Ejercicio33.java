//Nombre:Brandon Garcia
//Fecha:02/18/2019
//Hora:9:30

import java.util.Scanner;//importacion de la libreria scanner para leer datos ingresados por el usuario

public class Ejercicio33{

public static void main(String[] args){//inicializacion de main

Scanner in = new Scanner(System.in);//declaracion de scanner 

System.out.println("Ingrese un numero entero");//print para pedir al usuario que ingrese un numero
Long A = in.nextLong();//declaracion de variable Long sin valor especifico para recibir el dato ingresado por el usuario
System.out.println("La suma de los digitos es: "+ suma(A));//print que imprime el resultado de la suma de los digitos y la llamada a una funcion suma en donde se realiza la operacion 

}

    public static int suma(long A) {//iinicilizacion de la funcion suma de tipo entero y recibiendo la variable A declarada en main
        int sum = 0;//declaracion de una variable con el valor 0
        while (A != 0) {//inicializacion de un ciclo while con una condicion de que la variable recibida no sea 0 para que se cumpla
            sum += A % 10;//utilizacion de la suma combinada para darle a la variable sum el valor del resto de la division del la variable entre 10
            A /= 10;//division de la variable A entre 10 para obtener el otro numero que se va a sumar 
        }
        return sum;//retorno de la variable sum al main para obtener el resultado
    }

}
    



