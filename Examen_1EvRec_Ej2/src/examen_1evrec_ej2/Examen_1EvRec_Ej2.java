package examen_1evrec_ej2;

import java.util.Scanner;

 /***********************************************************************************************************************
 * @author baha                                                                                                         *
 * <p>fecha de inicializacion: Jun 3, 2019 11:38:27 PM<p>                                                               *
 * <p>nombre del proyecto: Examen_1EvRec_Ej2.java<p>                                                                    *
 * <p>Anteriores versiones en:</p>                                                                                      *
 * <p><a href="https://github.com/BahamutEscarlata/Examenes_JAVA.git">GIT</a></p>                                       *
 ************************************************************************************************************************
 *                                                                                                                      *
 * <h1>Función de la clase:</h1>                                                                                        *
 * <p>2. La RAE (Real Academia Española) define un palíndromo como : “Palabra o frase que se lee igual de izquierda a   *
 *       derecha, que de derecha a izquierda; p. ej., anilina; dábale arroz a la zorra el abad”. Implementa un método   *
 *       en Java que permita identificar palíndromos.</p>                                                               *
 * @version 1.0                                                                                                         *
 * <p>Tiempo invertido en esta versión: 0 horas 34 minutos 50 segundos</p>                                              *
 *                                                                                                                      *
 ***********************************************************************************************************************/
public class Examen_1EvRec_Ej2 {
                                                                                                
    /********************************************************************************************************************
    *                                                                                                                   *
    * <h1>MÉTODO MAIN</h1>                                                                                              *
    * <p>Funcion:</p>                                                                                                   *
    * <p>Pedir el texto, y llamar a esPalindromo()</p>                                                                  *
    *                                                                                                                   *
    ********************************************************************************************************************/
    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        // VARIABLES LOCALES //
        String frase;
        
        //FRONTEND//
            //PETICION DE DATOS//
            frase = getTexto();
        
        //BACKEND//
        if(esPalindromo(frase))
            System.out.println("La frase introducida es un palíndromo");
        else
            System.out.println("La frase introducida no es un palíndromo");
    }
    

    //Metodos suplementarios de la clase principal//

    /**_________________________________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                                               |
     | <p>Comprobar si la frase recibida es un palíndromo o no.</p>                                                     |
     | ~~~~<p>Parámetros:</p>~~~~                                                                                       |
     | @param texto es la frase a comprobar                                                                             |
     | @return true si es un palíndromo o false en caso contrario.                                                      |
     | ~~~~<p>Método dirigido a:   BackEnd</p>~~~~                                                                      |
     |_________________________________________________________________________________________________________________*/
    static boolean esPalindromo(String texto)
    {
        //VARIABLES LOCALES//
        String palindromo = "";
        String textoAux = texto;
        //CUERPO DEL METODO//
        
        //Quitamos los espacios sobrantes dentro de la cadena//
        texto = "";
        while(textoAux.trim().length() > 0)
        {
            texto = texto + cogePrimeraPalabra(textoAux);
            textoAux = textoAux.substring(cogePrimeraPalabra(textoAux).length());
            textoAux = textoAux.trim();
            texto = texto + " ";
        }
        textoAux = texto;   //Volvemos a dejar operativa la variable textoAux
        
        //Calculamos el palíndromo de la frase recibida//
        while(textoAux.trim().length() > 0)
        {
            palindromo = inviertePalabra(cogePrimeraPalabra(textoAux)) + palindromo;
            textoAux = textoAux.substring(cogePrimeraPalabra(textoAux).length());
            textoAux = textoAux.trim();
            palindromo = " " + palindromo;
        }
        //Quitamos los espacios sobrantes en la cadena
        palindromo = palindromo.trim();
        
        //Comprobamos si la variable palíndromo coincide con el texto inicial//
        if(palindromo.equalsIgnoreCase(texto.trim()))
            return true;
        else
            return false;
    }
    
    /**_________________________________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                                               |
     | <p>Recoger la primera palabra del texto recibido.</p>                                                            |
     | ~~~~<p>Parámetros:</p>~~~~                                                                                       |
     | @param texto es el texto del que recoger la primera palabra.                                                     |
     | @return la primera palabra del texto.                                                                            |
     | ~~~~<p>Método dirigido a:   BackEnd</p>~~~~                                                                      |
     |_________________________________________________________________________________________________________________*/
    static String cogePrimeraPalabra(String texto)
    {
        //VARIABLES LOCALES//
        
        //CUERPO DEL METODO//
        texto = texto.trim() + " ";
        for(int i = 0; i < texto.length(); i++)
        {
            if(texto.charAt(i) == ' ')
                return texto.substring(0, i).trim();
        }
        return "ERROR";
    }
    
    /**_________________________________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                                               |
     | <p>Invertir la palabra que le pasamos y devolverla</p>                                                           |
     | ~~~~<p>Parámetros:</p>~~~~                                                                                       |
     | @param palabra es la palabra a invertir                                                                          |
     | @return la cadena recibida, invertida                                                                            |
     | ~~~~<p>Método dirigido a:   BackEnd</p>~~~~                                                                      |
     |_________________________________________________________________________________________________________________*/
    static String inviertePalabra(String palabra)
    {
        //VARIABLES LOCALES//
        String invertida = "";
        //CUERPO DEL METODO//
        for(int i = 0; i < palabra.length(); i++)
        {
            invertida = palabra.charAt(i) + invertida;
        }
        return invertida;
    }
    
    /**_________________________________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                                               |
     | <p>Pedir y devolver un texto.</p>                                                                                |
     | ~~~~<p>Parámetros:</p>~~~~                                                                                       |
     | @return el texto sobre el que trabajaremos.                                                                      |
     | ~~~~<p>Método dirigido a: FrontEnd </p>~~~~                                                                      |
     |_________________________________________________________________________________________________________________*/
    static String getTexto()
    {
        //VARIABLES LOCALES//
        Scanner in = new Scanner(System.in);
        //CUERPO DEL METODO//
        System.out.println("Introduzca una frase: ");
        return in.nextLine();
    }
}