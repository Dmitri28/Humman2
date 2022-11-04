/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package humman;

/**
 *
 * @author admin
 */
public class Humman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Man mn=new Man();
       mn.setName("Jim");
       mn.setAge(13);
       System.out.println(mn.getName()+" "+mn.getAge());
       mn.genius();
       Woman wm=new Woman();
       wm.setName("Liuba");
       wm.setAge(17);
       System.out.println(wm.getName()+" "+wm.getName());
       wm.genius();
    }
    
}
