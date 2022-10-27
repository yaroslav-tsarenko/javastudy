package org.example.exersices.Slack.ExerciseInterface;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        MP3Player mp3Player = new MP3Player();
        MP4Player mp4Player = new MP4Player();
        VideoPlayer videoPlayer = new VideoPlayer();
        test(MP3Player);
        test(MP4Player);
        test(VideoPlayer);
        D'D:D"DD3r3'
    }

    public static void test(Player player){
        player.play();
        player.stop();
    }
}
