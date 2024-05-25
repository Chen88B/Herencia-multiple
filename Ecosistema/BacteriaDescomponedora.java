package Ecosistema;

public class BacteriaDescomponedora extends Organismo implements Descomponedor {
    public BacteriaDescomponedora(String nombre, String alimento) {
        super(nombre, alimento);
    }

    @Override
    public void descomponer() {
        System.out.println(getNombre() + " está descomponiendo materia orgánica.");
    }
}