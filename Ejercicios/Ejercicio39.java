//Nombre:Brandon Garcia
//Fecha:24/02/2019
//Hora:6:44pm

public class Ejercicio39{
public static void main(String[] args) {//inicializacion del main
int total= 0;//declaracion de una variable int con el valor 0 para que se le pueda agregar de 1 en 1 con los ciclos for 
for(int i = 1; i <= 4; i++){//ciclo for que usa una variable declarada entera para guarde un numero
for(int j = 1; j <= 4; j++){//ciclo for que usa una variable declarada entera para guarde un numero
for(int k = 1; k <= 4; k++){//ciclo for que usa una variable declarada entera para guarde un numero
if(k != i && k != j && i != j){//uso del condicional if para que si se cumple la condicion de que ningun numero o convinacion de numeros se repita, se cumple y la agrega a la 'lista'
total++;//la accion que se realiza si se cumple la condicion del if y es la suma de las diferentes convinaciones
System.out.println(i + "" + j + "" + k);//print que imprime las diferentes convinaciones que se realizaron con los for no repetidas 
}
 }
  }
   }
System.out.println("El total de convinaciones de los 3 digitos es: " + total);//print que imprime el total de las convinaciones posibles con esos 3 digitos 
}
}