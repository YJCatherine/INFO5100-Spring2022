package Assignment2.q3;

public class Triangle extends Shape{
    private double base, height;
    private boolean isEqual= false;

    Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    Triangle(double side){
        this.isEqual = true;
        this.base = side;
        this.height = Math.sqrt(Math.pow(side, 2) - Math.pow(side / 2, 2));
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getPerimeter() {
        double perimeter = 0;
        if (isEqual){
            perimeter = this.base * 3;
        }else{
            perimeter = -1;
            System.out.println("(Calculating perimeter need the data of other two sides)");
        }
        return perimeter;

    }

    public double getArea() {
        double area = 0;
        area = (this.base * this.height) / 2;

        return this.area;
    }



    public void isEqual() {
        System.out.println();
        if (isEqual){
            System.out.println(this.getName() + " has equal sides");
        }else{
            System.out.println(this.getName() + " hasn't equal sides");
        }
    }

    public void printShapeForTriangle(){
        this.printShape();
        System.out.println("type: Triangle");
        System.out.println("perimeter: " + this.getPerimeter());
        System.out.println("area: " + this.getArea());
    }
}