package segundageneracion;

import purasangre.Vampiro;

public class Dracula extends Vampiro implements Murcielago {


    public Dracula(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void volar() {
        System.out.println("¡Estoy volando como un murcielago!");
    }

    @Override
    protected void aguantarSol() {
        System.out.println("¡Estoy aguantando el sol!");
    }


}


