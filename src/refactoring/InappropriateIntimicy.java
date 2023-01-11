package refactoring;

import java.util.List;

public class InappropriateIntimicy {
}

interface Reader {
    public String read();
}
class FileReader implements Reader {
    private String filename;
    public FileReader(String filename) {
        this.filename = filename;
    }
    public String read() {
        // read the file and return its contents
        return "";
    }
}
class FileParser {
    private Reader reader;
    public FileParser(Reader reader) {
        this.reader = reader;
    }
    public List<String> parseFile() {
        String fileContents = reader.read();
        // parse the file contents and return a list of strings
        return null;
    }
}
