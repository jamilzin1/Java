
package minigames;

import java.awt.Color;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SnakeFrame extends JFrame  {

        SnakeFrame() throws UnsupportedAudioFileException, IOException, LineUnavailableException{

            this.add(new SnakePanel());
        this.setTitle("Snake");
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        
        
        
        }


    
}
