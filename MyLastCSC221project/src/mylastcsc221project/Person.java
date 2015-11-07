/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mylastcsc221project;

/**
 *
 * @author indrajit
 */
public class Person implements Address {

    private String name;
    private String address;
    private String family;

    Person(String name, String address, String family){
        this.name = name;
        this.address = address;
        this.family = family;
    }
    public Person() {
        name = "";
        address = "";
        family = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    @Override
    public String hasAddress() {
        return this.getAddress();
    }

}
