package AccessModifiers;

public class Prueba_1 {
    //ATRIBUTOS
    private String namme;
    private int age;

    //CONSTRUCTORR
    public Prueba_1(String namme, int age){
        this.namme = namme;
        this.age = age;

    }
    //GETTERS Y SETTERS
    public String getNamme(){
        return namme;
    }

    public int getAge() {
        return age;
    }

    public void setNamme(String namme) {
        this.namme = namme;
    }
    public void setAge(int age){
        this.age = age;
    }

    //METODO, PARA MOSTRAR AL USUARIO
    public void ShowDatosPerson(){
        System.out.println("Mi nombre es: " + getNamme() + "Mi edad es: " + getAge());
    }

}
