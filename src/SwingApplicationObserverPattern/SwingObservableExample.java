package SwingApplicationObserverPattern;

import javax.swing.*;
import java.awt.*;


public class SwingObservableExample {
    JFrame frame;
    public static void main(String[] args) {
//        JFrame f = new JFrame();
//        f.setVisible(true);
        SwingObservableExample swingObservableExample = new SwingObservableExample();
        swingObservableExample.go();
    }
    public void go(){
        frame = new JFrame();
        JButton jButton = new JButton("Should I do it?");
        jButton.addActionListener(new AngelListener());
        jButton.addActionListener(new DevilListener());
        frame.getContentPane().add(BorderLayout.CENTER,jButton);
        frame.setSize(20,20);
        frame.setVisible(true);
    }
}
