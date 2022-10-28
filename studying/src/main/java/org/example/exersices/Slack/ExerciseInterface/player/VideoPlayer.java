package org.example.exersices.Slack.ExerciseInterface.player;

import org.example.exersices.Slack.ExerciseInterface.File;
import org.example.exersices.Slack.ExerciseInterface.Player;
import org.example.exersices.Slack.ExerciseInterface.file.VideoFile;

public class VideoPlayer implements Player <File>{

    @Override
    public void play() {
        System.out.println("Play video");
    }

    @Override
    public void stop() {
        System.out.println("Stop video");
    }

    @Override
    public void loadFile(File file) {
        file.read();
    }

}
