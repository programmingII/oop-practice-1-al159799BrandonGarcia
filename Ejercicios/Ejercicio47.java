//Nombre:Brandon Garcia
//Fecha:25/02/2019
//Hora:7:44pm

import java.text.SimpleDateFormat;//importe de la libreria simpledateformat para poder trabajar con variables de tipo fecha
import java.util.Calendar;//importe de la libreria calendar para poder accerder al calendario del sistema 
import java.util.TimeZone;//importe de la libreria timezone para poder accerder a la hora del sistema 

public class Ejercicio47{
public static void main(String[] args){//inicializacion de main

SimpleDateFormat fecha = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");//creacion de una variable de tipo fecha para almacener la fecha del sistema
fecha.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));//se le indica a la variable que almacenara la informacion del sistema con funciones de las librerias
		
System.out.println("Ahora mismo : "+fecha.format(System.currentTimeMillis()));//print que imprime la fecha del sistema 
 }
}