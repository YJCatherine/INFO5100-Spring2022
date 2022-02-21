package Assignment2.q3;

public class Shape {
    String name;
    String color;
    double area;
    double perimeter;

    public Shape() {
    }

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Shape(String name, String color, int perimeter, int area) {
        this.name = name;
        this.color = color;
        this.area = area;
        this.perimeter = perimeter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(int perimeter) {
        this.perimeter = perimeter;
    }

    public void printShape() {
        System.out.println(this.name);
    }

    public void display() {
    }
}