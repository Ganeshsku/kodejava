package org.kodejava.example.swing;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.io.InputStreamReader;

public class PopulateTextAreaFromFile extends JFrame {
    public PopulateTextAreaFromFile() {
        initialize();
    }

    private void initialize() {
        setSize(300, 300);
        setTitle("Populate JTextArea from File");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        try {
            //
            // Read some text from the resource file to display in
            // the JTextArea.
            //
            textArea.read(new InputStreamReader(
                    getClass().getResourceAsStream("/data.txt")),
                    null);
        } catch (IOException e) {
            e.printStackTrace();
        }

        getContentPane().add(scrollPane, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new PopulateTextAreaFromFile().setVisible(true);
            }
        });
    }
}
