import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String input = "Imagine living in a country with no basic human rights, lack of food, no freedom of speech and even no freedom of thought.";
        System.out.println(input);
        char example = 'i';
//        System.out.print("Enter text: ");
//        Scanner scanner = new Scanner(System.in);
//        input = scanner.nextLine();

        System.out.println("words: " + countWordsUsingSplit(input));
        System.out.println("characters: " + countCharacters(input));
        System.out.println("characters without spaces: " + countCharactersWithoutSpaces(input));
        System.out.printf("number of %c is %d%n",example,countGivenCharacter(input, example));
    }
    public static int countWordsUsingSplit(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }
        String[] words = input.split("\\s+");
        return words.length;
    }
    public static int countCharacters(String input){
        return input.length();
    }
    public static int countCharactersWithoutSpaces(String input){
        return input.replace(" ", "").length();
    }
    public static int countGivenCharacter(String input, char chr){
        int totalChars = 0;
        char tmp;

        for (int i = 0; i < input.length(); i++) {
            tmp = input.charAt(i);
            if (tmp == chr){
                totalChars++;
            }
        }
        return totalChars;
    }
}
