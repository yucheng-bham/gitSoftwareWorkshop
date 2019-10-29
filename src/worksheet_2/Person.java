package worksheet_2;

public class Person {
    /**
     * A class Person with two field variables name and dob respectively.
     */
    private String name;
    private worksheet_3.Date dob;

    public Person(String name, worksheet_3.Date dob) {
        this.name = name;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public worksheet_3.Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dob=" + dob +
                '}';
    }
}
