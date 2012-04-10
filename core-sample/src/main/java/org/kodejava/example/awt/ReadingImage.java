package org.kodejava.example.awt;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ReadingImage {
    public void getImage() {
        try {
            BufferedImage image = ImageIO.read(getClass().
                    getResourceAsStream("/Sunset.jpg"));

            //
            // Do something with the image.
            //
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ReadingImage ri = new ReadingImage();
        ri.getImage();
    }
}
