package Assignment2.q3;

public class Rhombus extends Shape {
    double d1;
    double d2;

    public Rhombus(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
        this.name = "Rhombus";
        this.perimeter = (Math.sqrt(d1 * d1 + d2 * d2)) / 2;
    }

    public Rhombus(double d1) {
        this.d1 = d1;
        this.d2 = d1;
        this.name = "Rhombus";
        this.perimeter = (Math.sqrt(d1 * d1 + d1 * d1)) / 2;
    }

    public double getPerimeter() {
        double perimeter = 0;
        double side = Math.sqrt(Math.pow((this.d1 / 2), 2) + Math.pow((this.d2 / 2), 2));
        perimeter = side * 4;
        return perimeter;
    }

    public double getArea() {
        double area = 0;
        if (d2 == 0) {
            area = d1 * d1 / 2;
        } else {
            area = d1 * d2 / 2;
        }
        return area;
    }

    public double getD1() {
        return d1;
    }

    public void setD1(double d1) {
        this.d1 = d1;
    }

    public double getD2() {
        return d2;
    }

    public void setD2(double d2) {
        this.d2 = d2;
    }

}