package Model;

public class Triangle {
     private double base;
     private double lado;

     public void setBase(double base) {
        this.base = base;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }
     public double getBase() {
        return base;
    }
    public double getLado() {
        return lado;
    }
     public double getPerimetro() {
        return 2*lado + base;
    }
    //Metodo para calcular el area del cuadrado
    public double getArea() {
        double altura = Math.sqrt(Math.pow(lado, 2) - Math.pow(base / 2, 2));
        return (base * altura)/2;
    }
}
