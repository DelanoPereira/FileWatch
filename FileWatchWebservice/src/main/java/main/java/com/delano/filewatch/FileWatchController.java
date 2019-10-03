package main.java.com.delano.filewatch;

import com.delano.filewatch.service.FilewatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;


@RestController
@RequestMapping("/filewatcher/**")
public class FileWatchController {

    @Autowired
    private FilewatchService filewatchService;

    @RequestMapping(value = "/check",method = RequestMethod.GET,produces = {MediaType.APPLICATION_JSON_VALUE})
    public boolean hasFileChanged() throws IOException, InterruptedException {
        return filewatchService.hasFileDirectoryBeenUpdated();
    }
}
