package Midterm.Question3;

public class Happy extends Moody{
    @Override
    String getMood() {
        return "I feel happy Today";
    }

    @Override
    void ExpressFeelings() {
        System.out.println("heeehee....hahahah...HAHAHA!!");
    }

    public String toString(){
        String mood = "Subject laughs a lot";
        return mood;
    }
}