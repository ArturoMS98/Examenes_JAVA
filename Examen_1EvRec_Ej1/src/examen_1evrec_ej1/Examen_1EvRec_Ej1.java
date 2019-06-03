package examen_1evrec_ej1;

import java.util.Scanner;

 /***********************************************************************************************************************
 * @author baha                                                                                                         *
 * <p>fecha de inicializacion: Jun 3, 2019 10:47:48 PM<p>                                                               *
 * <p>nombre del proyecto: Examen_1EvRec_Ej1.java<p>                                                                    *
 * <p>Anteriores versiones en:</p>                                                                                      *
 * <p><a href="https://github.com/BahamutEscarlata/Examenes_JAVA.git">GIT</a></p>                                       *
 ************************************************************************************************************************
 *                                                                                                                      *
 * <h1>Función de la clase:</h1>                                                                                        *
 * <p>1. Se quiere sumar números grandes, tan grandes que no pueden almacenarse en variables de tipo int ni long.       *
 *       Por lo que se ha pensado en introducir cada número como una cadena de caracteres y realizar la suma            *
 *       extrayendo los dígitos de ambas cadenas.                                                                       *
 *       (a) Justifica la elección de la cabecera del método que realice este tipo de suma.                             *
 *       (b) Implementa el método que realice este tipo de suma.                                                        *
 *       NOTA: los sumandos tendrán un tamaño máximo de 128 dígitos.</p>                                                *
 * @version 1.0                                                                                                         *
 * <p>Tiempo invertido en esta versión: 0 horas 50 minutos 30 segundos</p>                                              *
 *                                                                                                                      *
 ***********************************************************************************************************************/
public class Examen_1EvRec_Ej1 {
                                                                                                
    /********************************************************************************************************************
    *                                                                                                                   *
    * <h1>MÉTODO MAIN</h1>                                                                                              *
    * <p>Funcion:</p>                                                                                                   *
    * <p>Pedir los dos números y llamar al método que los suma, para después mostrar el resultado.</p>                  *
    *                                                                                                                   *
    ********************************************************************************************************************/
    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        // VARIABLES LOCALES //
        String sumando1;
        String sumando2;
        String resultado;
        //FRONTEND//
            //PETICION DE DATOS//
            sumando1 = getNumero();
            sumando2 = getNumero();
        
        //BACKEND//
        resultado = sumaString(sumando1, sumando2);
        System.out.println("Resultado: " + resultado);
    }
    

    //Metodos suplementarios de la clase principal//

    /**_________________________________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                                               |
     | <p>Suma los dos números de tipo String, y devuelve la suma entre ellos</p>                                       |
     | ~~~~<p>Parámetros:</p>~~~~                                                                                       |
     | @return la suma de los sumandos                                                                                  |
     | ~~~~<p>Método dirigido a:   BackEnd</p>~~~~                                                                      |
     |_________________________________________________________________________________________________________________*/
    static String sumaString(String sumando1, String sumando2)
    {
        //VARIABLES LOCALES//
        String resultado = "";
        int contadorSumando1;
        int contadorSumando2;
        int sumaCifras = 0;
        boolean llevoUna = false;
        //CUERPO DEL METODO//
        
        //preparamos los sumandos para operar//
        if(sumando1.length() > sumando2.length())
        {
            sumando2 = rellenaCerosIzq(sumando2, (sumando1.length()-sumando2.length()));
        }
        else
            sumando1 = rellenaCerosIzq(sumando1, (sumando2.length()-sumando1.length()));
        
        //sumamos las cifras una por una con cada iteración del bucle for
        for(contadorSumando1 = sumando1.length()-1, contadorSumando2 = sumando2.length()-1;
                contadorSumando1 >= 0 || contadorSumando2 >= 0; contadorSumando1--, contadorSumando2--)
        {
            //si nos hemos llevado una en la última operación
            if(llevoUna)
            {
                sumaCifras++;
                llevoUna = false;
            }
            
            //REALIZACIÓN DE LA SUMA DE CIFRAS//
            sumaCifras += transforCifra(sumando1.charAt(contadorSumando1)) + transforCifra(sumando2.charAt(contadorSumando2));
            
            //Si nos llevamos una
            if(sumaCifras >= 10)
            {
                sumaCifras -= 10;
                llevoUna = true;
            }
            
            //Ponemos la cifra sumaCifras en la cadena resultado donde almacenamos el resultado
            resultado = sumaCifras + resultado;
            
            //Ponemos la cifra que almacena el resultado de nuevo a 0
            sumaCifras = 0;
        }
        
        //En caso de que la longitud de resultado sea mayor que la de sumando1 y sumando2, es decir, si se sigue llevando 1
        if(llevoUna)
            resultado = 1 + resultado;
        return resultado;
    }

    
    /**_________________________________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                                               |
     | <p>Coge el carácter y lo transforma al número correspondiente.</p>                                               |
     | ~~~~<p>Parámetros:</p>~~~~                                                                                       |
     | @return la suma de los sumandos                                                                                  |
     | ~~~~<p>Método dirigido a:   BackEnd</p>~~~~                                                                      |
     | ~~~~<p>Devuelve -1 si la cifra introducida no es un número</p>                                                   |
     |_________________________________________________________________________________________________________________*/
    static int transforCifra(char cifra)
    {
        //CUERPO DEL METODO//
        switch(cifra)
        {
            case 48: return 0;
            case 49: return 1;
            case 50: return 2;
            case 51: return 3;
            case 52: return 4;
            case 53: return 5;
            case 54: return 6;
            case 55: return 7;
            case 56: return 8;
            case 57: return 9;
            default: return -1;
        }
    }
    
    
    /**_________________________________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                                               |
     | <p>Pedir un número en cadena y devolverlo.</p>                                                                   |
     | ~~~~<p>Parámetros:</p>~~~~                                                                                       |
     | @return El número a sumar                                                                                        |
     | ~~~~<p>Método dirigido a: FrontEnd </p>~~~~                                                                      |
     |_________________________________________________________________________________________________________________*/
    static String getNumero()
    {
        //VARIABLES LOCALES//
        Scanner in = new Scanner(System.in);
        String numero;
        boolean centinela;
        //CUERPO DEL METODO//
        do
        {
            centinela = false;
            System.out.println("Introduzca el número a sumar: ");
            numero = in.nextLine();
            for(int i = 0; i < numero.length(); i++)
            {
                if(transforCifra(numero.charAt(i)) == -1)
                    centinela = true;
            }
        }while(centinela);
        return numero;
    }
    
    
    /**_________________________________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                                               |
     | <p>Coge una cadena de caracteres y le pone tantos 0 a la izquierda como se indique</p>                           |
     | ~~~~<p>Parámetros:</p>~~~~                                                                                       |
     | @return la suma de los sumandos                                                                                  |
     | ~~~~<p>Método dirigido a:   BackEnd</p>~~~~                                                                      |
     | ~~~~<p>Devuelve -1 si la cifra introducida no es un número</p>                                                   |
     |_________________________________________________________________________________________________________________*/
    static String rellenaCerosIzq(String cadena, int ceros)
    {
        //CUERPO DEL METODO//
        for(int i = 0; i < ceros; i++)
        {
            cadena = "0" + cadena;
        }
        return cadena;
    }
}