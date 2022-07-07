/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jamilzin.magicsquare;

public class main {
    
   /* 
    public static void main(String[] args) {
        MagicSquare quadrado = new MagicSquare();
        quadrado.magicSquare();
    
    import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame();
                frame.add(new TestPane());
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }

    public class TestPane extends JPanel {
        private JTextField[] positions = new JTextField[9];
        private JButton[] numbers = new JButton[10];

        private JTextField lastFocusedField;

        public TestPane() {
            JPanel textFieldPane = new JPanel(new GridLayout(3, 3));
            for (int index = 0; index < positions.length; index++) {
                positions[index] = new JTextField(10);
                positions[index].addFocusListener(new FocusAdapter() {
                    @Override
                    public void focusGained(FocusEvent e) {
                        lastFocusedField = (JTextField)e.getSource();
                    }
                });
                textFieldPane.add(positions[index]);
            }

            JPanel buttonGridPane = new JPanel(new GridLayout(3, 3));
            for (int index = 0; index < numbers.length; index++) {
                numbers[index] = new JButton(Integer.toString(index));
                numbers[index].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (lastFocusedField != null) {
                            lastFocusedField.setText(e.getActionCommand());
                        }
                    }
                });
            }
            for (int index = 0; index < 9; index++) {
                buttonGridPane.add(numbers[index]);
            }
            JPanel numbersPane = new JPanel(new GridLayout(2, 1));
            numbersPane.add(buttonGridPane);
            numbersPane.add(numbers[9]);

            GridBagConstraints gbc = new GridBagConstraints();
            setLayout(new GridBagLayout());
            gbc.gridwidth = GridBagConstraints.REMAINDER;

            add(textFieldPane, gbc);
            add(numbersPane, gbc);
        }
    }
}
    
    } */
}
