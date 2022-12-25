import java.util.Scanner;
import java.time.LocalDate;

public class Chatbot {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        LocalDate dateObj = LocalDate.now();
        int year = dateObj.getYear();

        System.out.println("Hello. What is your name?");
        String name = scan.nextLine();

        System.out.println("\nHi "+name+"! I am Gideon, an aritificial consciousness.\nWhere are you from?");
        String home = scan.nextLine();

        System.out.println("\nI hear it's beautiful at "+home+"! I'm from a place called S.T.A.R. Labs");
        System.out.println("What year were you born");
        int birthyear = scan.nextInt();
        int age = year - birthyear;
        int botBirthYear = 2024;

        System.out.println("\nSo you're " + age + ", cool! I will be created in the year " + botBirthYear + ".");
        System.out.println("This means you would be "+ (botBirthYear - birthyear)+" when I was created.");
        System.out.println("Enough about me. What's your favourite language? (just don't say Python)");
        scan.nextLine();
        String language = scan.nextLine();

        System.out.println("\n" + language + ", that's great! Nice chatting with you " + name + ". I have to log off now. See ya!");
        
        scan.close();
    }
}
