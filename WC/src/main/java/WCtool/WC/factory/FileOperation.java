package WCtool.WC.factory;

import org.springframework.core.io.Resource;

import java.io.IOException;

public interface FileOperation {

    public String operate(Resource resource) throws IOException;
}
