package org.example.exersices.Slack.ExerciseInterface.file;

import org.example.exersices.Slack.ExerciseInterface.File;

public class VideoFile implements File {
    @Override
    public void read() {
        System.out.println("Reading VideoFile...");
    }
}
