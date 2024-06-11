package WCtool.WC.factory.implementation;

import WCtool.WC.factory.FileOperation;

import java.io.BufferedReader;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.io.InputStreamReader;

public class FileLines implements FileOperation {

    @Override
    public String operate(Resource resource) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(resource.getInputStream()));

        int count=0;
        while(reader.readLine()!= null){
            count++;
        }
        reader.close();
        return String.valueOf(count);
    }
}
