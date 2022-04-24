import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String input;
        System.out.print("Enter text: ");
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();

        System.out.println(countWordsUsingSplit(input));
    }
    public static int countWordsUsingSplit(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }
        String[] words = input.split("\\s+");
        return words.length;
    }

}
