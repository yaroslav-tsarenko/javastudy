package org.example.collections.ArrayList;

import java.util.*;
import java.io.*;

public class Jukebox6 {
    ArrayList<Song> songList = new ArrayList<Song>();

    public void go(){
        getSongs();
        System.out.println(songList);
        /*Collections.sort(songList);*/
        System.out.println(songList);
        HashSet<Song> songSet = new HashSet<Song>();
        System.out.println(songSet);
    }

    private void getSongs() {
    }
}
