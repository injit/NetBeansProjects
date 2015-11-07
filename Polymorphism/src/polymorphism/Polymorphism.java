/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

import javax.swing.JOptionPane;

/**
 *
 * @author indrajit
 */
public class Polymorphism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Animal[] list = new Animal[3];
        list[0] = new Human();
        list[1] = new Dog();
        list[2] = new Horse();
        //list[2] = new Horse();
        //Horse horseList = new Horse();
        Dog AI = new Dog();
        AI.sleep();
        //AI.eat();
        //horseList.makenoise();
        //horseList.run();
        
        for(Animal a: list)
        {
            a.eat();   
            
        }
    
    }
    
}
