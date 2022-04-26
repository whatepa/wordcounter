import java.nio.file.*;

public class CounterFromFile extends Counter {
    private String filePath;
    private String dataFromFile;

    protected CounterFromFile() {
    }

    protected CounterFromFile(String filePath) {
        this.filePath = filePath;
    }

    protected CounterFromFile(String filePath, char sampleChar) {
        this.filePath = filePath;
        this.sampleChar = sampleChar;
    }

    protected String readFile() throws Exception {

        String data;
        data = new String(Files.readAllBytes(Paths.get(filePath)));
        dataFromFile = data;
        return data;
    }

    @Override
    protected int countWords() {
        if (dataFromFile == null || dataFromFile.isEmpty()) {
            return 0;
        }
        String[] words = dataFromFile.split("\\s+");
        return words.length;
    }

    @Override
    protected int countCharacters() {
        return dataFromFile.length();
    }

    @Override
    protected int countCharactersWithoutSpaces() {
        return dataFromFile.replace(" ", "").length();
    }

    @Override
    protected int countGivenCharacter() {
        int totalChars = 0;
        char tmp;
        for (int i = 0; i < dataFromFile.length(); i++) {
            tmp = dataFromFile.charAt(i);
            if (tmp == sampleChar) {
                totalChars++;
            }
        }
        return totalChars;
    }

    @Override
    protected char mostFrequentChar() {
        int[] count = new int[127];
        for (int i = 0; i < dataFromFile.length(); i++) {
            if (dataFromFile.charAt(i) > 65 && dataFromFile.charAt(i) < 122) {
                count[dataFromFile.charAt(i)]++;
            }
        }
        int max = -1;
        char result = ' ';

        for (int j = 0; j < dataFromFile.length(); j++) {
            if (max < count[dataFromFile.charAt(j)]) {
                max = count[dataFromFile.charAt(j)];
                result = dataFromFile.charAt(j);
            }

        }
        return result;
    }
}
