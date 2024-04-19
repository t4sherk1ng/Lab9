package people;

public class Student extends Human {

    private String recordBookNumber;
    private String faculty;


    public Student(String firstName, String lastName, String recordBookNumber, String faculty) {
        super(firstName, lastName);
        this.setRecordBookNumber(recordBookNumber);
        this.setFaculty(faculty);
    }

    private void setRecordBookNumber(String recordBookNumber) {
        if (recordBookNumber == null) {
            throw new IllegalArgumentException("Record book number cant be null");
        }
        else if (recordBookNumber.matches("^[0-9]{4}-[0-9]{2}-[0-9a-zа-я]{5}$")) {
            this.recordBookNumber = recordBookNumber;
        } else {
            throw new IllegalArgumentException("Invalid record book number!");
        }
    }

    private void setFaculty(String faculty) {
        if (faculty == null) {
            throw new IllegalArgumentException("Faculty cant be null");
        }
        else if (faculty.matches("^[A-ZА-Я]{3}$")) {
            this.faculty = faculty;
        } else {
            throw new IllegalArgumentException("Expected value mismatch! Argument: faculty");
        }
    }

    private String calculateFacultyNumber(String group, String groupCode) {
        return group + "-" + (2024 - Integer.parseInt(groupCode.split("-")[0])) + groupCode.split("-")[1];
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("First Name: ").append(this.firstName).append(System.lineSeparator())
                .append("Last Name: ").append(this.lastName).append(System.lineSeparator())
                .append("Faculty number: ").append(calculateFacultyNumber(faculty, recordBookNumber));
        return sb.toString();
    }
}
