import java.util.Random;
import java.util.Scanner;
import java.lang.Math;
public class Game {
    //variables
    public static final int ROCK = 0, PAPER = 1, SCISSORS = 2;
    boolean run = true;
    int userChoice, comChoice;
    private int userScore = 0, comScore = 0;
    private void compareChoice() {
        switch (userChoice) {
            case ROCK:
                switch (comChoice) {
                    case ROCK: System.out.println("It's a tie");break;
                    case SCISSORS: ++userScore;System.out.println("You win!");break;
                    case PAPER: ++comScore;System.out.println("You lose!");break;
                }
                break;
            case PAPER:
                switch (comChoice) {
                    case PAPER: System.out.println("It's a tie");break;
                    case ROCK: ++userScore;System.out.println("You win!");break;
                    case SCISSORS: ++comScore;System.out.println("You lose!");break;
                }
                break;
            case SCISSORS:
                switch (comChoice) {
                    case SCISSORS: System.out.println("It's a tie");break;
                    case PAPER: ++userScore;System.out.println("You win!");break;
                    case ROCK: ++comScore;System.out.println("You lose!");break;
                }
                break;
            default:
                System.out.println("Invalid input.");
                break;
        }

    }

    private void showChoice() {
        switch (userChoice) {
            case ROCK: System.out.println("You enter: ROCK");break;
            case PAPER: System.out.println("You enter: PAPER");break;
            case SCISSORS: System.out.println("You enter: SCISSORS");break;

        }
        switch (comChoice){
            case ROCK: System.out.println("Computer: ROCK");break;
            case PAPER: System.out.println("Computer: PAPER");break;
            case SCISSORS: System.out.println("Computer: SCISSORS");break;
        }
    }

    private void checkWin() {
        if (Math.abs(userScore - comScore) == 2) {
            if (userScore > comScore) {
                System.out.println("---------------------------------------- ");
                System.out.println("Congrats! You win.");
                run = false;
            } else {
                System.out.println("---------------------------------------- ");
                System.out.println("Too bad! You lose.");
                run = false;
            }
        }
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (run) {
            System.out.print("Enter 0 for ROCK, 1 for PAPER, 2 for SCISSORS: ");
            userChoice = scanner.nextInt();
            comChoice = random.nextInt(3);
            showChoice();
            compareChoice();
            checkWin();

        }
        System.out.println("User score: " + userScore);
        System.out.println("Computer score: "+ comScore);
    }
}

