package Ecosistema;

public class Alga extends Organismo implements Fotosintetizador, Descomponedor {
    public Alga(String nombre, String alimento) {
        super(nombre, alimento);
    }

    @Override
    public void fotosintetizar() {
        System.out.println(getNombre() + " está realizando la fotosíntesis.");
    }

    @Override
    public void descomponer() {
        System.out.println(getNombre() + " está descomponiendo materia orgánica.");
    }
}