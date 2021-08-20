import java.util.Scanner;

public class StringRefreshal {
    private static String message, message2;
    public static void main(String[] args) {
        message = "  I love Java  ";
        message2 = "Adefemi";
//        System.out.println("Testing out my new class");
//        System.out.println("Text:" + message);
//        System.out.println("Length:" + message.length());
//        System.out.println("charAt(2):" + message.charAt(2));
//        System.out.println("Concat(message):" + message.concat(message));
//        System.out.println("toUppercase:" + message.toUpperCase());
//        System.out.println("toLowercase:" + message.toLowerCase());
//        System.out.println("trim:" + message.trim());
//        System.out.println("message.substring(0): " +  message2.substring(0, 2));
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter you name please?");
//        String userInput = input.nextLine();
//        System.out.println("Would you like to be greeted?");
//        String response = input.next();
//        if (!response.equalsIgnoreCase("yes")) {
//            return;
//        }
//        System.out.println("Welcome: " + userInput);
        String sAge = "36";
        int iAge = Integer.parseInt(sAge);
        System.out.println(((Object)iAge).getClass().getSimpleName());




    }
}
