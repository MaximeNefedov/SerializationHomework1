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

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/maksim/Games/temp/temp.txt"))){
            bw.write(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(sb);
    }
}
