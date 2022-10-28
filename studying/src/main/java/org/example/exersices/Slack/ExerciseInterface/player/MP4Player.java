package org.example.exersices.Slack.ExerciseInterface.player;

import org.example.exersices.Slack.ExerciseInterface.File;
import org.example.exersices.Slack.ExerciseInterface.Player;
import org.example.exersices.Slack.ExerciseInterface.file.MP4File;

public class MP4Player implements Player <File> {
    @Override
    public void play() {
        System.out.println("Play Mp4");
    }

    @Override
    public void stop() {
        System.out.println("Stop Mp4");
    }

    @Override
    public void loadFile(File file) {
        file.read();
    }
}

