package ProgressBar;

import javax.swing.*;
import java.awt.*;

public class ProgressBarDemo {

    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar();

    ProgressBarDemo() throws InterruptedException {

        bar.setValue(0);
        bar.setBounds(0, 0, 300, 50);
        bar.setStringPainted(true);
        bar.setFont(new java.awt.Font("Dialog", 1, 20));
        bar.setForeground(Color.RED);
        bar.setBackground(Color.BLACK);

        frame.add(bar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);

        fill();
    }

    public void fill() throws InterruptedException {
        int counter = 0;

        while (counter <= 100) {

            bar.setValue(counter);
            Thread.sleep(50);
            counter += 1;
        }
        bar.setString("Done");
    }
}
