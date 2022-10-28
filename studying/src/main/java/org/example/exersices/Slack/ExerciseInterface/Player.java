package org.example.exersices.Slack.ExerciseInterface;

public interface Player<T> {
    void play();

    void stop();

    void loadFile(T file);
}

