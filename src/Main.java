public class Main {

    public static void main(String[] args) throws Exception {

        String input = "Imagine living in a country with no basic human rights, lack of food, no freedom of speech and even no freedom of thought.";

        Counter counter = new Counter(input);
        Counter counter2 = new Counter(input, 'i');
        System.out.printf("words: %d\n", counter.countWords());
        System.out.printf("characters: %d\n", counter.countCharacters());
        System.out.printf("characters without spaces: %d\n", counter.countCharactersWithoutSpaces());
        System.out.printf("letters : %s\n", counter.countLetters());
        System.out.printf("sum of character %c: %d\n", counter2.sampleChar, counter2.countGivenCharacter());
        System.out.printf("most frequent char: '%s'\n", counter.mostFrequentChar());

        System.out.println();

        CounterFromFile fromFile = new CounterFromFile("D:\\projektyInteliJ\\wordcounter\\src\\example.txt");
        CounterFromFile fromFile1 = new CounterFromFile("D:\\projektyInteliJ\\wordcounter\\src\\example.txt", 'i');
        System.out.printf(".txt read from file: %s\n", fromFile.readFile());
        System.out.printf("words from file: %d\n", fromFile.countWords());
        System.out.printf("characters from file: %d\n", fromFile.countCharacters());
        System.out.printf("characters without spaces from file: %d\n", fromFile.countCharactersWithoutSpaces());
        System.out.printf("letters from file: %d\n", fromFile.countLetters());
        fromFile1.readFile();
        System.out.printf("sum of character %c from file: %d\n", fromFile1.sampleChar, fromFile1.countGivenCharacter());
        System.out.printf("most frequent char from file: '%s'\n", fromFile.mostFrequentChar());

    }


}
