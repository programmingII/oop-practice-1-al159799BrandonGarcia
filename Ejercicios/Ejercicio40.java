//Nombre:Brandon Garcia
//Fecha:24/02/2019
//Hora:7:15pm

import java.nio.charset.Charset;//importacion de la libreria charset que contiene los diferentes paquetes de caracteres 

public class Ejercicio40{
public static void main(String[] args){//inicializacion del main

System.out.println("Lista de los paquetes de caracteres: ");//print que imprime los que se va a presentar la lista de paquetes de caracteres 
for (String str : Charset.availableCharsets().keySet()) { //uso del ciclo for para mostrar todos los paquetes y la declaracion de una variable string que con el uso de una funcion de la libreria charset guarda el nombre de los paquetes
System.out.println(str);//print que imprime el valor de la variable que contiene los paquetes
    }
  }
}