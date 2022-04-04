package Assignment3;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //Make SeattlePoliceDepartment as argument
    public void subscribe(SeattlePoliceDepartment seattlePolice) {
        if (!seattlePolice.person.contains(this)) {
            seattlePolice.person.add(this);
        }
    }

    public void unsubscribe(SeattlePoliceDepartment seattlePolice) {
        seattlePolice.person.remove(this);
    }

    //getNotification take SeattlePoliceDepartment as argument
    public void getNotification(SeattlePoliceDepartment seattlePolice) {
        System.out.println("Notification： " + seattlePolice.getNotification());
        System.out.println("Person : " + this.getName() + "  " + getAge());
        System.out.println("==========================================");
    }
}
