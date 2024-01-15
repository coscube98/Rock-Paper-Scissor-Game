import java.util.Random;
import java.util.Scanner;

public class GameRPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] choices = {"rock","paper","scissor"};
        
        Random random = new Random ();
        boolean playagain = true;
        while (playagain) {

        int computerchoiceindex = random.nextInt(3);
        String computerchoice = choices[computerchoiceindex];
        
        System.out.print("enter ypur choice(rock,paper,scissors): ");
        String userchoice = sc.nextLine().toLowerCase();

        System.out.println("you chose: " + userchoice);
        System.out.println("Computer chose : " + computerchoice);

        if (userchoice.equals(computerchoice)) {
            System.out.println("its a tie");
            
        } else if (
            (userchoice.equals("rock")&& computerchoice.equals("scissor"))||
            (userchoice.equals("paper")&& computerchoice.equals("rock"))||
            (userchoice.equals("scissor")&& computerchoice.equals("paper")))
            System.out.println("user wins the game");
        else {
            System.out.println("computer wins the game");
            
        }
        System.out.print("do you want to play again (yes/no)? = ");
        String play_again_choice = sc.nextLine().toLowerCase();
        if (!play_again_choice.equals("yes")) {
            playagain = false;
            
        }{
            System.out.println("thank you for playing the game.");
        }
        }
    }
}

