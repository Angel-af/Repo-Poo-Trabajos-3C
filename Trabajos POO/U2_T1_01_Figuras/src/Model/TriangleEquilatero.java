package Model;

public class TriangleEquilatero extends FigureAbs{

    private double side;

    public TriangleEquilatero (double side){
        this.side = side;
    }

    public double getSide (){
        return side;
    }
    public void setSide(double side){
        this.side = side;
    }
    public double getArea(){
        return (Math.sqrt(3)/4)*side *side;
    }

    public double getPerimeter (){
        return 3*side;
    }

}
