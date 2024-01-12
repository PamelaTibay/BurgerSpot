package tibaysGroup;

public class Burger extends Person {
    private final String burgerName;
    private final String size;
    private final String type;

    public Burger(String name, int age, String gender, String burgerName, String size, String type) {
        super(name, age, gender);
        this.burgerName = burgerName;
        this.size = size;
        this.type = type;
    }

    @Override
    public String getInformation() {
        return "Name: " + getName() + "\nGender: " + getGender() + "\nAge: " + getAge() + "\nBurger Name: " + burgerName + "\nSize: " + size + "\nType: " + type;
    }
}