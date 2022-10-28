package org.example.exersices.Slack.ExerciseInterface.player;

import org.example.exersices.Slack.ExerciseInterface.File;
import org.example.exersices.Slack.ExerciseInterface.Player;
import org.example.exersices.Slack.ExerciseInterface.file.MP3File;

public class MP3Player implements Player <File>{

    @Override
    public void play() {
        System.out.println("Play Mp3");
    }

    @Override
    public void stop() {
        System.out.println("Stop Mp3");
    }

    @Override
    public void loadFile(File file) {
        file.read();
    }
}
