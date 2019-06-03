
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
public class Lector {
    String nombre;
    String apellidos;
    String fechaNac;
    int codigo;
    static int nextCodigo;

    Lector(String nombre, String apellidos, String fechaNac)
    {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNac = fechaNac;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    @Override
    public String toString() {
        return "Lector{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", fechaNac=" + fechaNac + ", codigo=" + codigo + '}';
    }
    
    
}
