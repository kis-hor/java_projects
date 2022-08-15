import java.util.Scanner;
public class Percentagecalc {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Enter your marks: ");
        System.out.print("Social: ");
        int marks_in_Social = input.nextInt();
        System.out.print("English: ");
        int marks_in_English = input.nextInt();
        System.out.print("Maths: ");
        int marks_in_Maths = input.nextInt();
        System.out.print("Science: ");
        int marks_in_Science = input.nextInt();
        System.out.print("History: ");
        int marks_in_History = input.nextInt();
        float total_marks = marks_in_Social + marks_in_English + marks_in_Maths + marks_in_Science + marks_in_History;
        System.out.println("Total marks = " + total_marks);
        float percentage = (total_marks/500) * 100;
        System.out.println("So, you got " + percentage + "%");
    }
}
