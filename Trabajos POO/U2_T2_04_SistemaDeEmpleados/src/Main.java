import Model.Empleado;
import Model.EmpleadoPorHoras;
import Model.EmpleadoTiempoCompleto;

public class Main {
    public static void main(String[] args) throws Exception {

        //Empleado tiempo completo
        Empleado empleadoTiempoCompleto1 = new EmpleadoTiempoCompleto("JAAF0201", "Jose Angel", 1500, "Seguro Medico");
        
        System.out.println(" ------ Empleado por tiempo completo -----");
        System.out.println("id: " + empleadoTiempoCompleto1.getId());
        System.out.println("Nombre: " + empleadoTiempoCompleto1.getNombre());
        System.out.println("Salario: " + empleadoTiempoCompleto1.getSalarioBase());
        System.out.println(" ");
        
        //Empleado por hora
        Empleado empleadoHora1 = new EmpleadoPorHoras("JSPA0202", "Josue Pantaleon", 2500, 8);
        
        System.out.println(" ------ Empleado por hora -----");
        System.out.println("id: " + empleadoHora1.getId());
        System.out.println("Nombre: " + empleadoHora1.getNombre());
        System.out.println("Salario: " + empleadoHora1.getSalarioBase());
        
        

    }
}
