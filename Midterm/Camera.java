package Midterm;


public class Camera{
    private static final Midterm.Midterm.Camera test = new Midterm.Midterm.Camera();

    private Camera(){

    }

    public static Midterm.Midterm.Camera getInstance(){
        return test;
    }
}

