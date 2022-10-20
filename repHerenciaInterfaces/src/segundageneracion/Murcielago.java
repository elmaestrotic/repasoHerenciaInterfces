package segundageneracion;

public interface Murcielago {

     void volar();

     default void comerFrutas(){
         System.out.println("¡Estoy comiendo fruta!");
     }

     static void chichi(){
         System.out.println("¡Estoy haciendo chichi!");
     }


}
