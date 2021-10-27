public class PersonClient {
    public static void main(String[] args) {
        // Write some very very basic testing code here
        // Create a Person and then call each of the
        // methods on the Person
        Person Sarah = new Person("Sarah","Jones");
        Sarah.setName("Sarah","Miller");
        System.out.println(Sarah.getFirstName());
        System.out.println(Sarah.getLastName());
        System.out.println(Sarah);
        Sarah.doSomething();
    }
}