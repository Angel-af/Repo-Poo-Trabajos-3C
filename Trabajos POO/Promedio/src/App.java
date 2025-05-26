import Model.*;

public class App {
    public static void main(String[] args) throws Exception {
       Estudiante[] estudiantes = new Estudiante[5];

        for (int i = 0; i < estudiantes.length; i++) {
            estudiantes[i] = new Estudiante();
            estudiantes[i].setNombre("Alumno " + (i + 1));
            estudiantes[i].setMatricula("Matricula" + (i + 1));

            for (int j = 0; j < 5; j++) {
                estudiantes[i].setNota(j, 60 + (i * 5) + j); // notas distintas para cada estudiante
            }
        }

        for (Estudiante est : estudiantes) {
            System.out.println("Nombre: " + est.getNombre());
            System.out.println("Matrícula: " + est.getMatricula());
            System.out.println("Promedio: " + est.CalcularPromedio());
            System.out.println("¿Aprobaste?: " + (est.aprobado() ? "Sí" : "No"));
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>");
        }
    }
}

