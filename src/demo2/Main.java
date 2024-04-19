package demo2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



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
