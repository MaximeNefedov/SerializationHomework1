package Serialization.homework1;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        Creator creator = new Creator();
        sb.append(creator.addDir("src")).append("\n");
        sb.append(creator.addDir("res")).append("\n");
        sb.append(creator.addDir("savegames")).append("\n");
        sb.append(creator.addDir("temp")).append("\n");
        sb.append(creator.addDir("src", "main")).append("\n");
        sb.append(creator.addDir("src", "test")).append("\n");
        sb.append(creator.addDir("res", "drawables")).append("\n");
        sb.append(creator.addDir("res", "vectors")).append("\n");
        sb.append(creator.addDir("res", "icons")).append("\n");

        try {
            sb.append(creator.addFile("src/main", "Main.java")).append("\n");
            sb.append(creator.addFile("src/main", "Utils.java")).append("\n");
            sb.append(creator.addFile("temp", "temp.txt")).append("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(sb);

        /*File src = new File("/Users/maksim/Games/src");
        DirCreator srcCreator = new DirCreator(src, DirNames.SRC);
        sb.append(srcCreator.addDirInfo()).append("\n");

        File res = new File("/Users/maksim/Games/res");
        DirCreator resCreator = new DirCreator(res, DirNames.RES);
        sb.append(resCreator.addDirInfo()).append("\n");

        File savegames = new File("/Users/maksim/Games/savegames");
        DirCreator saveGamesCreator = new DirCreator(savegames, DirNames.SAVEGAMES);
        sb.append(saveGamesCreator.addDirInfo()).append("\n");

        File temp = new File("/Users/maksim/Games/temp");
        DirCreator tempCreator = new DirCreator(temp, DirNames.TEMP);
        sb.append(tempCreator.addDirInfo()).append("\n");

        File main = new File("/Users/maksim/Games/src/main");
        DirCreator mainCreator = new DirCreator(main, DirNames.MAIN);
        sb.append(mainCreator.addDirInfo()).append("\n");

        File test = new File("/Users/maksim/Games/src/test");
        DirCreator testCreator = new DirCreator(test, DirNames.TEST);
        sb.append(testCreator.addDirInfo()).append("\n");

        File mainJava = new File("/Users/maksim/Games/src/main/Main.java");
        FileCreator mainJavaCreator = new FileCreator(mainJava, FileNames.MAIN);
        try {
            sb.append(mainJavaCreator.addFileInfo()).append("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        File utilsJava = new File("/Users/maksim/Games/src/main/Utils.java");
        FileCreator utilsJavaCreator = new FileCreator(utilsJava, FileNames.UTILS);
        try {
            sb.append(utilsJavaCreator.addFileInfo()).append("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        File tempTxt = new File("/Users/maksim/Games/temp/temp.txt");
        FileCreator tempTxtCreator = new FileCreator(tempTxt, FileNames.TEMP);
        try {
            sb.append(tempTxtCreator.addFileInfo()).append("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        File drawables = new File("/Users/maksim/Games/res/drawables");
        DirCreator drawCreator = new DirCreator(drawables, DirNames.DRAWABLES);
        sb.append(drawCreator.addDirInfo()).append("\n");

        File vectors = new File("/Users/maksim/Games/res/vectors");
        DirCreator vectorsCreator = new DirCreator(vectors, DirNames.VECTORS);
        sb.append(vectorsCreator.addDirInfo()).append("\n");

        File icons = new File("/Users/maksim/Games/res/icons");
        DirCreator iconsCreator = new DirCreator(icons, DirNames.ICONS);
        sb.append(iconsCreator.addDirInfo()).append("\n");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/maksim/Games/temp/temp.txt"))){
            bw.write(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(sb);*/
    }
}
