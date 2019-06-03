package examen_1ev_ej1;
public class Examen_1Ev_Ej1 {
    //FINALIZADA CON TIEMPO RESTANTE: 2 HORAS 7 MINUTOS 4 SEGUNDOS
    public static void main(String[] args) {
        Lector lector1 = new Lector("Raistlin", "Majere", "2000/12/11");
        Lector lector2 = new Lector("Julián", "Sorel", "1830/11/13");
        
        Libro libro1 = new Libro("Crónicas de la Dragonlance", "Tracy Hickman and Margaret Weis");
        Libro libro2 = new Libro("Rojo y Negro", "Stendhal");
        
        Prestamo prestamo1 = new Prestamo(libro1, lector1);
        Prestamo prestamo2 = new Prestamo(libro2, lector2);
        
        System.out.println(lector1.toString());
        System.out.println(lector2.toString());
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        System.out.println(prestamo1.toString());
        System.out.println(prestamo2.toString());
    }
}