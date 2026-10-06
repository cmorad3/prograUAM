package veterinaria;

public class Principal {
    
    public static void main(String[] args){
    Cliente cliente1 = new Cliente ("1161911155", "Chris", "60595959");
    Mascota mascota1 = new Mascota("Susy", "Perro", 5, 25.5, cliente1);
    Mascota mascota2 = new Mascota("Leonidas", "Perro", 2, 0.9);

   mascota1.mostrarResumen();
        System.out.println("Dueno : " + mascota1.getDuenoo().getNombre());
     System.out.println("-------------------------------------------");
    mascota2.mostrarResumen();
    
    cliente1.setIdentificacion("222222");
System.out.println("Dueno :" + mascota1.getDuenoo().getIdentificacion()); 

Veterinario veterinario1 = new Veterinario("v0000", "Medicina general". "Kali"); 


Consulta consulta1 = new Consulta(
        "5/10/2026", 
        "Control General", 
        mascota1, 
        15000);
veterinario1();

consulta1.mostrarResumen();
consulta1.actualizarCosto(17500);
consulta1.mostrarResumen();

System.out.println("-------------------------------------------");
consulta1.actualizarCosto(18000, "Control y medicamento");
consulta1.mostrarResumen();


Cliente cliente2 = new Cliente ("222222", "Carlos","89898998");
Persona personaReferencia = cliente2;
System.out.println(cliente2.getNombre());
System.out.println(personaReferencia.getNombre());
  }
}
