package Serialization.homework1;

import java.io.File;
import java.io.IOException;

public class Creator {
    private static final String separator = File.separator;
    private final static String DEFAULTPATH = separator + "Users" + separator + "maksim" + separator + "Games";
    private DirCreator dirCreator;
    private FileCreator fileCreator;
    private File file;
    private DirNames dirName;
    private FileNames fileName;

    public String addDir(String dirPath) {
        this.file = new File(DEFAULTPATH + separator + dirPath);
        findDirType(dirPath);
        this.dirCreator = new DirCreator(file, dirName);
        return dirCreator.addDirInfo();
    }

    public String addDir(String intoDir, String dirPath) {
        this.file = new File(DEFAULTPATH + separator + intoDir + separator + dirPath);
        findDirType(dirPath);
        this.dirCreator = new DirCreator(file, dirName);
        return dirCreator.addDirInfo();
    }

    public String addFile(String targetDir, String filePath) throws IOException {
        file = new File(DEFAULTPATH + separator + targetDir + separator + filePath);
        findFileType(filePath);
        this.fileCreator = new FileCreator(file, fileName);
        return fileCreator.addFileInfo();
    }

    private void findDirType(String dirPath) {
        DirNames[] dirNames = DirNames.values();
        for (DirNames dirName : dirNames) {
            if (dirName.description.equals(dirPath)) {
                this.dirName = dirName;
                break;
            }
        }
    }

    private void findFileType(String filePath) {
        FileNames[] fileNames = FileNames.values();
        for (FileNames name : fileNames) {
            if (name.description.equals(filePath)) {
                fileName = name;
                break;
            }
        }
    }
}
