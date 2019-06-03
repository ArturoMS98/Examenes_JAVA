package examen_1ev_ej3;

import java.util.Scanner;

public class Examen_1Ev_Ej3 {
    //Lo dejamos para el último. tiempo restante: 1h 47 min
    //Volvemos. Tiempo restante: 1h 41 min
    //Finalizado el ejercicio. Tiempo restante: 1H, 13Min, 59 segs
    /*
    3. Normalmente los editores de texto suelen incluir una función llamada Buscar y Reemplazar, mediante la cual podemos
buscar en el texto la palabra que queramos y reemplazarla por otra cualquiera. Implementa un método que resuelva este
problema.
NOTA: Se valorará positivamente la modularización. Es decir, la identificación de subproblemas y creación de métodos
auxiliares que los resuelvan.
    */                                                                               
    public static void main(String[] args) {
        //DECLARACION DE VARIABLES//
        Scanner in = new Scanner(System.in);
        String cadena;
        String busqueda;
        String reemplazo;
        
        //PETICION DE DATOS//
        System.out.println("Introduzca la cadena de texto principal:");
        cadena = in.nextLine();
        System.out.println("Introduzca la cadena de texto a buscar:");
        busqueda = in.nextLine();
        System.out.println("Introduzca la cadena de texto con la que reemplazar:");
        reemplazo = in.nextLine();
        
        //REEMPLAZO DE LA CADENA//
        cadena = BuscarReemplazar(cadena, busqueda, reemplazo);
        
        //MUESTRA DE LA CADENA REEMPLAZADA//
        System.out.println("Nueva cadena: " + cadena);
    }
    
    //Busca en cadenaPrincipal, y reemplaza busqueda por reemplazo
    static String BuscarReemplazar(String cadenaPrincipal, String busqueda, String reemplazo)
    {
        int primeraCoincidencia;
        while(buscarCadena(cadenaPrincipal, busqueda) != -1)
        {
            primeraCoincidencia = buscarCadena(cadenaPrincipal, busqueda);
            System.out.println(primeraCoincidencia);
            cadenaPrincipal = reemplazarCadena(cadenaPrincipal, primeraCoincidencia, reemplazo, busqueda.length());
        }
        return cadenaPrincipal;
    }
    
    //Busca en cadenaPrincipal la posición donde empieza la primera ocurrencia de busqueda
    static int buscarCadena(String cadenaPrincipal, String busqueda)
    {//Devuelve la posición donde se encuentra la primera coincidencia de las cadenas, o -1 si no se encuentra//
        int posicion;
        int posicionEncontrada;
        for(posicion = 0; posicion < cadenaPrincipal.length(); posicion++)
        {
            if(cadenaPrincipal.charAt(posicion) == busqueda.charAt(0)) //Si encuentra una primera coincidencia//
            {
                for(int i = 0; i < busqueda.length(); i++)
                {
                    if(cadenaPrincipal.charAt(posicion+i) == busqueda.charAt(i))
                    {
                        if(i == busqueda.length()-1)
                            return posicion;
                    }
                    else
                        break;
                }
            }
        }
        posicion = -1;
        return posicion;
    }
    
    /*
        caracteresBuscados es la longitud de la cadena busqueda.
        posicionReemplazo es la posicion inicial donde empezamos a reemplazar
        devuelve la cadena con una ocurrencia busqueda reemplazada por reemplazo
    */
    static String reemplazarCadena(String cadenaPrincipal, int posicionReemplazo, String reemplazo, int caracteresBuscados)
    {
        switch(posicionReemplazo)
        {
            case 0: {
                cadenaPrincipal = cadenaPrincipal.substring(caracteresBuscados-1);
            }
            default: cadenaPrincipal = cadenaPrincipal.substring(0, posicionReemplazo) + reemplazo + cadenaPrincipal.substring(posicionReemplazo+1);
        }
        return cadenaPrincipal;
    }
}