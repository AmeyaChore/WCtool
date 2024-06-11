package WCtool.WC.controller;

import WCtool.WC.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/WCtool")
public class WCController {

    @Autowired
    private FileService fileService;

    @GetMapping("/{command}")
    public String getFileDate(@PathVariable(name = "command") String commandAndFile) throws IOException {
        String[] arr = commandAndFile.split(" ");
        String command = arr[0];
        String fileName = arr[1];
        return fileService.readTextFile(fileName,command);
    }
}
