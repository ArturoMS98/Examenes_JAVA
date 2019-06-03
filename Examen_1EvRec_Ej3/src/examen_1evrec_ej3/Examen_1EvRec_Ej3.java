package examen_1evrec_ej3;

import java.util.Scanner;

 /***********************************************************************************************************************
 * @author baha                                                                                                         *
 * <p>fecha de inicializacion: Jun 4, 2019 12:10:53 AM<p>                                                               *
 * <p>nombre del proyecto: Examen_1EvRec_Ej3.java<p>                                                                    *
 * <p>Anteriores versiones en:</p>                                                                                      *
 * <p><a href="https://github.com/BahamutEscarlata/Examenes_JAVA.git">GIT</a></p>                                       *
 ************************************************************************************************************************
 *                                                                                                                      *
 * <h1>Función de la clase:</h1>                                                                                        *
 * <p>3. Escribe un método que dibuje un rectángulo de la siguiente manera, previamente se habrá pedido la anchura y    *
 * altura al usuario.                                                                                                   *
 *                  Anchura del rectángulo: 5                                                                           *
 *                  Altura del rectángulo: 4                                                                            *
 *                      * * * * *                                                                                       *
 *                      * H H H *                                                                                       *
 *                      * H H H *                                                                                       *
 *                      * H H H *                                                                                       *
 *                      * * * * *                                                                                       *
 * </p>                                                                                                                 *
 * @version 1.0                                                                                                         *
 * <p>Tiempo invertido en esta versión: 0 horas 17 minutos 00 segundos</p>                                              *
 * <p>Tiempo sobrante tras finalizar el examen: 47 minutos 07 segundos</p>                                              *
 *                                                                                                                      *
 ***********************************************************************************************************************/
public class Examen_1EvRec_Ej3 {
                                                                                                
    /********************************************************************************************************************
    *                                                                                                                   *
    * <h1>MÉTODO MAIN</h1>                                                                                              *
    * <p>Funcion:</p>                                                                                                   *
    * <p>Pedir la altura y anchura del rectángulo, y llamar al método creador de dicho rectángulo.</p>                  *
    *                                                                                                                   *
    ********************************************************************************************************************/
    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        // VARIABLES LOCALES //
        int altura;
        int anchura;
        
        //FRONTEND//
            //PETICION DE DATOS//
            altura = pideInt("Introduzca la altura del rectángulo: ");
            anchura = pideInt("Introduzca la anchura del rectángulo: ");
        
        //BACKEND//
        creadorRectangulo(altura, anchura);
    }
    

    //Metodos suplementarios de la clase principal//

    /**_________________________________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                                               |
     | <p>Crea un rectángulo con bordes de BORDE_RECTANGULO y que contiene CONTENIDO</p>                                |
     | ~~~~<p>Parámetros:</p>~~~~                                                                                       |
     | @param altura es la altura del rectángulo; @param anchura es la anchura del rectángulo                           |
     | @return muestra el rectángulo por pantalla, no devuelve nada.                                                    |
     | ~~~~<p>Método dirigido a: FrontEnd </p>~~~~                                                                      |
     |_________________________________________________________________________________________________________________*/
    static void creadorRectangulo(int altura, int anchura)
    {
        final char BORDE_RECTANGULO = '*';
        final char CONTENIDO = 'H';
        //CUERPO DEL METODO//
        escritorCaracteres(BORDE_RECTANGULO, anchura);
        System.out.println("");
        for(int i = 0; i < altura-2; i++)
        {
            System.out.print(BORDE_RECTANGULO);
            escritorCaracteres(CONTENIDO, (anchura-2));
            System.out.print(BORDE_RECTANGULO);
            System.out.println("");
        }
        escritorCaracteres(BORDE_RECTANGULO, anchura);
        System.out.println("");
    }
    
    
    /**_________________________________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                                               |
     | <p>Dice lo que diga el mensaje, recibiendo y devolviendo un entero</p>                                           |
     | ~~~~<p>Parámetros:</p>~~~~                                                                                       |
     | @return un entero cuya utilidad dependerá del mensaje que se indique                                             |
     | ~~~~<p>Método dirigido a: FrontEnd </p>~~~~                                                                      |
     |_________________________________________________________________________________________________________________*/
    static int pideInt(String mensaje)
    {
        //VARIABLES LOCALES//
        Scanner in = new Scanner(System.in);
        //CUERPO DEL METODO//
        System.out.println(mensaje);
        return in.nextInt();
    }
    
    /**_________________________________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                                               |
     | <p>Escribe tantos asteriscos como se le pida</p>                                                                 |
     | ~~~~<p>Parámetros:</p>~~~~                                                                                       |
     | @param caracteres es el caracter que repetirá                                                                    |
     | @param numero es el número de caracteres que escribirá                                                       |
     | ~~~~<p>Método dirigido a: FrontEnd </p>~~~~                                                                      |
     |_________________________________________________________________________________________________________________*/
    static void escritorCaracteres(char caracteres, int numero)
    {
        //CUERPO DEL METODO//
        for(int i = 0; i < numero; i++)
        {
            System.out.print(caracteres);
        }
    }
}