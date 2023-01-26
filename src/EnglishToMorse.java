import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EnglishToMorse {

    private final static Map<Character,String> englishToMorse = new HashMap<>();

    public static void fillHashMap (){
        for(int i=0 ; i<ArrayHolder.letters.length ; i++){
            englishToMorse.put(ArrayHolder.letters[i],ArrayHolder.morse[i]);
        }
    }

    public static void conversionToMorse(){
        String cont = "1";
        String sentence;
        String sentenceUpper;
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        while (!cont.equals("2")) {

            try {
                if (cont.equals("1")) {
                    System.out.println("Enter the sentence you want to translate to Morse: ");
                    sentence = scanner.next();
                    sentenceUpper = sentence.toUpperCase();
                    for (int i = 0; i < sentence.length(); i++) {
                        System.out.print(englishToMorse.get(sentenceUpper.charAt(i)) + " ");
                    }
                } else {
                    throw new IllegalArgumentException("Invalid input");
                }
            } catch (IllegalArgumentException ex) {
                System.err.println(ex.getMessage());
            }
            System.out.println("\nEnter 1 if you want to continue English to Morse translation\nEnter 2 if you want to go back");
            cont = scanner.next();
        }
    }










}
