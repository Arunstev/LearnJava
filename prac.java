import java.util.Scanner;
public class studentdata{
    public static void main(String[ ] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("__________Welcome__________");
        System.out.println("Enter Your Name: ");
        String Name = scanner();
        System.out.println("Hello, "+ Name + "How can we help you today!");
        scanner.close();
    }
}
