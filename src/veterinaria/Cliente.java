package veterinaria;
public class Cliente {
    String identificacion;
    String nombre;
    String telefono;

    public String getIdentificacion() {
        return identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public Cliente(String identificacion, String nombre, String telefono) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.telefono = telefono;
    }
    
    
    
    
}
