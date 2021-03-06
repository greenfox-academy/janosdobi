import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {

    public static void mainDraw(Graphics graphics){
      // create a square drawing function that takes 2 parameters:
      // the square size, and the fill color,
      // and draws a square of that size and color to the center of the canvas.
      // create a loop that fills the canvas with rainbow colored squares.

        int size = 200;
        for (int i = 0; i < 20; i++) {
            rainbow(graphics, size, (int) (1 + Math.random() * 255), (int) (1 + Math.random() * 255), (int) (1 + Math.random() * 255));
            size -= 20;
        }


    }

    public static void rainbow(Graphics graphics, int size, int r, int g, int b) {

        graphics.setColor(new Color(r,g,b));
        graphics.fillRect((WIDTH - size) / 2, (HEIGHT - size) / 2, size, size);

    }


//    Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}
