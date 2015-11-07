/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package My_package;

/**
 *
 * @author indrajit
 */
public class Person {
    public String firstname;
    public String lastname;
    public int age;
    
    
//    Person(String firstname, String lastname, int age){
//        this.firstname = firstname;
//        this.lastname = lastname;
//        this.age = age;
//    }
    
    public String getFirstName(){
        return firstname;
    }
    public void setFirstName(String fn){
        this.firstname = fn;
    }
    public String getLastName(){
        return lastname;
    }
    
}
