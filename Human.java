
////Anthony Pitts 
//skeleton outline for class by @AdamCannon

import java.util.Scanner;

public class Human{
   
    private int choice;
    private Scanner input;
    private int marbles;
    
 
    public Human(){
        input=new Scanner(System.in);
        int choice = -1;
      
    }
    
    public void move(){
        
        System.out.println("How many marbles would you like to take?");
        choice = input.nextInt();
   
    }
    
    
    public int getChoice(){
        return choice;
    }
    
    
}
