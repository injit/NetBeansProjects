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
public class Horse extends Animal{
    public void run()
    {
        System.out.println("Horse is running.");
    }
    public void makenoise()
    {
        System.out.println("man shouts");
    }
    public void eat(){
        System.out.println("Horse is eating.");
    }
}
