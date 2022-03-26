package Midterm.Question3;

public class Psychiatrist {
    String name;
    Moody moody;
    public Psychiatrist(String name, Moody moody){
        this.name = name;
        this.moody = moody;
    }
    public void examine(Moody moodyObject) {
        System.out.println("How are you feeling today?");
        System.out.println(moodyObject.getMood());

    }
    public void observe(Moody moodyObject){

        moodyObject.ExpressFeelings();
        System.out.println("Observation: " + moodyObject.toString());
    }

    public String toString(){
        String mood = "Subject laughs a lot";
        return mood;
    }
}