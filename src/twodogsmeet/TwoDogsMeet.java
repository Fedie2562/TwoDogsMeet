/*
 * Ferris D.
 * 10/10/2018
 */

package twodogsmeet;

import javax.swing.JOptionPane;

/**
 * @author fedie2562
 */
public class TwoDogsMeet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Two dogs will be created");
        Dog dog1 = new Dog(JOptionPane.showInputDialog("Please enter the name of dog1"),
            (JOptionPane.showInputDialog("Enter the breed of dog 1")));
        Dog dog2 = new Dog(JOptionPane.showInputDialog("Please enter the name of dog2"),
            (JOptionPane.showInputDialog("Enter the breed of dog 2")));
        System.out.println("The two dogs meet");
    }
    
}
