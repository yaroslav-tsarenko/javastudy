package org.example.javaIoAndNio.NIO;
import java.io.*;
import java.nio.*;
import java.nio.channels.FileChannel;

public class FileCopy {
    public static void main(String[] args) {
        long currentMills = System.currentTimeMillis();
        long startMills = currentMills;

        File src = new File("/Users/IdeaProjects/testFolder/text.txt");
        File dst = new File("/Users/IdeaProjects/testFolder/text2.txt");
        // копия nio
        copyFileByChannel(src, dst);
        currentMills = System.currentTimeMillis();
        System.out.println("Время выполнения в миллисекундах: " + (currentMills - startMills));
    }

    public static void copyFileByChannel(File src, File dst){
        // 1. Получаем FileChannel исходного файла и целевого файла
        try(FileChannel srcFileChannel  = new FileInputStream(src).getChannel();
            FileChannel dstFileChannel = new FileOutputStream(dst).getChannel()){
            // 2. Размер текущего FileChannel
            long count = srcFileChannel.size();
            while(count > 0){
                /**=============================================================
                 * 3. Записать байты из FileChannel исходного файла в целевой FileChannel
                 * 1. srcFileChannel.position (): начальная позиция в исходном файле не может быть отрицательной
                 * 2. count: максимальное количество переданных байтов, не может быть отрицательным
                 * 3. dstFileChannel: целевой файл
                 *==============================================================*/
                long transferred = srcFileChannel.transferTo(srcFileChannel.position(),
                        count, dstFileChannel);
                // 4. После завершения переноса измените положение исходного файла на новое место
                srcFileChannel.position(srcFileChannel.position() + transferred);
                // 5. Рассчитаем, сколько байтов осталось перенести
                count -= transferred;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
