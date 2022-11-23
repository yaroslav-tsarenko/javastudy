package org.example.javaIoAndNio.NIO;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MemoryAllocation {
    public static void main(String[] args) {

        int length;

        try(SeekableByteChannel channel = Files.newByteChannel(Paths.get("file3.txt"))){
            ByteBuffer buffer = ByteBuffer.allocate(128);

            do{
                length = channel.read(buffer);

                if(length != -1){
                    buffer.rewind();

                    for (int i = 0; i < length; i++) {
                        System.out.println((char) buffer.get());
                    }
                }

            }while (length != -1);

        }catch (IOException exception){
            System.err.println("Input/Output error");
        }
    }
}
