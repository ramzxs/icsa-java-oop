// java.lang.Object

import javax.tools.JavaCompiler;

public class Person {
    // Members (Variables)
    private String name;
    private String gender;


    // Constructors (Create)
    public Person() {
        this.name = "";
        this.gender = "";
    }

    public Person(String n) {
        this.name = n;
    }

    public Person(String n, String g) {
        this.name = n;
        this.gender = g;
    }

    // Methods (Functions)
    // Person@HexAddress
    @Override
    public String toString() {
        return "Person { name = " + this.name + ", gender = " + this.gender + " }";
    }

    // GETTERS & SETTERS
    public String getName() {
        return this.name;
    }

    public void setName(String n) {
        // Should start with capital
        // Should not be 1 letter only
        if (n.length() == 1) {
            System.out.println("Should be more than 1 character");
        } else {
            this.name = n;
        }
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String g) {
        if (g.equals("Male") || g.equals("Female")) {
            this.gender = g;
        } else {
            this.gender = "";
            System.out.println("Invalid gender");
        }
    }

}
