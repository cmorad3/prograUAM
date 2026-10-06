package veterinaria;

public class Consulta {

    private String fecha;
    private String motivo;
    private Mascota mascota;
    private double costo;
    private Veterinario veterinario;

    public Consulta(String fecha, String motivo, Mascota mascota, double costo, Veterinario veterinario) {
        this.fecha = fecha;
        this.motivo = motivo;
        this.mascota = mascota;
        this.costo = costo;
        this.veterinario = veterinario;
    }

    public Consulta(String fecha, Mascota mascota) {
        this.fecha = fecha;
        this.mascota = mascota;
        this.motivo = "Consula general";
        this.costo = 0.0;
    }

    public Consulta() {
        this.fecha = "Sin fecha";
        this.motivo = "Sin motivo";
        this.mascota = null;
        

    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public String getFecha() {
        return fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public double getCosto() {
        return costo;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public void actualizarCosto(double costo) {
        this.costo = costo;
    }

    public void actualizarCosto(double costo, String motivo) {
        setCosto(costo);
        this.motivo = motivo;
    }

    public void mostrarResumen() {
        System.out.println("Fecha" + fecha);
        System.out.println("Motivo" + motivo);
       if (mascota!= null) mascota.mostrarResumen();
       if(veterinario != null) System.out.println (veterinario.getNombre());
       System.out.printf("Costo ¢%.2f%n", costo);
               
       

    }

}
