package Model;

public class TriangleEscaleno extends FigureAbs {
    
    private double side1;
    private double side2;
    private double side3;

    public TriangleEscaleno (double side1, double side2, double side3){
       
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    
    }

    public double getSide1(){
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getPerimeter (){

        return side1 + side2 + side3;
    }

    public double getArea (){
        double s = getPerimeter() / 2;
        return Math.sqrt(s*(s- side1)*(s-side2)*(s-side3));

    }



}
