package Serialization.homework1;

import java.io.File;
import java.io.IOException;

public class FileCreator {
    private File file;
    private FileNames fileNames;

    public FileCreator(File file, FileNames fileNames) {
        this.file = file;
        this.fileNames = fileNames;
    }

    public String addFileInfo() throws IOException {
        if (file.createNewFile()) {
            return "Файл " + fileNames.description + " создан";
        } else {
            return "Ошибка создания файла " + fileNames.description;
        }
    }
}
