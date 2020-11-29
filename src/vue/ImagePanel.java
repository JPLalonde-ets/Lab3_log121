package view;

import controller.GestionnaireCommande;
import model.Image;
import model.Perspective;
import model.Subject;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class ImagePanel extends JPanel implements Observer {

    private BufferedImage img;
    private GestionnaireCommande gestionnaireCommande;

    public ImagePanel(BufferedImage img) {
        this.img =img;
    }

    @Override
    public void update(String path, Perspective perspective) {
        this.img = new Image(path).getImage();
        validate();
        repaint();
    }



    @Override
    public Dimension getPreferredSize(){
        return new Dimension(200,125);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(img, 0, 0, this); // see javadoc for more info on the parameters
    }


}
