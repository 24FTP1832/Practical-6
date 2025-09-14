import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int computer = (int)(Math.random() * 1000) % 3;

        System.out.println("Enter rock (0), paper (1), scissor (2): ");
        int user = input.nextInt();

        String[] choices = {"rock", "paper", "scissor"};
        System.out.print("The computer is " + choices[computer] + ". You are " + choices[user] + ".");

        if (user == computer){

            System.out.println(" It is draw.");

        }
        if (user == 0 && computer == 2){

            System.out.println(" You Win.");

        }
        if (user == 0 && computer == 1){

            System.out.println(" You Lose.");

        }
        if (user == 1 && computer == 0){

            System.out.println(" You Win.");

        }
        if (user == 1 && computer == 2){

            System.out.println(" You Lose.");

        }
        if (user == 2 && computer == 1){

            System.out.println(" You Win.");

        }
        if (user == 2 && computer == 0){

            System.out.println(" You Lose.");
            
        }
    }
}
