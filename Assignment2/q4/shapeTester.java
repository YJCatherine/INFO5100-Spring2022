package Assignment2.q4;


public class shapeTester {
    public static void main(String[] args) {
        Shape s = new Shape();
        Rectangle r = new Rectangle(2.0, 3.0, "rectangle");
        Circle c = new Circle(4.0, "circle");
        r.computeArea();
        r.computePerimeter();
        c.computeArea();
        c.computePerimeter();


        r.display();
        c.display();
        s.display();
    }
}