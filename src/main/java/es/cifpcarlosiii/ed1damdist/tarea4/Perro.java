package es.cifpcarlosiii.ed1damdist.tarea4;

import org.w3c.dom.ls.LSOutput;

/**
 * La clase Perro hereda de la clase Animal
 */
public class Perro extends Animal {
    /**
     * Constructor de la clase Perro
     * Inicializa el perro con un nombre determinado.
     *
     * @param nombre Nombre del  perro
     */
    public Perro(String nombre) {
        super(nombre);
    }

    /**
     * Método que indica como duerme un perro
     */
    @Override
    void dormir() {
        System.out.println("El perro debe dormir en funcion del ejericio que realiza");
    }

    /**
     * Método que representa el ladrido del perro
     */
    void ladrar() {
        System.out.println("Es una labor social de guarda");
    }

    /**
     * Métoodo que representa el gruñido del perro
     */
    void gruñir() {
        System.out.println("Es un sonido ronco y sostenido");
    }

    /**
     * Método que permite relacionar un perro con otro animal.
     *
     * @param p Animal con el que el perro se relaciona
     */
    @Override
    void relacionar(Animal p) {
        System.out.println("Con el perro: " + p.getNombre());
    }

    /**
     *
     * @return Devuelve el nombre del perro
     */
    String ToString() {
        return getNombre();
    }
}
