
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
public class Libro {
    private String titulo;
    private String autor;
    private int isbn;
    private boolean prestado;

    static int nextIsbn = 1;

    Libro(String titulo, String autor)
    {
        this.titulo = titulo;
        this.autor = autor;
        isbn = nextIsbn;
        nextIsbn++;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }
    
    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", isbn=" + isbn + ", prestado=" + prestado + '}';
    }
    
    
}
