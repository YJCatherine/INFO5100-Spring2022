package Assignment2.q4;

public class Circle extends Shape{

    private double radius;
    public Circle() {}

    public Circle(double radius, String name) {
        super(name);
        this.radius = radius;
    }

    public void computeArea() {
        this.area = this.radius * this.radius * Math.PI;
    }

    public void computePerimeter() {
        this.perimeter = 2 * this.radius * Math.PI;
    }

    @Override
    protected void display() {
        System.out.println("This is " + this.getName() + " : its radius is " + this.getRadius());
        System.out.println("Circle's area is: " + this.getArea());
        System.out.println("Circle's perimeter is : " + this.getPerimeter());
        int r = (int)this.radius;
        for (int y = 0; y <= 2 * r; y += 2) {
            int x = (int)Math.round(r - Math.sqrt(2 * r * y - y * y));
            int len = 2 * (r - x);

            for (int i = 0; i <= x; i++) {
                System.out.print(' ');
            }
            System.out.print('*');

            for (int j = 0; j <= len; j++) {
                System.out.print(' ');
            }

            System.out.println('*');

        }
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}