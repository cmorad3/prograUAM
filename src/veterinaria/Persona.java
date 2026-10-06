
package veterinaria;


public abstract class Persona {
    
    protected String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona() {
        this.nombre = "Sin nombre";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
      
    
}
