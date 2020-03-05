package javaapplication1;
import java.io.*;
import javax.swing.*;
import java.util.*;

public class Test {
    public static void main(String args[]){
        Addressbook add = new Addressbook();
        int ch;
        while(true){
            String s = JOptionPane.showInputDialog("MENU \n1.Add \n2.Search \n3.Remove \n4.Exit");
            ch = Integer.parseInt(s);
            switch(ch){
                case 1: add.addPerson();
                break;
                
                case 2: String n1 = JOptionPane.showInputDialog("Enter name to search:");
                add.searchPerson(n1);
                break;
                
                case 3: String n2 = JOptionPane.showInputDialog("Enter name to remove:");
                add.removePerson(n2);
                break;
                
                case 4: add.savePerson();
                System.exit(0);
                break;
                
                default: JOptionPane.showMessageDialog(null,"Invalid choice");
            }
        }
    }
}
