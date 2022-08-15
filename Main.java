import java.util.Scanner;

class Main{
    public static void main(String[] args){
        System.out.println("Welcome to the rock paper scissors game: ");
        Scanner myObj = new Scanner(System.in);
        String rock =  " _ _ _ _ \n" +
                        "| | | |/\\\n" +
                        "|_|_|_|\\ \\\n" +
                        "|        /\n" +
                        "\\_______/  ";
        String paper = "\n" +
                "           ___..__\n" +
                "  __..--\"\"\" ._ __.'\n" +
                "              \"-..__\n" +
                "            '\"--..__\";\n" +
                " ___        '--...__\"\";\n" +
                "    `-..__ '\"---..._;\"\n" +
                "          \"\"\"\"----'   ";

      String scissors = "" +
              "    .-.  _\n" +
              "    | | / )\n" +
              "    | |/ /\n" +
              "   _|__ /_\n" +
              "  / __)-' )\n" +
              "  \\  `(.-')xw\n" +
              "   > ._>-'\n" +
              "  / \\/ ";
        String[] game_images = {rock, paper, scissors};
        System.out.println("Type 0 for rock, 1 for paper and 2 for scissors. \n");
        int user_input = myObj.nextInt();
        if(user_input >=3 || user_input < 0){
            System.out.println("You typed an invalid number, Please try again!");
        }else {
            System.out.println(game_images[user_input]);
            int computer_choice = (int) (Math.random() * 3);
            System.out.println("Computer choice \n");
            System.out.println(game_images[computer_choice]);
            if (user_input == 2 && computer_choice == 0) {
                System.out.println("You lose!");
            } else if (user_input == 0 && computer_choice == 2) {
                System.out.println("You win!");
            } else if (user_input > computer_choice) {
                System.out.println("You win!");
            } else if (user_input < computer_choice) {
                System.out.println("You lose!");
            } else if (user_input == computer_choice) {
                System.out.println("It's a draw.");
            } else {
                System.out.println("You typed an invalid number, try again!");
            }
        }
    }
}
//
//import java.util.Scanner;
//
//class Main {
//    public static void main(String[] args) {
//        Scanner myObj = new Scanner(System.in);
//
//        System.out.println("Enter name, age and salary:");
//
//        // String input
//        String name = myObj.nextLine();
//
//        // Numerical input
//        int age = myObj.nextInt();
//        double salary = myObj.nextDouble();
//
//        // Output input by user
//        System.out.println("Name: " + name);
//        System.out.println("Age: " + age);
//        System.out.println("Salary: " + salary);
//    }
//}
