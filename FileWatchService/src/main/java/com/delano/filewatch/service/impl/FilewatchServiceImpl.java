package com.delano.filewatch.service.impl;

import com.delano.filewatch.service.FilewatchService;
import org.springframework.stereotype.Component;
import java.io.IOException;
import java.nio.file.*;

@Component
public class FilewatchServiceImpl implements FilewatchService {

    @Override
    public boolean hasFileDirectoryBeenUpdated() throws IOException, InterruptedException {
        boolean isUpdatedOrChanged = false;

           /* WatchService watchService = FileSystems.getDefault().newWatchService();

            Path path = Paths.get(System.getProperty("user.home")+"\\Desktop\\FileWatch");

            path.register(
                    watchService,
                    StandardWatchEventKinds.ENTRY_CREATE,
                    StandardWatchEventKinds.ENTRY_DELETE,
                    StandardWatchEventKinds.ENTRY_MODIFY);

            WatchKey key;
            while ((key = watchService.take()) != null) {
                for (WatchEvent<?> event : key.pollEvents()) {
                    System.out.println("Event kind:" + event.kind() + ". File affected: " + event.context() + ".");
                    isUpdatedOrChanged = true;
                }
                key.reset();
                if(isUpdatedOrChanged)
                    break;
            }
            */
        return isUpdatedOrChanged;
    }
}
