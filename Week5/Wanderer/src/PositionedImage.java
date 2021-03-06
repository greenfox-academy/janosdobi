import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PositionedImage implements Drawable {

    BufferedImage image;
    int posX, posY;
    private int size = 72;

    public PositionedImage() {

    }

    public PositionedImage(String filename) {
        try {
            image = ImageIO.read(new File(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public PositionedImage(String filename, int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
        try {
            image = ImageIO.read(new File(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void draw(Graphics graphics) {
        if (image != null) {
            graphics.drawImage(image, posX * size, posY * size, null);
        }
    }
}