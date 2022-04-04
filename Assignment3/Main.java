package Assignment3;

public class Main {

    public static void main(String[] args) {

        //creat instance of SeattlePoliceDepartment
        SeattlePoliceDepartment seattlePolice = new SeattlePoliceDepartment();

        //create instances of Person
        Person A = new Person("A", 31);
        Person B = new Person("B", 32);
        Person C = new Person("C", 45);
        Person D = new Person("D", 17);

        //Subscribe persons to seattlePolice
        A.subscribe(seattlePolice);
        B.subscribe(seattlePolice);
        C.subscribe(seattlePolice);
        D.subscribe(seattlePolice);

        //Publish a message from seattlePolice
        System.out.println("Message1: ");
        seattlePolice.notifyCitizens("An important message.");

        //Unsubscribe a person from the seattlePolice
        A.unsubscribe(seattlePolice);
        B.unsubscribe(seattlePolice);

        //Publish the message again
        System.out.println("Message2: ");
        seattlePolice.notifyCitizens("Another important message.");
    }
}
