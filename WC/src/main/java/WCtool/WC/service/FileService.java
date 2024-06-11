package WCtool.WC.service;

import WCtool.WC.factory.FileOperation;
import WCtool.WC.factory.CommandFactoryClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import java.io.*;

@Service
public class FileService {

    @Autowired
    private ResourceLoader resourceLoader;

    @Value("${spring.filePath}")
    private String classPath;

    public String readTextFile(String fileName, String command) {
        try {
            Resource resource = resourceLoader.getResource("classpath:"+fileName);
            File file = resource.getFile();
            FileOperation fileOperation = CommandFactoryClass.commandFactoryMethod(command);
            String output = fileOperation.operate(resource);
            return output;
        } catch (IOException e) {
            return "File Not Found with name:- "+fileName;
        }
    }
}
