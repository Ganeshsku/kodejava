package org.kodejava.example.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TextAreaTabMoveFocus extends JFrame {
    public TextAreaTabMoveFocus() {
        initialize();
    }

    private void initialize() {
        setSize(300, 300);
        setTitle("JTextArea TAB DEMO");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JTextField textField = new JTextField();
        JPasswordField passwordField = new JPasswordField();
        final JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);

        //
        // Add key listener to change the TAB behaviour in
        // JTextArea to transfer focus to other component forward
        // or backward.
        //
        textArea.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_TAB) {
                    if (e.getModifiers() > 0) {
                        textArea.transferFocusBackward();
                    } else {
                        textArea.transferFocus();
                    }
                    e.consume();
                }
            }
        });

        getContentPane().add(textField, BorderLayout.NORTH);
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        getContentPane().add(passwordField, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TextAreaTabMoveFocus().setVisible(true);
            }
        });
    }
}
