package com.company.records.file;

import java.io.IOException;
import java.util.List;

public interface FilesInterface {
    void createFile(String fileName) throws IOException;
    void writeToFile(String fileName, String text);
    List<String> readFromFile(String fileName);
}
