package org.kodejava.example.swing;

import javax.swing.*;
import java.awt.*;

public class DisableKeyDemo extends JFrame {
    public DisableKeyDemo() {
        initialize();
    }

    private void initialize() {
        setSize(300, 300);
        setTitle("Disable Keys Demo");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea textArea = new JTextArea("Hello World!");
        JScrollPane scrollPane = new JScrollPane(textArea);
        disableKeys(textArea.getInputMap());
        disableKeys(scrollPane.getInputMap(
                JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT));

        getContentPane().add(scrollPane, BorderLayout.CENTER);
    }

    private void disableKeys(InputMap inputMap) {
        String[] keys = {"UP", "DOWN", "LEFT", "RIGHT"};
        for (String key : keys) {
            inputMap.put(KeyStroke.getKeyStroke(key), "none");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new DisableKeyDemo().setVisible(true);
            }
        });
    }
}