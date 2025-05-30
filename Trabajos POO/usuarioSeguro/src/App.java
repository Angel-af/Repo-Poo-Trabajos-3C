import Model.UsuarioSeguro;

public class App {
    public static void main(String[] args) throws Exception {
        UsuarioSeguro user = new UsuarioSeguro();
        user.setUserName("Angel");
        user.setPassword("p4567M8");

        if (user != null && user.authenticate("p4567M8")){
            System.out.println("Acceso coincidido");
        }else{
            System.out.println("Acceso denegado");
        }
        
    }
}
