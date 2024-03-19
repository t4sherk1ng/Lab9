package people;

public class Student extends Human{

    private String recordBookNumber;
    private String faculty;

    public Student(String firstName, String lastName, String recordBookNumber, String faculty) throws Exception{
        super(firstName, lastName);
        this.setRecordBookNumber(recordBookNumber);
        this.setFaculty(faculty);
    }

    private void setRecordBookNumber(String recordBookNumber) throws Exception {
        if (recordBookNumber.matches("^[0-9]{4}-[0-9]{2}-[0-9a-zа-я]{5}$")) {
            this.recordBookNumber = recordBookNumber;
        } else {
            throw new Exception("Invalid record book number!");
        }
    }

    private void setFaculty(String faculty) throws Exception {
        if (faculty.matches("^[A-ZА-Я]{3}$")) {
            this.faculty = faculty;
        } else {
            throw new Exception("Expected value mismatch! Argument: faculty");
        }
    }

    private String calculateFacultyNumber(String group, String groupCode) {
        return group + "-" + String.valueOf(2024-Integer.parseInt(groupCode.split("-")[0])) + groupCode.split("-")[1];
    }

    @Override
    public String toString() {
        return "people.Student{" +
                "recordBookNumber='" + recordBookNumber + '\'' +
                ", faculty='" + faculty + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", facultyNumber='" + calculateFacultyNumber(faculty, recordBookNumber) + '\'' +
                '}';
    }
}
