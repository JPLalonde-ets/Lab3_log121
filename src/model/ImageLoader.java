package view;

import model.Image;
import model.Perspective;

import java.awt.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageLoader extends Component implements Observer {

    private static final long serialVersionUID = 1L;
    private BufferedImage img;

    public BufferedImage getImg() {
        return img;
    }

    public void setImg(BufferedImage img) {
        this.img = img;
    }

    public void parseImage(File parsedImage) throws IOException {
        this.img = ImageIO.read(parsedImage);
    }

    public void paint(Graphics g) {
        g.drawImage(img, 0, 0, this);

    }

    public Dimension getPreferredSize() {
        if (img == null) {
            return new Dimension(100, 100);
        } else {
            return new Dimension(img.getWidth(null), img.getHeight(null));
        }
    }

    @Override
    public void update(String path, Perspective perspective) {
        Image img = new Image(path);
        this.img = img.getImage();

    }
}
