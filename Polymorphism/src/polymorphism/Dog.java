/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author indrajit
 */
public class Dog extends Animal{
//    public void run()
//    {
//        System.out.println("Dog is running");
//    }
    public void eat()
    {
        System.out.println("Dog is eating.");
    }
    public boolean sleep()
    {
        System.out.println("Dog is sleeping.");
        return true;
    }
}
