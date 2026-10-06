package veterinaria;

public class Mascota {

    private String nombre;
    private String especie;
    private int edad;
    private double peso;
    private Cliente dueno;

    public Mascota(String nombre, String especie, int edad, double peso) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;
    }

    public Mascota(String nombre, String especie, int edad, double peso, Cliente duenio) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;
        this.dueno = duenio;
    }

    public Cliente getDuenoo() {
        return dueno;
    }

    public void setDuenoo(Cliente duenio) {
        this.dueno = duenio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void mostrarResumen() {
        System.out.println("Mascota: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad);
        System.out.printf("Peso: %.2f kg%n", peso);

        if (this.dueno != null) {
            System.out.println("Dueno: " + this.dueno.getNombre());
        }
    
    
    }
}