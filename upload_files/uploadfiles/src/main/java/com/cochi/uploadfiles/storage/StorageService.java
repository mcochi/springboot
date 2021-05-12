package com.cochi.uploadfiles.storage;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;
import java.util.stream.Stream;

/* This interface declares several abstract methods for iniziatizating, storing, 
removing and retrieving files. It only lists possible storage operation without
their implementation. Now, it's up to you to decide how you want to implement them
In this example, we'll use our file system for handling files*/
public interface StorageService {
    void init();

    String store(MultipartFile file);

    Stream<Path> loadAll();

    Path load(String filename);

    Resource loadAsResource(String filename);

    void deleteAll();


}
