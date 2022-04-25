import java.nio.file.*;

public class CounterFromFile extends Counter{
    private String filePath;
    private String dataFromFile;
    protected CounterFromFile() {
    }

    protected CounterFromFile(String filePath) {
        this.filePath = filePath;
    }
    protected CounterFromFile(String filePath, char sampleChar){
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
    protected int countWords(){
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


}
