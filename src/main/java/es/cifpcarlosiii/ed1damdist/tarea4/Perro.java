package es.cifpcarlosiii.ed1damdist.tarea4;

import org.w3c.dom.ls.LSOutput;

public class Perro extends Animal {

    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    void dormir() {
        System.out.println("El perro debe dormir en funcion del ejericio que realiza");
    }

    void ladrar() {
        System.out.println("Es una labor social de guarda");
    }

    void gruñir() {
        System.out.println("Es un sonido ronco y sostenido");
    }

    @Override
    void relacionar(Animal p) {
        System.out.println("Con el perro: " + p.getNombre());
    }

    String ToString() {
        return getNombre();
    }




}
