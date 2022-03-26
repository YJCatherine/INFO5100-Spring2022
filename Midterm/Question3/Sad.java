package Midterm.Question3;

public class Sad extends Moody {
    @Override
    String getMood() {
        return "I feel sad Today";
    }

    @Override
    void ExpressFeelings() {
        System.out.println("‘waah’ ‘boo hoo’ ‘weep’ ‘sob‘");
    }

    public String toString() {
        String mood = "Subject cries a lot";
        return mood;
    }
}
