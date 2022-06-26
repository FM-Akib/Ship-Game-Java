import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Submerine {
    Image submarine_image;

    Image Right_image;
    Image Left_image;
    Image Running_Right_image;
    Image Running_Left_image;

    ImageIcon submarine_image_Icon;

    int x=0;
    int y=0;
    Submerine(){
        submarine_image_Icon = new ImageIcon("submrn_stop_right.png");
        Right_image = submarine_image_Icon.getImage();

        submarine_image_Icon = new ImageIcon("submrn_stop_left.png");
        Left_image = submarine_image_Icon.getImage();

        submarine_image_Icon = new ImageIcon("submrn_running_right.gif");
        Running_Right_image = submarine_image_Icon.getImage();

        submarine_image_Icon = new ImageIcon("submrn_running_left.gif");
        Running_Left_image = submarine_image_Icon.getImage();

        submarine_image = Right_image;
        x=50;y=150;
   }
   void move(KeyEvent e){

       if(e.getKeyCode()==39){
           submarine_image =Running_Right_image;
           x=x+5;
       }
       if(e.getKeyCode()==37){
           submarine_image=Running_Left_image;
           x=x-5;
       }
       if (e.getKeyCode()==40) {
           //submarine_image =
           y=y+5;
       }
       if(e.getKeyCode()==38){
           //submarine_image =
           y=y-5;
       }
   }
    void stop(KeyEvent e){
        if(e.getKeyCode()==39){
            submarine_image =Right_image;
            x=x+5;
        }
        if(e.getKeyCode()==37){
            submarine_image =Left_image;
            x=x-5;
        }
        if (e.getKeyCode()==40) {
            y=y+5;
        }
        if(e.getKeyCode()==38){
            y=y-5;
        }
    }
}
