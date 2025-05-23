
package Model;

public class Square {
    private double lado;
    private String message;
    //Metodo para inicializar lado (side)
    public void setLado(double lado) {
        this.lado = lado;
    }
    //Metodo para obtener el valor de lado (side)
    public double getLado() {
        return lado;
    }
    //Metodo para inicializar message
    public void setMessage(String message) {
        this.message = message;
    }
    //Metodo para calcular el valor del perimetro del cuadrado
    public double getPerimetro() {
        return lado*4;
    }
    //Metodo para calcular el area del cuadrado
    public double getArea() {
        if(!this.message.isEmpty()){
            getSecretMessage();
        }
        return lado*lado;
    }
    private void getSecretMessage(){
        System.out.println("Este metodo solo es accesible dentro de la clase, pero no desde afuera");
    }
}