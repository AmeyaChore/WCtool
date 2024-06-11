package WCtool.WC.factory;

import WCtool.WC.factory.implementation.WordsInFile;
import WCtool.WC.factory.implementation.FileLines;

public class CommandFactoryClass {

    public static FileOperation commandFactoryMethod(String command){
        if("-l".equalsIgnoreCase(command)){
            return new FileLines();
        }
        else if("-w".equalsIgnoreCase(command)){
            return new WordsInFile();
        }
        return null;
    }
}
