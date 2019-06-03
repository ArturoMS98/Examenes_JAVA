package examen_1ev_ej2;

import java.util.Scanner;

public class Examen_1Ev_Ej2 {
    /*2. En matemáticas, la sucesión de Fibonacci es la siguiente sucesión infinita de números naturales:
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 ...
El primer elemento es 0, el segundo es 1 y cada elemento restante es la suma de los dos anteriores. A cada elemento de
esta sucesión se le llama número de Fibonacci. Esta sucesión fue descrita en Europa por Leonardo de Pisa, matemático
italiano del siglo XIII también conocido como Fibonacci. Tiene numerosas aplicaciones en ciencias de la computación,
matemáticas y teoría de juegos.
Implementa un método en Java que calcule el elemento N de la sucesión de Fibonacci.*/
    
    //FINALIZADO. TIEMPO RESTANTE DE LAS 2H 30MIN: 1H 54MIN 10SEGS
    public static void main(String[] args) {
        //DECLARACION DE VARIABLES//
        int primerElemento = 0;     //Primer sumando de la sucesión//
        int segundoElemento = 1;    //Segundo sumando de la sucesión//
        Scanner in = new Scanner(System.in);
        int auxiliar;   //Almacena la información del segundo elemento para almacenarla en el siguiente primerElemento
        
        //Petición del elemento N//
        System.out.println("Introduzca el elemento de la sucesión a buscar: ");
        auxiliar = in.nextInt();
        
        //Cálculo de N//
        for(int i = auxiliar-2; i > 0; i--)
        {
            auxiliar = segundoElemento;
            segundoElemento = primerElemento + segundoElemento;
            primerElemento = auxiliar;
        }
        //Mostramos N, que será el nuevo segundo elemento en la siguiente iteración//
        System.out.println(segundoElemento);
    }
}