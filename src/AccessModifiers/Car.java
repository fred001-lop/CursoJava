package AccessModifiers;

public class Car {
    //ATRIBUTOS
    private int speed;

    //constructor
    public Car(){
        this.speed = 0;
    }

    //metodo para acelerar
    public void accelerate(int amount){
        if (amount > 0){
            speed += amount;
            if (speed > 120){
                speed =120;
            }
        }

    }

    //METODO PARA FRENAR
    public void brake(int amount){
        if (amount > 0){
            speed -= amount;
            if (speed < 0){
                speed = 0;
            }
        }
    }

    //metodo para calcular velocidad actual
    public int getSpeed(){
        return speed;
    }




}
