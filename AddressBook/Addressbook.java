package javaapplication1;
import javax.swing.*;
import java.util.*;
import java.io.*;

public class Addressbook {
    ArrayList person = null;
    String token[];
    String n,p,a;
    
    public Addressbook(){
        person=new ArrayList();
        LoadPerson();
    }
    public void LoadPerson(){
        try{
            FileReader fr = new FileReader("C:\\Users\\KUNAL\\Desktop\\VIT MCA\\MCA SEM4.MSE\\sample.txt");
            BufferedReader br = new BufferedReader(fr);
            String s = br.readLine();
            while(s!=null){
                token=s.split(",");
                n=token[0];
                p=token[1];
                a=token[2];
                PersonInfo pr= new PersonInfo(n,p,a);
                person.add(pr);
                s=br.readLine();
            }
            br.close();
            fr.close();
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null,"Unable to read file");
        }
    }
    public void addPerson(){
        String n=JOptionPane.showInputDialog("Enter name:");
        String p=JOptionPane.showInputDialog("Enter Phone number:");
        String a=JOptionPane.showInputDialog("Enter address:");
        PersonInfo pr1=new PersonInfo(n,p,a);
        person.add(pr1);
        JOptionPane.showMessageDialog(null,"Person added successfully");
    }
    public void searchPerson(String n){
        for(int i=0;i<person.size();i++){
        PersonInfo p = (PersonInfo)person.get(i);
        if(n.equals(p.name))
            p.print();
        }
    }
    public void removePerson(String n){
        for(int i=0;i<person.size();i++){
            PersonInfo p=(PersonInfo)person.get(i);
            if(n.equals(p.name)){
                person.remove(i);
                JOptionPane.showMessageDialog(null,"Person removed successfully");
            }
        }
    }
    public void savePerson(){
        try{
            FileWriter fw=new FileWriter("C:\\Users\\KUNAL\\Desktop\\VIT MCA\\MCA SEM4.MSE\\sample.txt");
            PrintWriter pw=new PrintWriter(fw);
            for(int i=0;i<person.size();i++){
                PersonInfo p=(PersonInfo)person.get(i);
                String s=p.name+","+p.phone+","+p.address;
                pw.println(s);
            }
            pw.flush();
            pw.close();
            fw.close();
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null,"Unable to save");
        }
    }
}
