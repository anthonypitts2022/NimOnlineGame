////Anthony Pitts 
//template for class by @AdamCannon

import java.util.concurrent.ThreadLocalRandom;
public class Game{
    
    private int marbles = ThreadLocalRandom.current().nextInt(10,101);        
    private Human humanPlayer;
    private Computer computerPlayer;
    private int level;
    private int choice;
    
    public int getMarbles(){
        return marbles;
    }
    
     public Game(int difficulty){
        level = difficulty;
        computerPlayer = new Computer(level);
        humanPlayer = new Human ();
     }
 
    
   
     
    public void play(){
        
        while(marbles>1){
            System.out.println("There are " + getMarbles() + "left");
            humanPlayer.move();
            choice = humanPlayer.getChoice();
            if(choice<1 || choice>(getMarbles()/2)){
            System.out.println("That's an invalid choice pick again");
            humanPlayer.move();
            }
            if(choice>=1 && choice<=(marbles/2)){
                 marbles = marbles - choice;  
            }
            if(marbles>1){   
                computerPlayer.move(marbles, level);
                choice = computerPlayer.getChoice();
                marbles = marbles - choice;
                if(marbles<=1){
                    System.out.println("You Lose!");
                }
            }
            else{
                System.out.println("You Win!");
            }
        }
     
        }

}
    