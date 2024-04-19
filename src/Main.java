import demo1.Book;
import demo1.GoldenEditionBook;
import demo2.Child;
import people.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
//        Student student = new Student("Filipp", "Sadikov", "2019-11-aa713", "УТИ");
//        System.out.println(student.toString());

        Scanner scanner = new Scanner(System.in);
//        String title = scanner.nextLine();
//        String author = scanner.nextLine();
//        double price = Double.parseDouble(scanner.nextLine());
//
//        try {
//            Book sampleBook = new Book(title, author, price);
//            System.out.println(sampleBook);
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        }
//
//        try {
//            Book goldenEditionBook = new GoldenEditionBook(title, author, price);
//            System.out.println(goldenEditionBook);
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        }


        String name = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        try {
            Child child = new Child(name, age);
            System.out.println(child.toString());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}