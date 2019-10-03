package com.delano.filewatch.service;


import java.io.IOException;

public interface FilewatchService {

    public boolean hasFileDirectoryBeenUpdated() throws IOException, InterruptedException;

}
