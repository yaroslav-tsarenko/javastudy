package org.example.javaIoAndNio.NIO;

import org.example.exersices.Slack.ExerciseInterface.File;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class StandardOpenOptionMethod2 {

    public static void main(String[] args) {

        try(FileChannel channel = (FileChannel) Files.newByteChannel(Paths.get("file2.txt"),
                StandardOpenOption.WRITE, StandardOpenOption.READ, StandardOpenOption.CREATE)){
            MappedByteBuffer buffer = channel.map(FileChannel.MapMode.READ_WRITE, 0, 26);

            for (int i = 0; i < buffer.capacity(); i++) {
                buffer.put((byte)('A' + i));
            }

        }catch (IOException exception){
            System.err.println("Input / Output error");
        }

    }
}
