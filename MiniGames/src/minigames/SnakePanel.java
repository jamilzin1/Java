
package minigames;

import java.awt.event.*;
import java.util.Random;
import java.awt.*;
import javax.swing.*;
import java.net.URL;
import javax.sound.sampled.*;


public class SnakePanel extends JPanel implements ActionListener  
        {
//variables
    private static final long serialVersionUID = 1L;
    static final int SCREEN_WIDTH = 700;
    static final int SCREEN_HEIGHT = 700;
    static final int UNIT = 25;
    static final int GAME_UNIT = (SCREEN_WIDTH*SCREEN_HEIGHT)/UNIT;
    final int x[] = new int[GAME_UNIT];
    final int y[] = new int[GAME_UNIT];
    int itemEat,itemX,itemY,gameOn=0,DELAY=55,bodyParts = 3,record;
    char direction = 'R';
    boolean running = true;
    Timer timer;
    Random random;
    
    // methods where set musics to play
    private Clip clipMusic = musica();
    private Clip clipEat = eatSound();
    private Clip clipLose = loseSound(); 
    URL musicSound,eatSound,loseSound;

    // sounds methods
  Clip  musica() {
      try{
          musicSound = getClass().getResource("/Music1.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(musicSound);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
             return clip;
       }
     catch(Exception ex){
            ex.printStackTrace();
     }
             return clipMusic;
  } 
  
  Clip  eatSound() {
      try{
eatSound = getClass().getResource("/eatSound.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(eatSound);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
             return clip;
       }
     catch(Exception ex){
            ex.printStackTrace();}
             return clipEat;
  }
    
  Clip  loseSound() {
      try{
            loseSound = getClass().getResource("/lose.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(loseSound);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
             return clip;
       }
     catch(Exception ex){
            ex.printStackTrace();}
             return clipLose;
  }  
   
    // A panel for game
    SnakePanel()  {
    random = new Random();
    this.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_HEIGHT));
    this.setFocusable(true);
    this.addKeyListener(new MyKeyAdapter());
    this.setBackground(new Color(46,40,40));
    startSnake();
    }

    //start game 
    public void startSnake() {
  clipMusic.setMicrosecondPosition(0);
  clipMusic.start();
      bodyParts = 3;
        if(gameOn==0){
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
    
    // RGN for spawn new items
    public void spawnItem(){
        itemX = random.nextInt(SCREEN_WIDTH/UNIT)*UNIT;
        itemY = random.nextInt(SCREEN_HEIGHT/UNIT)*UNIT;
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        draw(g);
    }
    
   // draw snake, item(apple), score
    public void draw(Graphics g) {
        if(running){
    g.setColor(Color.red);
    g.fillOval(itemX, itemY, UNIT, UNIT);
    g.setColor(Color.white);
    g.setFont(new Font("Ink Free",Font.BOLD,30));
    g.drawString("Score: "+itemEat, 280, 50);
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

    //move action
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
    // check if snake eat item
    public void checkItem(){
    if((x[0]==itemX)&&y[0]==itemY){
    bodyParts++;
    itemEat++;
    spawnItem();
    clipEat.setMicrosecondPosition(0);
    clipEat.start();
   timer.setDelay(DELAY-1);
    }
    }
    //check collisions  
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
		if(x[0] >= SCREEN_WIDTH) {
			running = false;
		}
		//check if head touches top border
		if(y[0] < 0) {
			running = false;
		}
		//check if head touches bottom border
		if(y[0] >= SCREEN_HEIGHT) {
			running = false;
		}
                if(!running){
                    timer.stop();
                }
    }
    
    //draw game over
    public void gameOver(Graphics g){
        clipMusic.stop();
        clipLose.setMicrosecondPosition(0);
        clipLose.start();
    g.setColor(Color.red);
    g.setFont(new Font("Ink Free",Font.BOLD,50));
    FontMetrics metrics =  getFontMetrics(g.getFont());
    g.drawString("GAME OVER", (SCREEN_WIDTH - metrics.stringWidth("GAME OVER"))/2, 
    SCREEN_HEIGHT/2);
    g.setFont(new Font("Ink Free",Font.BOLD,28));
    g.setColor(Color.blue);
    if(record < itemEat){
    record = itemEat;}
     g.drawString("Record: "+record, 300, 400);
     g.setColor(Color.white);
    g.drawString("Press F2 to restart", 50, 600); 
    g.drawString("Press F3 to back menu", 50, 630);  
    g.drawString("Press F4 to quit", 50, 660);    
}
    
    // dispose like a JFrame method
public void dispose() {
    JFrame parent = (JFrame) this.getTopLevelAncestor();
    parent.dispose();
}
    // user iteration
    @Override
    public void actionPerformed(ActionEvent e) {
        if(running){
        move();
        checkItem();
        checkCollision();
 }
        repaint();
    }
    // keyboard iteration
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
                   running = true;
                      gameOn =1;
                   startSnake();
                   repaint();
                   itemEat=0;
                   timer.setDelay(55);
               }
                break;
                
            case KeyEvent.VK_F3: {
                clipMusic.stop();
                 dispose();}
               break;
                   
            case KeyEvent.VK_F4: {
               System.exit(0);}
               break;
        }
                }
        }
    }

