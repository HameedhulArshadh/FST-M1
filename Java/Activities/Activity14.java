package activities;

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;

public class Activity14 {
    public static void main(String[] args) throws IOException {
        File file = new File("newtext.txt");
        boolean fStatus = file.createNewFile();

        File textFile = FileUtils.getFile("newtext.txt");
        FileUtils.write(textFile, "all good", "UTF8");
        String content = FileUtils.readFileToString(textFile, "UTF8");
        System.out.println(content);

        File destination = new File ("resources");
        FileUtils.copyFileToDirectory(textFile, destination);

        File newFile = FileUtils.getFile(destination, "newtext.txt");
        System.out.println(FileUtils.readFileToString(newFile, "UTF8"));



    }

}
