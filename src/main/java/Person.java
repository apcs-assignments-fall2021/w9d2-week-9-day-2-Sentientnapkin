public class Person {
    private String firstName;
    private String lastName;
    public Person(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public void setName(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }
    @Override
    public String toString(){
        return this.firstName+" "+this.lastName+".";
    }
    public void doSomething(){
        int random = (int) ((Math.random() * 3) +1);
        if (random>=3){
            System.out.println("I am loving this chair.");
        }
        else if (random>=2){
            System.out.println("Don't go in my room.");
        }
        else if (random>=1){
            System.out.println("I am watching my favorite show on Apple TV+.");
        }
    }
}
