import Model.*;


public class App {
    public static void main(String[] args) {
        
        Square square = new Square();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        
        //Inicializar los atributos de cuadrado
        square.setLado(10);
        square.setMessage("");
        //Inicializar los atributos de circulo
        circle.setRadio(10);
        //Inicializar los atributos de Triangulo
        triangle.setBase(10);
        triangle.setLado(10);

        //Cuadrado
        System.out.println("Perimetro del cuadrado: "+square.getPerimetro());
        System.out.println("Area del cuadrado: "+square.getArea());
        //Circulo
        System.out.println("Perimetro del circulo: "+circle.getPerimetro());
        System.out.println("Area del circulo: "+circle.getArea());
        //Triangulo
        System.out.println("Perimetro del triangulo: "+triangle.getPerimetro());
        System.out.println("Area del triangulo: "+triangle.getArea());
}
 }