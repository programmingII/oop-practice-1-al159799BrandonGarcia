//Nombre:Brandon garcia 
//Dia:10/02/2019
//Hora:8:44

import java.util.Scanner; //importacion de la libreria scanner para leer datos

public class Ejercicio11{

public static void main(String[] args){ // inializacion de main
Scanner in =new Scanner(System.in); //inializacion del scanner

System.out.println("Ingrese el radio del circulo");//print que le solicita al usuario el radio del circulo para calcular el area y perimetro
float R = in.nextFloat();//declaracion de variable flotante sin valor especifico y scann que recibe un valor para esa variable 
System.out.println("El perimetro es: "+ (2*3.1416)*R );//print que imprime el perimetro del circulo utilizando la formula
System.out.println("El area es: "+ 3.1416* (R*R));//print que imprime el area del circulo utilizando su formula 

}
}