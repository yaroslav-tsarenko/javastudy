package org.example.exersices.LearningJava.BeatBox.introduction;

import javax.sound.midi.*;

public class MiniMiniMusicApp {
    public static void main(String[] args) {
        MiniMiniMusicApp mini = new MiniMiniMusicApp();
        mini.play();
    }

    public void play() {
        try {

            Sequencer player = MidiSystem.getSequencer();
            player.open();
            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();
            ShortMessage b = new ShortMessage();
            b.setMessage(144, 1, 44, 100);
            MidiEvent noteOff = new MidiEvent(b, 16);
            track.add(noteOff);
            player.setSequence(seq);
            player.start();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
