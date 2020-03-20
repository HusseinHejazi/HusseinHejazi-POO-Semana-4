import javax.swing.*;
    public class solucao2a{
        public static void main (String[] args){        
         int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero: "));
        
         if(a>0){
        
         JOptionPane.showMessageDialog(null,"Resultado da conta: " + Math.sqrt(a));
        
        
         }
         else{
            JOptionPane.showMessageDialog(null,"Resultado da conta: " + Math.pow(a,2));
        
         }
        
           System.exit(0);
            
            
        }
    }