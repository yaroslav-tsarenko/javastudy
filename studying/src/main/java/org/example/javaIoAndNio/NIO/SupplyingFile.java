package org.example.javaIoAndNio.NIO;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SupplyingFile {
    public static void main(String[] args) {

        try(FileChannel channel = (FileChannel) Files.newByteChannel(Paths.get("file4.txt"))){
            MappedByteBuffer buffer = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size());

            for (int i = 0; i < channel.size(); i++) {
                System.out.println((char) buffer.get());
            }

        }catch (IOException exception){
            System.err.println("Input / Output error");
        }
    }
}
