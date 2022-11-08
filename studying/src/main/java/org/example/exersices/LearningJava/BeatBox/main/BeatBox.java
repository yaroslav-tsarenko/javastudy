/*
package org.example.exersices.LearningJava.BeatBox.main;

import java.awt.*;
import javax.swing.*;
import javax.sound.midi.*;
import java.util.*;
import java.awt.*;

public class BeatBox {
    JPanel mainPanel;
    ArrayList<JCheckBox> checkBoxList;
    Sequencer sequencer;
    Sequence sequence;
    Track track;
    JFrame theFrame;

    String[] instrumentNames = {"Bass Drum", "Closed Hit-Hat", "Open Hi-Hat", "Acoustic Share", "Crash Cymbal", "Hand Clap" +
            "High Tom", "Hi Bongo", "Maracas", "Whistle", "Low Conga", "Cowbell", "Vibraslap", "Low-mid Tom", "High Agogo" +
    "Open Hi Conga"};

    int[] instruments = {35, 42, 46, 38, 49, 39, 50, 60, 70, 64, 56, 58, 47, 67, 63};

    public static void main(String[] args) {
        new BeatBox2().buildGUI();
    }

    public void buildGUI(){
        theFrame = new JFrame("Cyber BeatBox");
        theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BorderLayout layout = new BorderLayout();
        JPanel background = new JPanel(layout);
        background.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

        checkBoxList = new ArrayList<JCheckBox>();
        Box buttonBox = new Box(BoxLayout.Y_AXIS);

        JButton start = new Button("Start");
        start.addActionListener(new MyStartListener);
        buttonBox.add(start);

        JButton stop = new Button("Stop");
        start.addActionListener(new MyStopListener);
        buttonBox.add(stop);

        JButton upTempo = new Button("Tempo up");
        upTempo.addActionListener(new MyUpTempoListener);
        buttonBox.add(upTempo);

        JButton downTempo = new JButton("Tempo Down");






    }


}
*/
