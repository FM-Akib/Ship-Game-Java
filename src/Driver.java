import javax.sound.sampled.*;
import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class Driver {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Background bg=new Background();
        JFrame f = new JFrame();
        f.setSize(980,630);
        f.add(bg);
        f.setVisible(true);

        AudioInputStream a = AudioSystem.getAudioInputStream(new File("background.wav"));
        Clip clip = AudioSystem.getClip();
        clip.open(a);
        //clip.start();
        clip.loop(Clip.LOOP_CONTINUOUSLY);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
//Mohammad Fahim Muntasir Akib
//C211008