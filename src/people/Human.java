package people;

public class Human {

    protected String firstName;
    protected String lastName;

    protected Human(String firstName, String lastName) throws Exception{
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    protected void setFirstName(String firstName) throws Exception{
        if (firstName.matches("^[A-ZА-Я][a-zа-я]{1,}$")) {
            this.firstName = firstName;
        } else if (firstName.length() < 2) {
            throw new Exception("Expected length at least 2 symbols! Argument: firstName");
        } else if (!Character.isUpperCase(firstName.charAt(0))) {
            throw new Exception("Expected upper case letter! Argument: firstName");
        } else {
            throw new Exception("Something went wrong");
        }
    }

    protected void setLastName(String lastName) throws Exception {
        if (lastName.matches("^[A-ZА-Я][a-zа-я]{2,}$")) {
            this.lastName = lastName;
        } else if (lastName.length() < 3) {
            throw new Exception("Expected length at least 3 symbols! Argument: lastName");
        } else if (!Character.isUpperCase(lastName.charAt(0))) {
            throw new Exception("Expected upper case letter! Argument: lastName");
        } else {
            throw new Exception("Something went wrong");
        }
    }
}