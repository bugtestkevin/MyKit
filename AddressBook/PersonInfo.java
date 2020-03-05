package javaapplication1;
import javax.swing.*;

public class PersonInfo {
    public String name; 
    public String phone;
    public String address;
    
    public PersonInfo(String n, String p, String a){
        name=n;
        phone=p;
        address=a;
    }
    public void print(){
        System.out.println("Print"+"Name:"+name+"\nPhone:"+phone+"\nAddress:"+address);
        JOptionPane.showMessageDialog(null, "Name:"+name+"\nPhone:"+phone+"\nAddress:"+address);
    }
}
