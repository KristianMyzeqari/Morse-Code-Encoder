import java.util.Scanner;
import java.util.StringTokenizer;

public class App {
    public static void main(String[] args){ 
        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 
                          's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",
                          "...", "-", "..-", "..._", ".--", "-..-", "-.--", "--..", ".----", "..---", "...--", "...._", ".....", "-....", "--...", "---..", "----.", "-----"};
        boolean running = true;
        while(running){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Write a message: ");
            String message = scanner.nextLine();
            String lowercase = message.toLowerCase();
            if(lowercase.isEmpty()){
                running = false;
            }

            String translation = W2M(lowercase, letters, morse);

            System.out.println(translation);
    }
    }

    /**
     * The word to morse (W2M) method changes the entered string into morse code.
     * 
     * @param input - String entered by user that will be changed into a string of morse code characters.
     * @return - returns the morse code equivalent
     */
public static String W2M(String input, char[] letters, String[] morse){
    String result = "";

    StringTokenizer str = new StringTokenizer(input);
    while(str.hasMoreTokens()){
        String token = str.nextToken();
        for (int i = 0; i < token.length(); i++){
             for(int j = 0; j < letters.length; j++){
                if (token.charAt(i) == letters[j]){
                    result += morse[j] + " ";
                }
             }
        }
    }
    return result;
}
}