import java.util.Scanner;
public class prac{
    public static void main(String[ ] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("__________Welcome__________");
        System.out.println("Enter Your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, "+ name + "How can we help you today");
        scanner.close();
    }
}
