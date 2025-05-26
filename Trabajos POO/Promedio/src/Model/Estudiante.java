package Model;

public class Estudiante {
    private String nombre;
    private String matricula;
    private double [] notas = new double [5];
    
    public String getNombre (){
    return nombre;
}
//Setters y Getters
public void setNombre(String nombre){
    this.nombre = nombre;
}
public String getMatricula (){
    return matricula;
}
public void setMatricula (String matricula){
    this.matricula = matricula;
}
public double getNota (int i){
    return notas [i];
}
public void setNota (int i, double nota){
    notas[i] = nota;
}

//Calcular Promedio
public double CalcularPromedio (){
    double suma = 0;
    for (int i = 0; i < notas.length; i++){
        suma += notas[i];

    }
    return suma / notas.length;
}

public boolean aprobado (){
    double promedio = CalcularPromedio();
    return promedio >= 70;
}

}

