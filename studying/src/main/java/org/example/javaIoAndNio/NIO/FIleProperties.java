package org.example.javaIoAndNio.NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class FIleProperties {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/file.txt");

        System.out.println("File name: " + path.getFileName());
        System.out.println("Path to file: " + path + "\n");

        System.out.println("File " + (Files.exists(path) ? "exist" : "does not exist"));
        System.out.println("File " + (Files.isHidden(path) ? "is hidden" : "is not hidden"));
        System.out.println("File " + (Files.isWritable(path) ? "is available for writing" : "is not available for writing"));
        System.out.println("File " + (Files.isReadable(path) ? "is available for reading" : "is not available for reading"));

        BasicFileAttributes fileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
        System.out.println("File " + (fileAttributes.isDirectory() ? "is directory" : "is not directory"));
        System.out.println("File " + (fileAttributes.isRegularFile() ? "is regular file" : "is not regular file"));
        System.out.println("File " + (fileAttributes.isSymbolicLink() ? "is symbol ling" : "is not symbol ling"));

        System.out.println("Last modification of file " + fileAttributes.lastModifiedTime());
        System.out.println("File size: " + fileAttributes.size() + "bytes");





    }
}
