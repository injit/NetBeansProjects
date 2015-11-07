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
public class Employee extends Person {

    private String userName;
    private String ID;
    private String passWord;

    public Employee() {
        super();
        this.ID = "";
        this.passWord = "";
        this.userName = "";
    }

    Employee(String name, String address, String family, String ID, String userName, String passWord)
    {
        super(name, address, family);
        this.ID = ID;
        this.userName = userName;
        this.passWord = passWord;
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

}
