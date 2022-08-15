import java.util.Scanner;
public class Guessing {
    public static void main(String[] args){
    int secret_number = 9;
    int chance = 1;
    while (chance <= 3){
        Scanner Guess = new Scanner(System.in);
        System.out.print("Guess the number: ");
        int guessing_number = Guess.nextInt();
        chance = chance + 1;
        if (guessing_number == secret_number){
            System.out.println("You guessed it correctly.");
            break;
        }else if(guessing_number != secret_number){
            System.out.println("You guessed it wrong.");
        }
    else {
            System.out.println("Your chances are gone");
        }
    }




    }
}
