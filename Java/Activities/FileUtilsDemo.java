package activities;

import org.apache.commons.io.FileUtils;

import java.io.File;

public class FileUtilsDemo {
    public static void main(String args[]){
        File tempDir = FileUtils.getTempDirectory();
        System.out.println(tempDir.getAbsolutePath());
        File file = FileUtils.getFile("Activity1.java");
        System.out.println(tempDir.listFiles());
    }


}