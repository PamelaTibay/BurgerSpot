package tibaysGroup;

public class Customer extends Person {
    private final String program;

    public Customer(String name, int age, String gender, String program) {
        super(name, age, gender);
        this.program = program;
    }

    @Override
    public String getInformation() {
        return "Name: " + getName() + "\nGender: " + getGender() + "\nAge: " + getAge() + "\nProgram: " + program;
    }
}