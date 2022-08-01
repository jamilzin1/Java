package minigames;

import javax.swing.JFrame;

public class SnakeFrame extends JFrame  {

    //Creating a  frame for snake
	private static final long serialVersionUID = 1L;
        SnakeFrame() {
        this.add(new SnakePanel());
        this.setTitle("Snake");
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        }
}
