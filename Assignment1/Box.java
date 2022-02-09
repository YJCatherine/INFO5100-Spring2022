//Question 10: Implement a class Box class Box {
//double width;
//double height;
//double depth;}
//Initialize the value through constructor. Write a function to calculate the box volume.

public class Box {
    public Box(double width, double height, double depth) {
    }

    public static double calculateBoxVolume(double width, double height, double depth) {
        double boxVolume;
        boxVolume = width * height * depth;
        return boxVolume;
    }

    public static void main(String[] args){
        Box box = new Box(2, 3, 4);
        double boxVolume = Box.calculateBoxVolume(2, 3, 4);
        System.out.println("The volume of box is " + boxVolume);
    }
}