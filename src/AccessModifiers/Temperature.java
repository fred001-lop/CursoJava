package AccessModifiers;

public class Temperature {
    //atributoss
    private double celcius;

    //CONSTRUCTOR
    public Temperature(double celcius){
        setCelcius(celcius);
    }




    public double getCelcius(){
        return celcius;
    }


    //setter
    public void setCelcius(double celcius){
        if (celcius >= -100 && celcius <= 100){
            System.out.println("El numero es: " );
            this.celcius = celcius;

        }else {
            System.out.println("El numero no cumple");
        }
    }

}
