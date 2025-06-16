import Model.Curso;
import Model.Estudiante;

public class Main {
    public static void main(String[] args) throws Exception {
       
        Estudiante alumno1 = new Estudiante("Pancho Villa", "PinachoV@gmail.com", 8.0);
        Estudiante alumno2 = new Estudiante("Yahir del Sol", "Yahirsol@hotmail.com", 8.5);
        Estudiante alumno3 = new Estudiante("Emiliano de la Orca", "EmilianoO@outlook.com", 9.5);

        Curso c1 = new Curso("666", "Ingles", 8);
        
        c1.inscribir(alumno1);
        c1.inscribir(alumno2);
        c1.inscribir(alumno3);

        System.out.println("Promedio total del curso: "+ c1.calcularPromedioGrupo());
    }
}