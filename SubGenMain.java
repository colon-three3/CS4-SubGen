import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class SubGenMain {
          public static void main(String[] args) {
                    // aaaaaaaaa
                    JFrame mainFrame = new JFrame("SubGen");    
                    JPanel mainPanel = new JPanel();

                    mainFrame.setContentPane(mainPanel);
                    mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    mainFrame.setSize(400, 300);
                    mainFrame.setVisible(true);

                    JLabel label = new JLabel("aaaaaa");
                    
                    mainPanel.add(label);
                    mainFrame.setVisible(true);
          }
}