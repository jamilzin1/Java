/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minigames;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.sound.sampled.*;
import javax.swing.*;

/**
 *
 * @author jamil
 */
public class MiniGames extends JFrame implements ActionListener{

       JPanel menu;
    JButton [] button = new JButton[3];
    
ImageIcon image = new ImageIcon(getClass().getResource("/minigames/snake.png"));
ImageIcon tictac = new ImageIcon(getClass().getResource("/minigames/TICTAC.png"));

Font myFont = new Font("Ink Free",Font.BOLD,50);
MiniGames(){
    
 menu = new JPanel();
   menu.setLayout(null);
  button[0] = new JButton();
  button[1] = new JButton();
  button[2] = new JButton("Quit");
  button[2].setForeground(Color.white);
  button[2].setFont(new Font("Ink Free",Font.BOLD,30));
 // button[2].set(false);
                 // configurando imagem pro tamanho do botao
              Image img = image.getImage();
         Image tic = tictac.getImage();
   button[2].setBounds(600,670,100,30);
   button[0].setBounds(50,250 , 250, 250);
   button[1].setBounds(400,250 , 250, 250);
    Image imgScale = img.getScaledInstance(button[0].getWidth(), button[0].getHeight(), Image.SCALE_SMOOTH);
    Image imgTic = tic.getScaledInstance(button[1].getWidth(), button[1].getHeight(), Image.SCALE_SMOOTH);
   ImageIcon scaledIcon = new ImageIcon(imgScale);
   ImageIcon scaledTic = new ImageIcon(imgTic);
   button[0].setIcon(scaledIcon);
   
   for(int i=0; i<3;i++){
   button[i].setBackground(Color.black);
   button[i].addActionListener(this);
   menu.add(button[i]);
   }
   button[1].setIcon(scaledTic);
   menu.setPreferredSize(new Dimension(700,700));
   JLabel welcome = new JLabel("WELCOME!", JLabel.CENTER);
   JLabel select = new JLabel("Select your game:", JLabel.CENTER);
      welcome.setFont(myFont);
   welcome.setForeground(Color.red);
   welcome.setBounds(0, 50, 700, 80);
   select.setBounds(0, 130,700,80);
   select.setForeground(Color.white);
   select.setFont(myFont);

   menu.add(select);
    menu.setBackground(Color.black);

   menu.add(welcome);
    this.add(menu);
            this.setTitle("Mini Games - by @jamilzin");
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
        if(e.getSource()==button[0]){
      
            try {
                new SnakeFrame();
            } catch (Exception ex){
        }

    }
            if(e.getSource()==button[1]){
      
           JOptionPane.showMessageDialog(null,"Tic-Tac-Toe coming soon");

    }
        if(e.getSource()==button[2]){
      
          System.exit(0);
    }
}
}
