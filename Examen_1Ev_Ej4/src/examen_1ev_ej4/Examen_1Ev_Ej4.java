package examen_1ev_ej4;

import java.util.Scanner;

public class Examen_1Ev_Ej4 {
    //Hecho. Tiempo restante: 1Hora 41 minutos. A por el 3.//
    public static void main(String[] args) {
        //DECLARACION DE VARIABLES//
        Scanner in = new Scanner(System.in);
        int altura;
        
        //PETICION DE DATOS//
        System.out.println("Introduzca la altura del triángulo: ");
        altura = in.nextInt();
        
        //CALCULO DE TRIÁNGULO//
        for(int i = 1; i <= altura; i++)
        {
            escritorEspacios(altura-i);
            escritorAsteriscos(i);
            System.out.println("");
        }
    }
    
    //METODOS SUPLEMENTARIOS//
    
    static void escritorEspacios(int espacios)
    {//ESCRIBE TANTOS ESPACIOS COMO SE PIDE POR PARÁMETRO//
        for(int i = 0; i < espacios; i++)
        {
            System.out.print(" ");
        }
    }
    static void escritorAsteriscos(int asteriscos)
    {//ESCRIBE TANTOS ASTERISCOS COMO SE PIDE POR PARÁMETRO//
        for(int i = 0; i < asteriscos; i++)
        {
            System.out.print("*");
        }
    }
}