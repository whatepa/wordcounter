public class Counter {
    private final String input;
    private char sampleChar;

    public Counter(String input) {
        this.input = input;
    }

    public Counter(String input, char sampleChar) {
        this.input = input;
        this.sampleChar = sampleChar;
    }

    protected int countWordsUsingSplit() {
        if (input == null || input.isEmpty()) {
            return 0;
        }
        String[] words = input.split("\\s+");
        return words.length;
    }

    protected int countCharacters() {
        return input.length();
    }

    protected int countCharactersWithoutSpaces() {
        return input.replace(" ", "").length();
    }

    protected int countGivenCharacter() {
        int totalChars = 0;
        char tmp;

        for (int i = 0; i < input.length(); i++) {
            tmp = input.charAt(i);
            if (tmp == sampleChar) {
                totalChars++;
            }
        }
        return totalChars;
    }
}
