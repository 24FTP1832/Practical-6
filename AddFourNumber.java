import java.util.Scanner;

public class AddFourNumber {
    public static void main(String[] args) {
        int a = (int)(Math.random() * 100);
        int b = (int)(Math.random() * 100);
        int c = (int)(Math.random() * 100);
        int d = (int)(Math.random() * 100);

        int correctSum = a + b + c + d;

        Scanner input = new Scanner(System.in);
        System.out.println("What is " + a + " + " + b + " + " + c + " + " + d + "? ");
        int userAnswer = input.nextInt();

        if (userAnswer == correctSum){

            System.out.println("Well done, you are correct!");

        }
        else {

            System.out.println("Nice try, the sum should be " + correctSum);

        }
    }
}
