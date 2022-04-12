
//learn about packages
import java.util.*;
import javax.swing.*;
//only use import above the class
public class App {
    // vscode is an editor
    public static void main(String[] args) throws Exception {
        // Objective - have the user enter a number between 1 and 10 and if they are
        // correct to the random mumber than they win
    
        
        int min = 1;
        int max = 10;
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);

        // learn about java.util.Scanner for user input
        Scanner User = new Scanner(System.in);
        
        //set to a variable number
        int Vari = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number between 1 and 10 >> ", "number", JOptionPane.QUESTION_MESSAGE));


        // learn if statements
        if(Vari == random_int){
         
         JOptionPane.showMessageDialog(null, "Helooo You wan. Robot picked: " + random_int, "Woo", JOptionPane.INFORMATION_MESSAGE);
        }else{
            
            JOptionPane.showMessageDialog(null, "Helooo nyou suck. Robot picked: " + random_int, "Woo", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "you are bad at guessing go away noob: " + random_int, "woo", JOptionPane.INFORMATION_MESSAGE);
        }

    }
    }


