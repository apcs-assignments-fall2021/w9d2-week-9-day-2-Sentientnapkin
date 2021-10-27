public class NinthGrader extends  Student{ // SOME CODE NEEDED IN THIS LINE
    public NinthGrader(String firstName,String lastName){
        super(firstName,lastName,2025);
    }
    public NinthGrader (){
        super("Horace","Blofeld",2025);
    }
    public void doSomething(){
        System.out.println("I'm doing my World Lit homework!");
    }

    @Override
    public String toString(){
        return this.getFirstName()+" "+this.getLastName()+", "+this.getClassYear()+" (Ninth Grader)";
    }
}
