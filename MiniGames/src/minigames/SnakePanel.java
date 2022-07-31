
package minigames;

import java.awt.Graphics;
import java.awt.event.*;
import java.util.Random;
import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.*;

public class SnakePanel extends JPanel implements ActionListener  
        {
    static final int SCREEN_WIDTH = 700;
    static final int SCREEN_HEIGHT = 700;
    static final int UNIT = 25;
    static final int GAME_UNIT = (SCREEN_WIDTH*SCREEN_HEIGHT)/UNIT;
    int DELAY = 55;
    final int x[] = new int[GAME_UNIT];
    final int y[] = new int[GAME_UNIT];
    int bodyParts = 3;
    int itemEat;
    int itemX;
    int itemY;
    char direction = 'R';
    boolean running = true;
    Timer timer;
    Random random;
    int louco = 0;
    
    SnakePanel() {
    random = new Random();
    this.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_HEIGHT));
    this.setFocusable(true);
    this.addKeyListener(new MyKeyAdapter());
    this.setBackground(new Color(46,40,40));
    startSnake();
     musica(running);

    }


    public void startSnake() {
      bodyParts = 3;
        if(louco==0){
         running = true;
 spawnItem();
 timer = new Timer(DELAY,this);
 timer.start();}

        else {
            timer.start();
        x[0] = 300;
        y[0]=300;

    spawnItem();
         }

    }
    
    public void spawnItem(){
        itemX = random.nextInt(SCREEN_WIDTH/UNIT)*UNIT;
        itemY = random.nextInt(SCREEN_HEIGHT/UNIT)*UNIT;

    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
draw(g);
    }
    
  void  musica(boolean running){
      if(running==true){
                        try {
            String musica = "gameMusic.wav";
            File file = new File(musica);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            if(running){
            clip.start();}
            if(running==false){
                clip.stop();}

        } catch(Exception ex){
        }}

  }
  
    public void draw(Graphics g) {
        if(running){
    g.setColor(Color.red);
    g.fillOval(itemX, itemY, UNIT, UNIT);
    for(int i=0;i<bodyParts;i++){
    if(i==0){
    g.setColor(Color.green);
    g.fillRect(x[i], y[i], UNIT, UNIT);
    }
    else{
    g.setColor(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)));
    g.fillRect(x[i], y[i], UNIT, UNIT);
    }
    }
    }
        else {
                     gameOver(g);

        }
    }

    public void move(){
    for(int i = bodyParts;i>0;i--){
    x[i]=x[i-1];
    y[i]=y[i-1];
    }
    switch(direction){
        case 'U':
            y[0] = y[0]-UNIT;
            break;
          case 'D':
            y[0] = y[0]+UNIT;
            break;
         case 'L':
            x[0] = x[0]-UNIT;
            break;
          case 'R':
            x[0] = x[0]+UNIT;
            break;
    }
    }
    
    public void checkItem(){
    if((x[0]==itemX)&&y[0]==itemY){
    bodyParts++;
    spawnItem();
   timer.setDelay(DELAY-1);
    }
    }
    
    public void checkCollision(){
    //checks if head collides with body
		for(int i = bodyParts;i>0;i--) {
			if((x[0] == x[i])&& (y[0] == y[i])) {
				running = false;
			}
		}
		//check if head touches left border
		if(x[0] < 0) {
			running = false;
		}
		//check if head touches right border
		if(x[0] > SCREEN_WIDTH) {
			running = false;
		}
		//check if head touches top border
		if(y[0] < 0) {
			running = false;
		}
		//check if head touches bottom border
		if(y[0] > SCREEN_HEIGHT) {
			running = false;
		}
                if(!running){
                    timer.stop();
                }
    }
    
    public void gameOver(Graphics g){
    g.setColor(Color.red);
    g.setFont(new Font("Ink Free",Font.BOLD,50));
    FontMetrics metrics =  getFontMetrics(g.getFont());
    g.drawString("GAME OVER", (SCREEN_WIDTH - metrics.stringWidth("GAME OVER"))/2, 
    SCREEN_HEIGHT/2);
    g.drawString("Press F2 to restart", 200, 600);  
      g.drawString("Press F3 to leave", 200, 700);    
}


    @Override
    public void actionPerformed(ActionEvent e) {
   
        if(running){
        move();
        checkItem();
        checkCollision();
 }
        repaint();
    }
    
    public class MyKeyAdapter extends KeyAdapter{

        @Override
        public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode()){
            case KeyEvent.VK_LEFT: 
                if(direction!='R'){
                direction = 'L';
                }
                break;
              case KeyEvent.VK_RIGHT: 
                if(direction!='L'){
                direction = 'R';
                }
                break;
              case KeyEvent.VK_UP: 
                if(direction!='D'){
                direction = 'U';
                }
                break;
              case KeyEvent.VK_DOWN: 
                if(direction!='U'){
                direction = 'D';
                }
                break;
               case KeyEvent.VK_F2: {
             //  System.exit(0);
                   running = true;
                      louco =1;
                   startSnake();
                   repaint();
                   

               }
                   break;
        case KeyEvent.VK_F3: {
               System.exit(0);}
                   break;
                   
                }
        }
        
        }
    
    
    }

