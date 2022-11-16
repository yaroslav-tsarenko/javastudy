package org.example.collections.ArrayList;

import java.util.*;
import java.io.*;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class Jukebox3 {
    ArrayList<Song> songList = new ArrayList<>();

    public static void main(String[] args) {
        new Jukebox3().go();
    }

    public void go(){
        getSongs();
        System.out.println(songList);
        /*Collections.sort(songList);
        System.out.println(songList);*/
    }

    void getSongs(){
        try{
            File file = new File("SongList.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while((line = reader.readLine()) != null){
                addSong(line);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }

    }
    void addSong(String lineToParse){
        String[] tokens = lineToParse.split("/");
        Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]) {
            @Override
            public int compare(Song o1, Song o2) {
                return 0;
            }

            @Override
            public Comparator<Song> reversed() {
                return super.reversed();
            }

            @Override
            public Comparator<Song> thenComparing(Comparator<? super Song> other) {
                return super.thenComparing(other);
            }

            @Override
            public <U> Comparator<Song> thenComparing(Function<? super Song, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
                return super.thenComparing(keyExtractor, keyComparator);
            }

            @Override
            public <U extends Comparable<? super U>> Comparator<Song> thenComparing(Function<? super Song, ? extends U> keyExtractor) {
                return super.thenComparing(keyExtractor);
            }

            @Override
            public Comparator<Song> thenComparingInt(ToIntFunction<? super Song> keyExtractor) {
                return super.thenComparingInt(keyExtractor);
            }

            @Override
            public Comparator<Song> thenComparingLong(ToLongFunction<? super Song> keyExtractor) {
                return super.thenComparingLong(keyExtractor);
            }

            @Override
            public Comparator<Song> thenComparingDouble(ToDoubleFunction<? super Song> keyExtractor) {
                return super.thenComparingDouble(keyExtractor);
            }
        };
        songList.add(nextSong);
    }
}
