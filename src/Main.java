import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Standard Input/Output
        //Please introduce your name then your age
        Scanner eyes = new Scanner(System.in);
        System.out.println("Please introduce your name");

        String name = eyes.nextLine();
        System.out.println("Moin " + name);


        System.out.println("Now introduce your age is ");
        int age = eyes.nextInt();

        // Determines if they are older enough to access to App >> older from 18 years.

        while (age < 0) {
            System.err.println("Your age cannot be negative");
            age = eyes.nextInt();
        }

        if(age > 18) {
            System.out.println("Welcome this app");
        } else {
            System.out.println("Access forbidden");
        }

        eyes.close();


    }
}