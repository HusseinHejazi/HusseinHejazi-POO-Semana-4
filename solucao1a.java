import javax.swing.*;
    public class solucao1a{
        public static void main (String[] args){        
         int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero: "));
         int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero: "));
        
         int x = a + b;
        
        if(x>10){
        JOptionPane.showMessageDialog(null,"Resultado da conta: " + x);
        }
        
           System.exit(0);
            
            
        }
    }