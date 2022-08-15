import util.java.Scanner;
public class Greetings {
    public void greet(){
        System.out.println("Good Morning");
    }
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String myName = name.nextLine();
        Greetings greetings =  new Greetings();
        System.out.println("Hello " + greetings.greet(););
    }
}
