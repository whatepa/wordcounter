import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String input = "Imagine living in a country with no basic human rights, lack of food, no freedom of speech and even no freedom of thought.";
        Counter counter = new Counter(input);
        Counter counter2 = new Counter(input, 'i');
        System.out.printf("words: %d\n", counter.countWordsUsingSplit());
        System.out.printf("characters: %d\n", counter.countCharacters());
        System.out.printf("characters without spaces: %d\n", counter.countCharactersWithoutSpaces());
        System.out.printf("given characters: %d\n", counter2.countGivenCharacter());


    }


}
