package Midterm;

    public class Student{
        //Question1:
        // 1、Deep copy stores copies of object's value.
        //    It does not reflect changes made into copied object in the original object.
        // 2、Shallow copy stores the copies of the original object.
        //    It reflects changes made to the copied object in the original object.

        private String name;
        private String ID;
        private double GPA;

    public Student(String name, String ID, double GPA){
        this.name = name;
        this.ID = ID;
        this.GPA = GPA;
    }
    public Student(Midterm.Midterm.Student student){
        Midterm.Midterm.Student test = new Midterm.Midterm.Student();
        this.ID = student.ID;
        this.name = student.name;
        this.GPA = student.GPA;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getID(){
        return ID;
    }
    public void setID(String ID){
        this.ID = ID;
    }
    public double getGPA(){
        return GPA;
    }
    public void setGPA(double GPA){
        this.GPA = GPA;
    }

    public Test() {
        name = "TEST";
        studentID = 001;
        gpa = 3.90f;
    }
}

