import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String number;
        System.out.print("Enter any number : ");
        number = input.nextLine();
        System.out.println("The number is: " + number);
    }   
}
