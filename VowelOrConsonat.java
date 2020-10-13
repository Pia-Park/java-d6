import java.util.Scanner;

public class VowelOrConsonat {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String word = input.nextLine().toLowerCase();

        switch(word){
            case "a": case "i" : case "o" : case "u" : case "e" :
            System.out.println(word + " is a Vowel.");
            break;
        default:
            System.out.println(word + " is a Consonat.");
            break;
        }

    }
}