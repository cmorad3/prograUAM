package veterinaria;

public class Principal {
    
    public static void main(String[] args){
    Cliente cliente1 = new Cliente ("1161911155", "Chris", "60595959");
    Mascota mascota1 = new Mascota("Susy", "Perro", 5, 25.5, cliente1);
    Mascota mascota2 = new Mascota("Leonidas", "Perro", 2, 0.9);

   mascota1.mostrarResumen();
        System.out.println("Duenio: " + mascota1.getDuenio().getNombre());
     System.out.println("-------------------------------------------");
    mascota2.mostrarResumen();
    
  }
}
