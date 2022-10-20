package purasangre;

public abstract class Vampiro {
    //Atributos de la clase Vampiro
    private String nombre;
    private int edad;

    public Vampiro(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

//Métodos de la clase Vampiro

  public void morder(){
        System.out.println("¡Te mordí!");
    }

    public void chupaSangre(){
        System.out.println("¡Estoy chupando sangre!");
    }

 protected abstract void aguantarSol();

}
