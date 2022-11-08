package org.example.exersices.LearningJava.BeatBox.introduction;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleGui3C implements ActionListener {
    JFrame frame;

    public static void main(String[] args) {
        SimpleGui3C gui = new SimpleGui3C();
        gui.go();
    }

    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Change colors");
        button.addActionListener(this);
        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        frame.repaint();
    }


}

class MyDrawPanel extends JPanel {
    public void paintComponent(Graphics g) {
       /*     g.fillRect(0,0,this.getWidth(), this.getHeight());

            int red = (int) (Math.random() * 255);
            int blue = (int) (Math.random() * 255);
            int green = (int) (Math.random() * 255);

            Color randomColor = new Color(red, green, blue);
            g.setColor(randomColor);
            g.fillOval(70,70,100,100);*/

        g.setColor(Color.orange);
        g.fillRect(20, 50, 100, 100);
    }
}
