package org.example.exersices.Slack.ExerciseInterface.file;

import org.example.exersices.Slack.ExerciseInterface.File;

public class MP3File implements File {
    @Override
    public void read() {
        System.out.println("Reading MP3...");
    }
}
