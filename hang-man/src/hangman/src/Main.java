import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public  class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<String> words = new ArrayList<>();
        try(BufferedReader file = new BufferedReader(new FileReader("wordGetter"))){
            String line;
            while((line = file.readLine()) != null){
                words.add(line.trim().toLowerCase());
            }

        }
        catch (FileNotFoundException e){
            System.out.println("Cannot find the File!");
        }
        catch (IOException e){
            System.out.println("Something went wrong");
        }
        Random random = new Random();
        String word = words.get(random.nextInt(words.size()));

        ArrayList<Character> wordState = new ArrayList<>();
        for(int i = 0 ; i < word.length(); i++){
            wordState.add('_');
        }
        int wrongGuess = 0;
        System.out.println(getHangmanArt(wrongGuess));

        while(wrongGuess < 6){
            System.out.println("Welcome To HangMan");
            System.out.println("*******************");

            System.out.print("Word: ");
            for(char c : wordState){
                System.out.print(c + " ");
            }
            System.out.println();
            System.out.print("Enter your guess: ");
            Scanner scanGuess = new Scanner(System.in);
            char guessChar = scanGuess.next().toLowerCase().charAt(0);

            if(word.indexOf(guessChar) >= 0){
                for(int i = 0; i < word.length(); i++){
                    if(word.charAt(i) == guessChar) {
                        wordState.set(i, guessChar);
                    }
                }
                if(!wordState.contains('_')){
                    System.out.println(getHangmanArt(wrongGuess));
                    System.out.println("You Win");
                    System.out.println("Word: " + word);
                    break;
                }
            }
            else{
                wrongGuess += 1;
                System.out.println(getHangmanArt(wrongGuess));
            }
        }
        if(wrongGuess >= 6){
            System.out.println("GAME OVER");
            System.out.println("The answer is " + word);
        }
    }
    static String getHangmanArt(int wrongGuess){
        return switch (wrongGuess){
            case 0 -> """
                    
                      """;
            case 1 -> """
                       o
                      """;
            case 2 -> """
                       o
                      /
                      """;
            case 3 -> """
                       o
                      /|
                      """;
            case 4 -> """
                       o
                      /|\\
                      """;
            case 5 -> """
                       o
                      /|\\
                      /
                      """;
            case 6 -> """
                       o
                      /|\\
                      /|\\
                      """;
            default -> """
                       """;
        };
    }
}