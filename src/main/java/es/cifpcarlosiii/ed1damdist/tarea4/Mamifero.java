package es.cifpcarlosiii.ed1damdist.tarea4;

/**
 * Clase Mamifero que hereda de la clase Animal
 */
public class Mamifero extends Animal {

    /**
     * Constructor de la clase Mamifero
     * Inicializa el mamifero con un nombre
     * @param nombre Nombre del mamifero
     */
    public Mamifero(String nombre) {
        super(nombre);
    }

    @Override
    void reproducir() {
        System.out.println("La reproduccion es vivipara");
    }

    @Override
    void relacionar(Animal m) {
        System.out.println("Con el mamifero: " + m.getNombre());
    }
}
