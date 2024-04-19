package demo2;

public class Person {

    protected String name;
    protected int age;

    protected String activity;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.activity = "work";
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) throw new NullPointerException();
        this.name = name;
    }

    public void setAge(int age) throws Exception {
        if (age < 1) throw new Exception("Age must be positive");
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", everyday goes to: " + activity;
    }
}
