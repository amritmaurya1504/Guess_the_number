import java.util.Random;
import java.util.Scanner;

class Game {
    public int number;
    public int noOfGusseses;
    public int inpNum;

    public int getnoOfGusseses() {
        return noOfGusseses;
    }

    public void setNoOfGuesses(int noOfGusseses) {
        this.noOfGusseses = noOfGusseses;
    }

    Game() {
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }

    void takeUserInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Guess the Number");
        inpNum = scan.nextInt();
    }

    boolean isCorrectNumber() {
        int x;
        noOfGusseses++;
        if (inpNum == number) {
            System.out.printf("You Guessed it bro %c \n It Was : %d \n You Guessed it in %d No of attempts",x=2,number,noOfGusseses);
            return true;
        } else if (inpNum < number) {
            System.out.println("Too less .......");
        } else if (inpNum > number) {
            System.out.println("Too High .......");
        }

        return false;
    }
}

public class Guess_the_number {
    public static void main(String[] args) {
        Game game = new Game();
        boolean b = false;
        while (!b) {
            game.takeUserInput();
            b = game.isCorrectNumber();
        }
    }
}
