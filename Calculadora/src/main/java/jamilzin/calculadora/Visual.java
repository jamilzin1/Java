package jamilzin.calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Visual implements ActionListener{
    
    JFrame janela;
    JTextField texto;
    JButton[] numeros = new JButton[10];
    JButton[] funcoes = new JButton[10];
    JPanel painel;
    JButton soma,sub,dividir,multi,porcentagem,potencia,igual,decimal,limpar,limparAll;
    
    double num1,resultado,num2;
    char operador;
   public void calculadora(){
   // inicializando "as partes" da interface
   
   janela = new JFrame("Calculadora");
   janela.setSize(200,300);
   janela.setLayout(null);
   janela.setLocationRelativeTo(null);
   janela.setResizable(false);
   texto = new JTextField();
   texto.setBounds(8, 5, 170, 40); // adivinhar os numeros dos pixels que eu queria aqui foi dificil

   janela.add(texto);

   painel = new JPanel();

   // criando os botoes
   soma = new JButton("+");
   sub = new JButton("-");
   dividir = new JButton("/");
   multi = new JButton("*");
   porcentagem = new JButton("%");
   potencia = new JButton("x2");
   igual = new JButton("=");
   decimal = new JButton(".");
   limpar = new JButton("C");
   limparAll = new JButton("CE");

   // atribuindo cada funçao numa posiçao de vetor
    funcoes[0] = soma;
    funcoes[1] = sub;
    funcoes[2] = dividir;
    funcoes[3] = multi;
    funcoes[4] = porcentagem;
    funcoes[5] = potencia;
    funcoes[6] = igual;
    funcoes[7] = decimal;
    funcoes[8] = limpar;
    funcoes[9] = limparAll;

   for(int i=0;i<10;i++){ // criando açoes para o vetor de funcoes
  funcoes[i].addActionListener(this);
  funcoes[i].setBackground(Color.PINK);
   }
   
   for(int i=0; i<10;i++){ // criando açoes para o vetor de numeros
   numeros[i]= new JButton(String.valueOf(i));
   numeros[i].addActionListener(this);
    numeros[i].setBackground(Color.white);

   }
   // estetica
   igual.setBackground(Color.LIGHT_GRAY); 
   painel.setBounds(0,50, 190,200);
  painel.setLayout(new GridLayout(7,3,0,0));

  // adicionando os botoes no painel
   painel.add(numeros[1]);
   painel.add(numeros[2]);
   painel.add(soma);
   painel.add(numeros[3]);
   painel.add(numeros[4]);
   painel.add(sub);
   painel.add(numeros[5]);
   painel.add(numeros[6]);
   painel.add(dividir);
   painel.add(numeros[7]);
   painel.add(numeros[8]);
   painel.add(multi);
   painel.add(numeros[9]);
   painel.add(numeros[0]);
   painel.add(igual);
   painel.add(potencia);
   painel.add(decimal);
   painel.add(porcentagem);
   painel.add(limpar);
   painel.add(limparAll);

   janela.add(painel);  
  janela.setBackground(Color.BLACK); // infelizmente essa linha esta inutil, nao consegui colorir :(
  janela.setVisible(true);
   }

    @Override
        
        public void actionPerformed(ActionEvent e) { // pegando as açoes "e" do clique e realizando as operaçoes
		
		for(int i=0;i<10;i++) {
			if(e.getSource() == numeros[i]) {
				texto.setText(texto.getText().concat(String.valueOf(i)));
                              
			}
		}
                
		if(e.getSource()==decimal) {
				texto.setText(texto.getText().concat("."));
		}
		if(e.getSource()==soma) {
			num1 = Double.parseDouble(texto.getText());
			operador ='+';
                        texto.setText("");

		}
		if(e.getSource()==sub) {
			num1 = Double.parseDouble(texto.getText());
			operador ='-';
			texto.setText("");
		}
		if(e.getSource()==multi) {
			num1 = Double.parseDouble(texto.getText());
			operador ='*';
			texto.setText("");
		}
		if(e.getSource()==dividir) {
			num1 = Double.parseDouble(texto.getText());
			operador ='/';
			texto.setText("");
                }
                 if(e.getSource() == potencia){
                 num1= Double.parseDouble(texto.getText());
                 resultado = num1*num1;
                texto.setText(String.valueOf(resultado));
                num1=resultado;
                 }
                 
		
                if(e.getSource()==porcentagem) {
			num2 = Double.parseDouble(texto.getText());
			
			switch(operador) {
			case'+':
				resultado=num1+(num2*num1/100);
				break;
			case'-':
				resultado=num1-(num2*num1/100);
				break;
			case'*':
				resultado=num1*(num2*num1/100);
				break;
			case'/':
				resultado=num1/(num2*num1/100);
				break;
                                
			}
			texto.setText(String.valueOf(resultado));
			num1=resultado;
		} 
                 
                 
		if(e.getSource()==igual) {
			num2 = Double.parseDouble(texto.getText());
			
			switch(operador) {
			case'+':
				resultado=num1+num2;
				break;
			case'-':
				resultado=num1-num2;
				break;
			case'*':
				resultado=num1*num2;
				break;
			case'/':
				resultado=num1/num2;
				break;
                                
			}
			texto.setText(String.valueOf(resultado));
			num1=resultado;
		}
                
		if(e.getSource()==limparAll) {
			texto.setText("");
                        num1=0;
                        num2=0;
                        resultado = 0;
		}
		if(e.getSource()==limpar) {
		texto.setText("");
			}
		}
	
            public static void main(String[] args) {
        Visual calc = new Visual();
        calc.calculadora();
    }
        
        
    }
    

