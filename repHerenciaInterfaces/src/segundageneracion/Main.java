package segundageneracion;

import purasangre.Vampiro;

public class Main {

    public static void main(String[] args) {
        Dracula dracula = new Dracula("Vladimir|-Dracula", 500);
        dracula.morder();//método heredado de la clase abstracta Vampiro
        dracula.chupaSangre();//método heredado de la clase abstracta Vampiro
        dracula.volar();//Método abstracto de la interfaz Murcielago
        dracula.comerFrutas();//método opcional

        Murcielago.chichi();//método estático de una interfaz

        Vampiro x = new Vampiro("Oto|-Vampiro", 500) {

            @Override
            protected void aguantarSol() {

            }
        };
    }
}