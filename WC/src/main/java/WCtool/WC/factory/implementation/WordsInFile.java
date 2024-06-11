package WCtool.WC.factory.implementation;

import WCtool.WC.factory.FileOperation;
import org.springframework.core.io.Resource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class WordsInFile implements FileOperation {
    @Override
    public String operate(Resource resource) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(resource.getInputStream()));
        int count = 0;
        String line;
        while ((line = reader.readLine()) != null) {
            StringTokenizer tokenizer = new StringTokenizer(line);
            count += tokenizer.countTokens();
        }
        reader.close();
        return String.valueOf(count);
    }
}
