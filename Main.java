import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Witaj w grze Papier, Kamień, Nożyce!");

        String[] options = {"Papier", "Kamień", "Nożyce"};

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        while (true)
        {
            System.out.println("\nWybierz opcję:");
            System.out.println("1. Papier");
            System.out.println("2. Kamień");
            System.out.println("3. Nożyce");
            System.out.println("0. Wyjście");

            int userChoice = sc.nextInt();
            if (userChoice == 0)
            {
                break;
            }

            if (userChoice < 1 || userChoice > 3)
            {
                System.out.println("Nieprawidłowy wybór. Spróbuj ponownie.");
                continue;
            }

            String userOption = options[userChoice - 1];

            int computerChoice = r.nextInt(3);
            String computerOption = options[computerChoice];

            System.out.println("Twój wybór: " + userOption);
            System.out.println("Wybór komputera: " + computerOption);

            if (userOption.equals(computerOption))
            {
                System.out.println("Remis!");
            }else if ((userOption.equals("Papier") && computerOption.equals("Kamień")) ||
                    (userOption.equals("Kamień") && computerOption.equals("Nożyce")) ||
                    (userOption.equals("Nożyce") && computerOption.equals("Papier")))
            {
                System.out.println("Wygrałeś!");
            } else{
                System.out.println("Przegrałeś!");
            }
            System.out.println("- - - - - - - - - - - - - - - -");
        }

        System.out.println("Dziękujemy za grę!");
    }
}