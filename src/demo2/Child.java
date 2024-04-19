package demo2;

public class Child extends Person{
    public Child(String name, int age) throws Exception {
        super(name, age);
        this.setAge(age);
        super.activity = "school";
    }

    @Override
    public void setAge(int age) throws Exception {
        if (age > 15) throw new Exception("Child's age must be lesser than 15!");
        super.setAge(age);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
