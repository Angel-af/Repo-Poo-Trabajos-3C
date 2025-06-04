import Model.Circle;
import Model.FigureAbs;
import Model.Square;
import Model.Triangle;
import Model.TriangleEquilatero;
import Model.TriangleEscaleno;

public class App {
    public static void main(String[] args) throws Exception {

        FigureAbs sq = new Square(10);
        FigureAbs cir = new Circle(10);
        FigureAbs triangle = new Triangle(20, 25, 20);
        FigureAbs EqTriangle = new TriangleEquilatero(25);
        FigureAbs EsTriangle = new TriangleEscaleno(13, 14, 15);

        FigureAbs[] figures = { sq, cir, triangle, EqTriangle, EsTriangle };

        for (FigureAbs figureAbs : figures) {
            System.out.println("La clase es: " + figureAbs.getClass().getSimpleName());
            System.out.println("El area es: " + figureAbs.getArea());
            System.out.println("El perimetro es: " + figureAbs.getPerimeter());
            System.out.println("----------------------------------------------------");
        }
    }
}
