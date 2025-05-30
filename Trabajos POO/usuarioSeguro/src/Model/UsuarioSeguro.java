package Model;

public class UsuarioSeguro {
    private String username;
    private String password;
   
    //setters
    public void setUserName(String username) {
        if (username == null || username.isEmpty()){
            System.out.println("El nombre de usaurio no acepta campos vacios");
            
        }
        this.username = username;
    
    }
    
    public void setPassword(String password) {

        if (password.length() > 7){

            System.out.println("Error, escriba una contraseña de 8 o más caracteres");
        }       

        boolean mayus = false;
        boolean lowerCase = false;
        boolean digit = false;

        for (int i = 0; i < password.length(); i++){

            char charter = password.charAt(i);

            if (Character.isUpperCase(charter)){
                mayus=true;
            }else if (Character.isLowerCase(charter)){
                lowerCase=true;
            }else if (Character.isDigit(charter)){
                digit=true;
            }  
            
        }

        if (mayus == false){
            System.out.println("Tu contraseña debe de incluir mayusculas");

        } else if (lowerCase == false){
            System.out.println("Tu contraseña debe de incluir minusculas");

        }else if (digit == false){
            System.out.println("Tu contraseña debe de incluir digitos");
        }  

        this.password = password;
    }

    public boolean authenticate (String intentPassword){

        if (this.password == null){
            return false;
        }
        return this.password.equals(intentPassword);
    }


}
