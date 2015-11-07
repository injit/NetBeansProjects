/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integerdialog;
import java.util.Scanner;
/**
 *
 * @author indrajit
 */
public class IntegerDialog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        String inputNum = JOptionPane.showInputDialog(null, "Enter a first number");
//        int intNum1 = Integer.parseInt(inputNum);
//        String inputNum2 = JOptionPane.showInputDialog(null, "Enter a second number");
//        int intNum2 = Integer.parseInt(inputNum2);
//        
//        //if(isDigit(intNum)){
//        JOptionPane.showMessageDialog(null, "the multipication of "+intNum1+" & "+intNum2+ " is: "+intNum2*intNum1);
        //}
        
        int grade = 0;
        int counter = 0;
        int total = 0;
        
        while(true){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the grade");
            grade = input.nextInt();
            if(grade>=0)
            {
                counter++;
                total += grade; 
            }
            else
                break;
            
        }
        System.out.println("average is: "+ total/counter);
    }
    
}
