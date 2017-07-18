/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demohastable;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

/**
 *
 * @author Hieunngc01023
 */
public class HashTable {
    String name;
    String sdt;
  
    
    public Hashtable addNew(Hashtable temp){
        Scanner s= new Scanner(System.in);
        
        
        
            System.out.println("Moi ban nhap vao ten:");
                this.name= s.nextLine();
                System.out.println("moi ban nhap vao sdt");
                this.sdt= s.nextLine();
                temp.put(name, sdt);
                return temp;
                
    }
    public void find(Hashtable hash){
        Scanner s= new Scanner(System.in);
        System.out.println("moi ban nhap vao ten can tim:");
        String str= s.nextLine();
        if(hash.containsKey(str))
        {
            System.out.println(hash.get(str));
        }
        else System.out.println("ban nhap sai roi.");
        
        
    
    }
    public Hashtable remove(Hashtable temp)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("nhap vao ten can xoa:");
        String str=s.nextLine();
        temp.remove(str);
        return temp;
    }
    public void show(Hashtable temp)
    {
        
        Enumeration ContactsNames = temp.keys();
        while(ContactsNames.hasMoreElements())
            System.out.println(ContactsNames.nextElement());
        ContactsNames=temp.elements();
        while(ContactsNames.hasMoreElements())
            System.out.println(ContactsNames.nextElement());
        
        
    }
    public static void main(String[] args) {
        Hashtable hash = new Hashtable(500, (float) 0.80);
        HashTable obj= new HashTable();
        while(true){
            System.out.println("Moi nhap chuc nang");
            System.out.println("1.add new Hastable");
            System.out.println("2.find contact");
            System.out.println("3.delete contact");
            System.out.println("4.view");
            System.out.println("5.exit");
            Scanner s= new Scanner(System.in);
            int choose= s.nextInt();
            switch(choose)
            {
                case 1:{
                   obj.addNew(hash); 
                   break;
                }
                case 2:{
                    
                    obj.find(hash);
                    break;
                    
                }
                case 3:{
                
                    obj.remove(hash);
                    break;
                }
                
                case 4:{
                    obj.show(hash);
                    break;
                }
            }
           
        
        }
    }
}
