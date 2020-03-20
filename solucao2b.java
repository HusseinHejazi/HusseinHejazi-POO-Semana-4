import javax.swing.*;
    public class solucao2b{
        public static void main (String[] args){        
         int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero: "));
         int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero: "));
         int c = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero: "));
        
         if(a<b && a<c && b<c){   
         JOptionPane.showMessageDialog(null,"A ordem seria: " + a + ", " + b + ", " + c);
        
         }
         else if(a<b && a<c && b>c){
         JOptionPane.showMessageDialog(null,"A ordem seria: " + a + ", " +  c + ", " + b);
        
         }
        
         else if(b<a && b<c && a<c){
          JOptionPane.showMessageDialog(null,"A ordem seria: " + b + ", " + a + ", " + c);
         }
        
          else if(b<a && b<c && a>c){
            JOptionPane.showMessageDialog(null,"A ordem seria: " + b + ", " + c + ", " + a);
         }
        
            else if(c<a && c<b && b>a){
             JOptionPane.showMessageDialog(null,"A ordem seria: " + c + ", " + a + ", " + b);
          }
        
          else{
         JOptionPane.showMessageDialog(null,"A ordem seria: " + c + ", " + b + ", " + a);
         }
        
        
        
           System.exit(0);
            
            
        }
    }



