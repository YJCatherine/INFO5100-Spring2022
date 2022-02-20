public class Person {
    private String Name;
    private int age;
    private int ID;

    Person(String Name, int age, int ID) {

        this.Name = Name;
        this.age = age;
        this.ID = ID;
    }


    class Professor extends Person {

        private String giveQuiz;

        Professor(String Name, int age, int ID, String giveQuiz) {
            super(Name, age, ID);
            this.giveQuiz = giveQuiz;
        }
    }


    class Student extends Person {

        private String takeQuiz;

        Student(String Name, int age, int ID, String takeQuiz) {
            super(Name, age, ID);
            this.takeQuiz = takeQuiz;
        }
    }

}
