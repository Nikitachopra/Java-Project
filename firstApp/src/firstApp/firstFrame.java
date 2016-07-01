package firstApp;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Lenovo-Pc on 6/26/2016.
 */
public class firstFrame {
    public static void main(String[] args) {
        JFrame window = new JFrame("Pac Man");
        window.setVisible(true);
        windowClass mainPanel = new windowClass();
        window.setContentPane(mainPanel);
        mainPanel.setSize(517,540);
        window.setPreferredSize(mainPanel.getSize());
        window.pack();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
