package Ecosistema;

public class Organismo {
    private String nombre;
    private String alimento;

    // Constructor
    public Organismo(String nombre, String alimento) {
        this.nombre = nombre;
        this.alimento = alimento;
    }

    // Métodos getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    // Método comer
    public void comer() {
        System.out.println(nombre + " está comiendo " + alimento);
    }
}

