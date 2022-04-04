package Assignment3;

import java.util.ArrayList;

public class SeattlePoliceDepartment {
    ArrayList<Person> person;
    String notification;

    public SeattlePoliceDepartment() {
        this.person = new ArrayList<>();
    }

    public String getNotification() {
        return notification;
    }

    public void setNotification(String notification) {
        this.notification = notification;
    }

    //Make String as argument
    public void notifyCitizens(String notification) {
        this.notification = notification;
        for (Person person : person) {
            person.getNotification(this);
        }
    }
}
