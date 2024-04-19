package demo1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        double price = Double.parseDouble(scanner.nextLine());

        try {
            Book sampleBook = new Book(title, author, price);
            System.out.println(sampleBook);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            Book goldenEditionBook = new GoldenEditionBook(title, author, price);
            System.out.println(goldenEditionBook);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
