import javax.swing.*;
    public class solucao1b{
        public static void main (String[] args){        
         int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero: "));
         int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero: "));
        
         int x = a + b;
        
        if(x <= 20){
        JOptionPane.showMessageDialog(null,"Resultado da conta: " + (x - 5));
        }
        
           System.exit(0);
            
            
        }
    }