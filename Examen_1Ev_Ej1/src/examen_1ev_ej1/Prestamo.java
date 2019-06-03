
package examen_1ev_ej1;

/**
 *
 * @author baha
 * Tipo: FrontEnd // BackEnd
 * Paquete: examen_1ev_ej1
 *
 * Funcion: 
 *          
 */
public class Prestamo {
    Libro libro;
    Lector lector;
    int codigo;
    static int nextCodigo = 1;

    Prestamo(Libro libro, Lector lector)
    {
        this.libro = libro;
        this.lector = lector;
        codigo = nextCodigo;
        nextCodigo++;
    }
    
    public Libro getLibro() {
        return libro;
    }

    public Lector getLector() {
        return lector;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "libro=" + libro + ", lector=" + lector + ", codigo=" + codigo + '}';
    }
    
    
}
