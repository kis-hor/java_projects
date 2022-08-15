import java.util.Scanner;
public class Cgpa {
    public static void main(String[] args){
        Scanner marks = new Scanner(System.in);
        Scanner input =new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Enter your marks: ");
        System.out.print("English: ");
        int marks_in_English = input.nextInt();
        System.out.print("Maths: ");
        int marks_in_Maths = input.nextInt();
        System.out.print("Science: ");
        int marks_in_Science = input.nextInt();
        float total_marks = marks_in_English + marks_in_Maths + marks_in_Science;
        float percentage = (total_marks/300) * 100;
        if(percentage > 90){
            System.out.println("You scored A+ GPA");
            System.out.println("Congratulations " + name + "!");
        }else if(percentage > 80){
            System.out.println("You scored A GPA");
            System.out.println("Congratulations " + name + "!");
        }else if(percentage > 70){
            System.out.println("You scored B+ GPA");
            System.out.println("Congratulations " + name + "!");
        }else if(percentage > 60){
            System.out.println("You scored B GPA");
            System.out.println("Congratulations " + name + "!");
        }else if(percentage > 50){
            System.out.println("You scored C+ GPA");
            System.out.println("Congratulations, Do better next time " + name + "!");
        }else if(percentage > 40){
            System.out.println("You scored C GPA");
            System.out.println("Congratulations, You have to do better. " + name + "!");
        }else if(percentage > 30){
            System.out.println("You scored D+ GPA");
            System.out.println("Congratulations, You have to improve yourself " + name + "!");
        }else if(percentage > 20){
            System.out.println("You scored D GPA");
        }else if(percentage > 10){
            System.out.println("You scored E GPA");
        }else{
            System.out.println("You Failed");
        }

    }
}
