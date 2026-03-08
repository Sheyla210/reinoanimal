package es.cifpcarlosiii.ed1damdist.tarea4;

/**
 * Clase gato que hereda de la clase Mamifero
 */
public class Gato extends Mamifero {
    /**
     * Atribut propio pelos
     */
    private int pelos;

    /**
     *
     * Constructor Gato que recibe un nombre
     * super(nombre) llama al coostructor delaclasepadre(mamifero)
     */
    public Gato(String nombre) {
        super(nombre);
    }

    /**
     * Obtiene el valor de pelos
     *
     */
    public int getPelos() {
        return pelos;
    }

    /**
     *
     * @param pelos this.pelos se refiere al atributo de la clase, modifica el valor de pelos
     */
    public void setPelos(int pelos) {
        this.pelos = pelos;
    }

    /**
     * Este metodo reemplaza uno de la clase padre
     */
    @Override
    void dormir() {
        System.out.println("El gato se pasa todo el día durmiendo");
    }

    /**
     * Representa el comportamiento de maullar
     */
    void maullar() {
        System.out.println("Es lo que hacen los gatos");
    }

    /**
     *
     * @param p sobreescribe uno que viene de la clase padre, imprime el nombre del animal con el que se relaciona el gato
     */
    @Override
    void relacionar(Animal p) {
        System.out.println("Con el gato: " +p.getNombre());

    }

}
