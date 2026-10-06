package veterinaria;

public class Cliente extends Persona{

    String identificacion;
    String nombre;
    String telefono;

    public Cliente(String identificacion, String nombre, String telefono) {
        super(nombre);
        this.identificacion = identificacion;
        this.telefono = telefono;
    }

    public String getIdentificacion() {

        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        if (identificacion == null || identificacion.trim().equals("")) {
            System.out.println("El id no es valido");
        } else {
            this.identificacion = identificacion;
        }
    }

 
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if (telefono == null || telefono.trim().equals("")) {
            System.out.println("El telefono no es valido");
        } else {
            this.telefono = telefono;
        }
    }
}
