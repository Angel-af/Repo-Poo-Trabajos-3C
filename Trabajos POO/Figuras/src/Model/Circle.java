package Model;

public class Circle {
    private double radio;

     public void setRadio(double radio) {
        this.radio = radio;
    }
     public double getRadio() {
        return radio;
    }
     public double getPerimetro() {
        return 2*Math.PI*radio;
    }
    //Metodo para calcular el area del cuadrado
    public double getArea() {
        
        return Math.PI*radio*radio;
    }
}
