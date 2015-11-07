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
public class Animal extends AnimalAbstract implements AnimalInterface{
    public void run()
    {
        System.out.println("animal is running. ");
    }

    @Override
    public void makenoise() {
        System.out.println("Various Sounds");
    }

    @Override
    public void eat() {
        System.out.println("eats by chewing");
    }
    
}
