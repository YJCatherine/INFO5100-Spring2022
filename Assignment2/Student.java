package Assignment2;

public class Student {
    private int roll;
    private String name;

    Student(int rollNo, String sName) {
        roll = rollNo;
        name = sName;
    }

    Student(Student student) {
        roll = student.roll;
        name = student.name;
    }

    int printRoll() {
        return roll;
    }

    String printName() {
        return name;
    }

    public static void main(String[]args){

        Student student1=new Student(101,"ABC");

        System.out.println(" Roll number of the first student: "+student1.printRoll());

        System.out.println(" Name of the first student: "+student1.printName());

        Student student2=new Student(student1);

        System.out.println(" Roll number of the second student: "+student2.printRoll());

        System.out.println(" Name of the second student: "+student2.printName());

    }
}
