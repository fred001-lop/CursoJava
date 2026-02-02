package Functions_Exercises;

public class Exercise_7 {
    public static void main(String[] args) {
        // 7. Implementa una función que reciba una cadena y retorne su longitud.
        String texto = "Esta es una cadena";
        int tex = cadena(texto);
        System.out.println("El tamaño es:" + tex);

    }

    public static int cadena (String nombre){
        return nombre.length();
    }
}
