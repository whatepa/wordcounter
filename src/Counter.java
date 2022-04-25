public class Counter {
    protected String input;
    protected char sampleChar;
    protected Counter(){
    }

    protected Counter(String input) {
        this.input = input;
    }

    protected Counter(String input, char sampleChar) {
        this.input = input;
        this.sampleChar = sampleChar;
    }

    protected int countWords() {
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
