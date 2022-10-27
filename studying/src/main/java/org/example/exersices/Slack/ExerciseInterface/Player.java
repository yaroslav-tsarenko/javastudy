package org.example.exersices.Slack.ExerciseInterface;

public class Player {
    public void play(){
        System.out.println("Playing...");

    }

    public void stop(){
        System.out.println("Stopped");

    }
}

class MP3Player extends Player {

}

class MP4Player extends Player{

}

class VideoPlayer extends Player{

}