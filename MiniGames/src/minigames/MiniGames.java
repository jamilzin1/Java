/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minigames;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author jamil
 */
public class MiniGames extends JFrame implements ActionListener{

       JPanel menu;
    JButton[] games = new JButton[3];
ImageIcon image = new ImageIcon(getClass().getResource("/minigames/snake.png"));

Font myFont = new Font("Ink Free",Font.BOLD,50);
MiniGames(){
    
 menu = new JPanel();
   menu.setLayout(null);
   JLabel snakePane = new JLabel();
                 // configurando imagem pro tamanho do botao
              Image img = image.getImage();
   snakePane.setBounds(80,250 , 100, 80);
    Image imgScale = img.getScaledInstance(snakePane.getWidth(), snakePane.getHeight(), Image.SCALE_SMOOTH);
   ImageIcon scaledIcon = new ImageIcon(imgScale);
   snakePane.setIcon(scaledIcon);
   menu.setPreferredSize(new Dimension(700,700));
   JLabel welcome = new JLabel("WELCOME!", JLabel.CENTER);
   welcome.setFont(new Font("Ink Free",Font.BOLD,80));
   JLabel select = new JLabel("Select your game:", JLabel.CENTER);
   welcome.setForeground(Color.red);
   welcome.setBounds(0, 50, 700, 80);
   select.setBounds(0, 130,700,80);
   select.setForeground(Color.white);
   select.setFont(myFont);
   menu.add(snakePane);
   menu.add(select);
   

    games[0] = new JButton("Snake Game");
    games[1] = new JButton("Jogo da Velha");
    games[2] = new JButton("Minefield");
    games[0].setBounds(200, 250, 350, 80);
    games[1].setBounds(200, 350, 350, 80);
    games[2].setBounds(200, 450, 350, 80);

    menu.setBackground(Color.black);
for (int i=0; i<3;i++){
menu.add(games[i]);
games[i].setBackground(Color.black);
games[i].setFont(myFont);
games[i].setForeground(Color.white);
games[i].addActionListener(this);
}
   menu.add(welcome);
    this.add(menu);
            this.setTitle("Mini Games");
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        
}
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
  
new MiniGames();
    }
        @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==games[0]){
      
            try {
                new SnakeFrame();
            } catch (Exception ex){

        }

    }
}}
