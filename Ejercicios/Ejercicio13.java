//Nombre:Brandon garcia 
//Dia:10/02/2019
//Hora:9:12

import java.util.Scanner; //importacion de la libreria scanner para leer datos

public class Ejercicio13{

public static void main(String[] args){ // inializacion de main
Scanner in =new Scanner(System.in); //inializacion del scanner

System.out.println("Ingrese la altura ");//print que pide al usuario la altura del rentangulo
double A = in.nextDouble();//declaracion de variable double y scann para recibir el valor del double
System.out.println("Ingrese el ancho");//print que pide al usuario el ancho del rentangulo
double B = in.nextDouble();//declaracion de variable double y scann para recibir el valor del double
System.out.println("El area es: "+ A*B);
System.out.println("El perimetro es: "+ 2*(A+B));

}
}