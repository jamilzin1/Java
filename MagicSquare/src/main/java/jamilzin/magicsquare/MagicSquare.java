package jamilzin.magicsquare;
import javax.swing.*;
 import java.awt.*;
 import java.awt.event.*;
//import java.awt.event.FocusAdapter;
//import java.awt.event.FocusEvent;
//import javax.swing.JButton;
//import javax.swing.JTextField;

public class MagicSquare implements ActionListener {

    //declarando
    JFrame frame;
    JPanel panel,panelFunctions;
    JButton[] numbers = new JButton[10];
    JTextField[] positions = new JTextField[9];
    JButton[] functions = new JButton[2];
    private JTextField focusField;
    
    void magicSquare(){
    
    frame = new JFrame("Quadrado Magico");
    frame.setSize(500,500);
    panel = new JPanel();
    panelFunctions = new JPanel();
    
     numbers[1] = new JButton("1");
     numbers[2] = new JButton("2");
     numbers[3] = new JButton("3");
     numbers[4] = new JButton("4");
     numbers[5] = new JButton("5");
     numbers[6] = new JButton("6");
     numbers[7] = new JButton("7");
     numbers[8] = new JButton("8");
     numbers[9] = new JButton("9");
     
     functions[0]= new JButton("Limpar");
     functions[1]= new JButton("Sair");
    functions[0].addActionListener(this);
    functions[1].addActionListener(this);

     
    for(int i=1;i<10;i++){
     numbers[i].addActionListener(this);
     numbers[i].setBackground(Color.lightGray);
    }
    
    for(int i=0; i<9;i++){
    positions[i] = new JTextField();
    positions[i].addFocusListener(new FocusAdapter() {
    
    @Override
    
    public void focusGained(FocusEvent click){
    focusField = (JTextField)click.getSource();
    }
            
    } );
}
 
    panel.setBounds(0, 0, 500, 400);
   panel.setLayout(new GridLayout(6,3,0,0));
    panelFunctions.setBounds(50,410,400,30);
   panelFunctions.setLayout(new GridLayout(1,2,250,0));
   
    panel.add(positions[0]);
    panel.add(positions[1]);
    panel.add(positions[2]);
    panel.add(positions[3]);
    panel.add(positions[4]);
    panel.add(positions[5]);
    panel.add(positions[6]);
    panel.add(positions[7]);
    panel.add(positions[8]);
    panel.add(numbers[1]);
    panel.add(numbers[2]);
    panel.add(numbers[3]);
    panel.add(numbers[4]);
    panel.add(numbers[5]);
    panel.add(numbers[6]);
    panel.add(numbers[7]);
    panel.add(numbers[8]);
    panel.add(numbers[9]);
    panelFunctions.add(functions[0]);
    panelFunctions.add(functions[1]);
    frame.setLayout(null);

  
    frame.setVisible(true);
      frame.add(panel);
    frame.add(panelFunctions);
    }
    
    
  


  @Override
    public void actionPerformed(ActionEvent e) {
/*
        if(focusField!=null){
                focusField.setText(e.getActionCommand());
                
        } */
        JButton botaoClick = (JButton)e.getSource();
            

                 focusField.setText(botaoClick.getText());

            
    }
 /*
            
                @Override
    public void actionPerformed(ActionEvent e) {
      JButton btnPressed = (JButton)e.getSource();
      for(int i=0; i<numbers.length;i++){
        if(numbers[i] == btnPressed){
            positions[i-1].setText(btnPressed.getText());
        }
     }

    }
            */
    
    
       public static void main(String[] args) {
        MagicSquare quadrado = new MagicSquare();
        quadrado.magicSquare();
    }}



    
    

