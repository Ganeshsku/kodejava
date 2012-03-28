package org.kodejava.example.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SingleLineTextArea extends JFrame {
    public SingleLineTextArea() {
        initialize();
    }

    private void initialize() {
        setSize(300, 300);
        setTitle("Single Line Text Area");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        final JTextArea textArea = new JTextArea();
        textArea.setLineWrap(true);

        //
        // Filter a new line, pressing enter key will be replaced
        // with a space instead.
        //
        textArea.getDocument().putProperty("filterNewlines",
                Boolean.TRUE);

        JScrollPane scrollPane = new JScrollPane(textArea);

        //
        // Pressing the Save button print out the text area text
        // into the console.
        //
        JButton button = new JButton("Save");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(textArea.getText());
            }
        });
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        getContentPane().add(button, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SingleLineTextArea().setVisible(true);
            }
        });
    }
}
