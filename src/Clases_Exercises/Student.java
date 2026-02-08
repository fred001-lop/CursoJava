package Clases_Exercises;

public class Student {

    //Clase Student con atributo score
    int score;

    public Student(int score){
        this.score = score;
    }
    //METODO
    //diga si aprobó (mayor o igual a 60).
    public void sayScore(){
        if (score >= 60 ){
            System.out.println("Aprobo el semestre");
        }else {
            System.out.println("Reprobo");
        }

    }





}
