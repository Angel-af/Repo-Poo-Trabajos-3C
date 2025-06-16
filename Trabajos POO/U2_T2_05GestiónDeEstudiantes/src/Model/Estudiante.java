package Model;

public class Estudiante extends Persona {
    public double promedio;

    public Estudiante (String nombre, String email, double promedio){
        super(nombre, email);
        this.promedio=promedio;
    }

    public double getPromedio (){
        return promedio;
    }

}
