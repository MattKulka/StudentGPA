import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String studentFirstName = "John";
        String studentLastName = "Smith";
        double studentGPA = 4.0;

        System.out.println(studentFirstName + " " + studentLastName + " has a GPA of " + studentGPA +
                ". what would you like to update it to?");

        Scanner scanner = new Scanner(System.in);
        studentGPA = scanner.nextDouble();

        System.out.println(studentFirstName + " " + studentLastName + " now has a GPA of " + studentGPA);


    }
}
