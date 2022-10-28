package org.example.exersices.Slack.ExerciseInterface;


import org.example.exersices.Slack.ExerciseInterface.file.MP3File;
import org.example.exersices.Slack.ExerciseInterface.file.MP4File;
import org.example.exersices.Slack.ExerciseInterface.file.VideoFile;
import org.example.exersices.Slack.ExerciseInterface.player.MP3Player;
import org.example.exersices.Slack.ExerciseInterface.player.MP4Player;
import org.example.exersices.Slack.ExerciseInterface.player.VideoPlayer;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        String input = "Video";
        String input2 = "MP3";
        String input3 = "MP4";
        Player<File> player = null;
        File file = null;
        Scanner scanner = new Scanner(input2);
        String userChoice = scanner.next();
        switch (userChoice) {
            case "MP3":
                player = new MP3Player();
                file = new MP3File();
                break;
            case "MP4":
                player = new MP4Player();
                file = new MP4File();
                break;
            case "Video":
                player = new VideoPlayer();
                file = new VideoFile();
                break;
            default:
                System.err.println("Unknown file type");
                System.exit(-1);
        }
        player.loadFile(file);
        TimeUnit.MILLISECONDS.sleep(3000L);
        player.play();
        TimeUnit.MILLISECONDS.sleep(3000L);
        player.stop();
    }
}
