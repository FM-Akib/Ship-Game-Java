import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Background extends JPanel{
    Image sea;
    Submerine sm;
    Background(){
        setFocusable(true);
        ImageIcon ii = new ImageIcon("sea3.jpg");
        sea = ii.getImage();
        sm =new Submerine();

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                sm.move(e);
            }

            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                //sm.submarine_image=sm.subm_stop_image;
                sm.stop(e);
            }
        });
        setFocusable(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(sea,0,0,this);
        g.drawImage(sm.submarine_image,sm.x,sm.y,this);
        repaint();
    }
}
