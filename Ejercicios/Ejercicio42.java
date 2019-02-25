//Nombre:Brandon Garcia
//Fecha:24/02/2019
//Hora:8:21pm

import java.io.Console;//importacion de la liberia console para el uso de una consola 

public class Ejercicio42{
public static void main(String[] args) {//inicializacion del main
Console cons;//declaracion del nombre de la consola
if ((cons = System.console()) != null) {//condicional if que se acepta si se cumple que existe una consola 
char[] pass_ward = null;//creacion de un arreglo de tipo char para la contraseña
try {//uso de un try que se ejecuta si la condicion del if se cumplio
pass_ward = cons.readPassword("Ingrese su contraseña:");//uso de las funciones de console para indicar que se ingresara una contaseña 
System.out.println("Tu contraseña es: " + new String(pass_ward));//print que imprime la contraseña ingresada convirtiendo el arreglo char a string 
} finally {//uso de un finally en caso de que no ocurra lo anterior 
if (pass_ward != null) {//un condicional if que se cumple si la contraseña no es nula
java.util.Arrays.fill(pass_ward, ' ');
}
 }
  } else {
throw new RuntimeException("Can't get password...No console");//si no se cumple la condicion da un aviso
  }
 }
}