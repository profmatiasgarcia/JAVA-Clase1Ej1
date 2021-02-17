package Clase1Ej1;
/**
 * @author Prof Matias Garcia.
 * <p> Copyright (C) 2017 para <a href = "https://www.profmatiasgarcia.com.ar/"> www.profmatiasgarcia.com.ar </a>
 * - con licencia GNU GPL3.
 * <p> Este programa es software libre. Puede redistribuirlo y/o modificarlo bajo los términos de la
 * Licencia Pública General de GNU según es publicada por la Free Software Foundation, 
 * bien con la versión 3 de dicha Licencia o bien (según su elección) con cualquier versión posterior. 
 * Este programa se distribuye con la esperanza de que sea útil, pero SIN NINGUNA GARANTÍA, 
 * incluso sin la garantía MERCANTIL implícita o sin garantizar la CONVENIENCIA PARA UN PROPÓSITO
 * PARTICULAR. Véase la Licencia Pública General de GNU para más detalles.
 * Debería haber recibido una copia de la Licencia Pública General junto con este programa. 
 * Si no ha sido así ingrese a <a href = "http://www.gnu.org/licenses/"> GNU org </a>
 */
public class Main {

    /** EJEMPLO TIPO DE DATOS EN JAVA */

    public static void main(String[] args) {
        /* Declaro las variables */
        char c;
        int i;
        float f;
        double d;

        /* Asigno valores a las variables */
        c = 'a';
        i = 25;
        f = 3.1416F;
        d = 2.7172;

        /* Mostrar los valores de c, i, f y d por la pantalla */
        System.out.println("c vale " + c);
        System.out.println("i vale " + i);
        System.out.println("f vale " + f);
        System.out.println("d vale " + d);

        /* Mostrar el tamaño que ocupan en RAM los tipos de datos */
        System.out.println("El tamaño del caracter 'c' es: " + Character.SIZE + " bytes");
        System.out.println("El tamaño del entero 'i' es: " + Integer.SIZE + " bytes");
        System.out.println("El tamaño del float 'f' es: " + Float.SIZE + " bytes");
        System.out.println("El tamaño del double 'd' es: " + Double.SIZE + " bytes");

        /* Castear el valor de una variable */
        double suma = f + d;
        System.out.println("suma vale " + suma);
        System.out.println("suma casteada a entero vale " + (int) suma);

        String cadena = "123";
        int entero = Integer.parseInt(cadena);
        System.out.println("La cadena casteada y sumada " + (entero + 2));

        /* Utilizando objetos de tipo String */
        String nombre = "Matias";
        String apellido = "Garcia";
        String ocupacion = "Profesor";

        System.out.println(nombre.toUpperCase());
        System.out.println(apellido + " tiene " + apellido.length() + " letras");

        ocupacion += " de informatica";
        System.out.print(nombre + " es " + ocupacion);

        /* transforma un valor numerico a String */
        int numero = 40;
        String edad = String.valueOf(numero) + " años";
        System.out.println(" tiene " + edad);

        int pos = apellido.indexOf('c');
        System.out.println("En " + apellido + " la letra c se encuentra en " + pos);

        /* comparando String */
        String str1 = "Programacion III";
        String str2 = new String("Programacion III");
        System.out.println("<<<Comparacion de String>>>");
        if (str1 == str2) {
            System.out.println("Los mismos objetos");
        } else {
            System.out.println("Distintos objetos");
        }
        if (str1.equals(str2)) {
            System.out.println("El mismo contenido");
        } else {
            System.out.println("Distinto contenido");
        }

        /*
        * devuelve un entero menor que cero si el objeto string es menor (en
	* orden alfabético) que el string dado, cero si son iguales, y mayor
	* que cero si el objeto string es mayor que el string dado.
         */
        int resp = apellido.compareTo("Lopez");
        System.out.println("Resultado de compareTo: " + resp);

    }

}