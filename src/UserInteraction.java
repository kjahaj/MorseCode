import java.util.Scanner;

public class UserInteraction  {
    private static final Scanner scanner = new Scanner(System.in);


    public static void Interaction() throws IllegalArgumentException {
        EnglishToMorse.fillHashMap();
        MorseToEnglish.fillHashMap2();
        boolean test = true;
        while (test) {
            System.out.println("\nEnter 1 to convert from English to Morse\nEnter 2 to convert from Morse to english\nEnter 3 if you want to exit");
            String check = scanner.next();
            scanner.useDelimiter("\n");
            try {

                switch (check) {
                    case "1":
                        EnglishToMorse.conversionToMorse();
                        break;
                    case "2":
                        MorseToEnglish.conversionToEnglish();
                        break;
                    case "3":
                        test = false;
                        break;
                    default: throw new IllegalArgumentException("Invalid choice");
                }

            } catch (IllegalArgumentException ex) {
                System.err.println(ex.getMessage());
            }
        }
        System.out.println("Exiting the program");
    }

}
