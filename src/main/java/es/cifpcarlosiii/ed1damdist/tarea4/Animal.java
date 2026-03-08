package es.cifpcarlosiii.ed1damdist.tarea4;

/**
 * Clase padre Animal
 */
public class Animal {
    /**
     * Atributo privado que guarda el nombre del animal
     */
    private String nombre;

    /**
     *
     * @return nombre obtiene el nombre del animal
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre cambia el nombre del animal
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;

    }

    /**
     * Es el constructor de la clase
     * @param nombre
     */
    public Animal(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Representa la accion de comer
     */
    void comer() {
        System.out.println("Necesita comer diarimente para sobrevivir");
    }

    /**
     * Representa la accion de dormir
     */
    void dormir() {
        System.out.println("Dormir es indispensable para descansar");
    }

    /**
     * Este metodo puede ser sobreescrito por clases hijas
     */
    void reproducir() {
        System.out.println("Originar nuevos seres vivos");
    }

    /**
     *
     * @param a Relaciona un animal con otro
     */
    void relacionar(Animal a) {
        System.out.println("Con el animal: " + a.nombre);
    }

    /**
     * convierte el objeto en texto cuando los imprimes
     * @return
     */
    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
