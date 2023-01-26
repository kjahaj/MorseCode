import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MorseToEnglish {
    private final static Map<String,Character> morseToEnglish = new HashMap<>();

    public static void fillHashMap2(){
        for(int i=0 ; i<ArrayHolder.letters.length ; i++){
            morseToEnglish.put(ArrayHolder.morse[i], ArrayHolder.letters[i]);
        }
    }

    public static void conversionToEnglish(){
        String sentence;
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        String cont = "1";
        while(!(cont.equals("2"))) {
            try {
                if (cont.equals("1")){

                    System.out.println("Enter sentence you want to translate to English");
                sentence = scanner.next();
                String[] words = sentence.split("\\s{3,}");
                for (String word : words) {
                    String[] letters = word.split(" ");
                    for (String letter : letters) {
                        System.out.print(morseToEnglish.get(letter));
                    }
                    System.out.print(" ");
                }
                }else {
                    throw new IllegalArgumentException("Invalid input");
                }
            }catch (IllegalArgumentException ex){
                System.err.println(ex.getMessage());
            }
            System.out.println("\nEnter 1 if you want to continue Morse to English translation\nEnter 2 if you want to go back");
            cont = scanner.next();
        }
    }
}
