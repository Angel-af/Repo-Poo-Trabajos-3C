package Model;

public class Computadora {
    private String marca;
    private String modelo;
    private Boolean encendida=false;

    
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    
    public Boolean getEncendida() {
        return encendida;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void encender (){

        if (!encendida){
           this.encendida=true;
           System.out.println("Encendiendo...");
        }

    }
    public void apagar (){
        if (encendida==true)
        this.encendida=false;
        System.out.println("Apagando...");
    }


}
