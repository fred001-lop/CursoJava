package AccessModifiers;

public class User {
    //ATRIBUTOSS
    private String userName;
    private String password;

    //constructor
    public User(String userName, String password){
        this.userName = userName;
        this.password = password;
    }

    //setter
    public void setUser(String userName){
        this.userName = userName;
    }
    public void setPassword(String password){
        this.password = password;
    }


    //METODO


    public void checkPassword(String inputPassword){
        if (this.password.equals(inputPassword)){
            System.out.println("Contraseña Correcta");
            System.out.println("Bienvenido: "+ userName);
        }else{
            System.out.println("Contraseña Incorrecta");
        }


    }

}
