package Assignment2.q4;

public class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle() {}

    public Rectangle(double length, double width, String name) {
        super(name);
        this.length = length;
        this.width = width;
    }

    public void computeArea() {
        this.area = this.length * this.width;
    }

    public void computePerimeter() {
        this.perimeter = 2 * (this.length + this.width);
    }

    @Override
    protected void display() {
        System.out.println("Rectangle"+ this.getName() + " has length:" + this.getLength() +" and has width:" + this.getWidth() );
        System.out.println("Rectangle has area is: " + this.getArea());
        System.out.println("Rectangle has perimeter : " + this.getPerimeter());
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
