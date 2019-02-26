//Nombre:Brandon Garcia
//Fecha:25/02/2019
//Hora:8:30pm

public class Ejercicio50{
public static void main(String[] args){//inicializacion de main

System.out.println("Numeros divisibles por 3");//print que indica que se van a mostrar los numeros divisibles por 3
for(int i = 1; i <= 99; i++){//ciclo for para aumentar el valor de la variable i de 1 a 99
if(i % 3 == 0)//condicional if que su condicion se cumple si el resuido de una division de la variable i entre 3 es igual a 0
System.out.print(i + ", ");//print que muestra los numeros divisibles entre 3 
}
System.out.println("\n\nNumeros divisibles por 5");//print que indica que se van a mostrar los numeros divisibles por 5
for(int i = 1; i <= 99; i++){//ciclo for para aumentar el valor de la variable i de 1 a 99
if(i % 5 ==0)//condicional if que su condicion se cumple si el resuido de una division de la variable i entre 5 es igual a 0
System.out.print(i +", ");//print que muestra los numeros divisibles entre 5
}

System.out.println("\n\nNumeros divisibles entre 3 y 5");//print que indica que se van a mostrar los numeros divisibles por 3 y 5
for(int i = 1; i <= 99; i++){//ciclo for para aumentar el valor de la variable i de 1 a 99
if(i % 3 == 0 && i % 5 == 0)//condicional if que su condicion se cumple si el resuido de una division de la variable i entre 3 y 5 es igual a 0
System.out.print(i + ", ");//print que muestra los numeros divisibles entre 3 y 5
}
 }
}