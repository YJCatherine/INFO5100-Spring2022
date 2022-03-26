package Midterm.Question3;

public class Main {

    public static void main(String[] args) {

        Psychiatrist psychiatrist = new Psychiatrist("Psychiatrist");
        Sad sad = new Sad();
        Happy happy = new Happy();

        psychiatrist.examine(happy);
        psychiatrist.observe(happy);
        psychiatrist.examine(sad);
        psychiatrist.observe(sad);
    }
}
