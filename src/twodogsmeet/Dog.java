/*
 * 
 */

package twodogsmeet;

import javax.swing.JOptionPane;

/**
 * @author fedie2562
 */
public class Dog {
    String name, breed;
    int aggression, hunger;
    public Dog(String name,String breed){
        this.name = name;
        this.breed = breed;
        aggression = random(0,10);
        hunger = random(0,10);
        System.out.println(this.toString());
        if(JOptionPane.showInputDialog("Are you ok with these hunger / aggression values\n yes/no").equalsIgnoreCase("yes")){
        }else{
            aggression = Integer.parseInt(JOptionPane.showInputDialog("Please enter the new value for aggression \n0-10"));
            hunger = Integer.parseInt(JOptionPane.showInputDialog("Please enter the new value for hunger \n0-10"));
            System.out.println(this.toString());
        }
    }
    public String toString(){
        return "|----|\nName: "+name+"\nBreed: "+breed+"\nAggression: "+aggression+"\nHunger: "+hunger;
    }
    public int random(int min, int max){
        int randomNum;
        randomNum = (int)(Math.random() * max + min);
        return randomNum;
    }
    public Dog(int agr,int hung){
        
    }
    public void meet(Dog otherDog){
        // Aggression check
        if(this.aggression>otherDog.aggression){
            System.out.println(this.name+" is barking at "+otherDog.name);
        }else if(this.aggression<otherDog.aggression){
            System.out.println(this.name+" is being barked at by "+otherDog.name);
        }else{
            System.out.println(this.name+" and "+otherDog.name+" are not barking at all");
        }
        // Hunger check
        System.out.println("The owner drops some treats for the two dogs");
        if(this.hunger>otherDog.hunger&&this.hunger>3){
            System.out.println(this.name+" rushes to eat all of the treats before "+otherDog.name+" reacts");
        }else if(this.hunger<otherDog.hunger&&otherDog.hunger>3){
            System.out.println(otherDog.name+" rushes to eat all of the treats before "+this.name+" could react");
        }else{
            System.out.println(this.name+" and "+otherDog.name+" enjoy the treats together");
        }
    }
}
