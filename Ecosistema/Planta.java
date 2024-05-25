package Ecosistema;

public class Planta extends Organismo implements Fotosintetizador {
    public Planta(String nombre, String alimento) {
        super(nombre, alimento);
    }

    @Override
    public void fotosintetizar() {
        System.out.println(getNombre() + " está realizando la fotosíntesis.");
    }
}