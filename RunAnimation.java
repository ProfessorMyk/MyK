/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runanimation;
import java.util.Scanner;

public class RunAnimation {

    public static void main(String[] args) {
        String choice;
        Bird b = new Bird();
        Cat c = new Cat();
        Dog d = new Dog();
        
        Scanner num = new Scanner(System.in);
        
        System.out.println("Choose an animal. Press B for bird, C for cat, D for dog: ");
        choice = num.nextLine();
        
        if (choice.equalsIgnoreCase("B")){
            b.eat();
            b.sleep();
            b.makeSound();
        }
        else if (choice.equalsIgnoreCase("C")){
            c.eat();
            c.sleep();
            c.makeSound();
        }
        else if (choice.equalsIgnoreCase("D")){
            d.eat();
            d.sleep();
            d.makeSound();
        }
        else {
            System.out.println("Invalid input! ");
        }
    }
    
}
