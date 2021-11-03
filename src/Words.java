import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Write words and we will count the amount of letters, amount of words, longest word, and how many rows you write.");
        System.out.println("It will continue until you write stop");

        boolean running = true;
        WordsLogic myWords = new WordsLogic();
        while(running){
            String read = scan.nextLine();
            if(!myWords.input(read)){
                running = false;
            }
        }
        System.out.println("You have written " + myWords.getCharacters() + " letters.");
        System.out.println("On " + myWords.getRows() + " rows.");
        System.out.println("With " + myWords.getWordAmount() + " words.");
        System.out.println("And the longest word is " + myWords.getLongestWord());
    }
}
