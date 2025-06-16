package Model;

public class Curso {
    public String codigo;
    public String nombre;
    private Estudiante[] inscritos;

    public Curso (String codigo, String nombre, int capacidad){
        
        this.codigo=codigo;
        this.nombre=nombre;
        inscritos = new Estudiante[capacidad];        

    }

     public boolean inscribir (Estudiante e){
        
        for(int i = 0; i < inscritos.length; i++){
            if (inscritos [i] == null){
                inscritos [i] = e;
                return true;
            }
        }
        return false;
    }

    public double calcularPromedioGrupo(){
        double suma = 0;
        int contador = 0;
        for (int i = 0; i < inscritos.length; i++){
            if (inscritos[i] !=null){
                suma+= inscritos[i].getPromedio();
                contador++;
            }
        }
        return suma / contador;
    }     
}

