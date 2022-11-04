/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package humman;

/**
 *
 * @author admin
 */
public class Man extends Humman{
   
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void genius(){
       switch(2){
           case 1:
               System.out.println("Man is running");
               break;
           case 2:
            System.out.println("Man is runnuing");
            break;
           default:
               System.out.println("Sorry");
               
       }
    }
    
}
