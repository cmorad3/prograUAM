package veterinaria;

public class Veterinario extends Persona{
    
    private String codigo;
    private String especialidad;

    public Veterinario(String codigo, String especialidad, String nombre){ 
        super(nombre);
        this.codigo= codigo;
        this.especialidad = especialidad;
    }
    

    public String getCodigo() {
        return codigo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    
    

}

