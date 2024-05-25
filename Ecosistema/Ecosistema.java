package Ecosistema;

import java.util.ArrayList;
import java.util.List;

public class Ecosistema {
    private List<Organismo> organismos;

    public Ecosistema() {
        this.organismos = new ArrayList<>();
    }

    public void agregarOrganismo(Organismo organismo) {
        organismos.add(organismo);
    }

    public void mostrarEcosistema() {
        for (Organismo organismo : organismos) {
            System.out.println("Organismo: " + organismo.getNombre() + ", Alimento: " + organismo.getAlimento());
            organismo.comer();
            if (organismo instanceof Fotosintetizador) {
                ((Fotosintetizador) organismo).fotosintetizar();
            }
            if (organismo instanceof Descomponedor) {
                ((Descomponedor) organismo).descomponer();
            }
        }
    }

    public static void main(String[] args) {
        Ecosistema ecosistema = new Ecosistema();

        Planta planta = new Planta("Planta", "Luz solar");
        Animal animal = new Animal("Animal", "Comida");
        Carnivoro carnivoro = new Carnivoro("León", "Carne");
        Herbivoro herbivoro = new Herbivoro("Vaca", "Hierba");
        BacteriaDescomponedora bacteria = new BacteriaDescomponedora("Bacteria", "Materia orgánica");
        Alga alga = new Alga("Alga", "Luz solar y Materia orgánica");

        ecosistema.agregarOrganismo(planta);
        ecosistema.agregarOrganismo(animal);
        ecosistema.agregarOrganismo(carnivoro);
        ecosistema.agregarOrganismo(herbivoro);
        ecosistema.agregarOrganismo(bacteria);
        ecosistema.agregarOrganismo(alga);

        ecosistema.mostrarEcosistema();
    }
}