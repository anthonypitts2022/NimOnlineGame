
//Anthony Pitts 
//Template for class by @AdamCannon


import java.util.concurrent.ThreadLocalRandom;
public class Computer{
    
    private int mode;
    private int choice;
    private int level;
    
  
    public Computer(int level){
        level = level;
        int choice = -1;
    }
    public void move(int marbles, int level){
    
        if(level==1){//easy level 
            choice = ThreadLocalRandom.current().nextInt(1,((marbles/2)+1));
            
        }
        if(level==2){//hard level
            if(marbles<=100 && marbles>63){
                choice = marbles - 63;
          
            }
            else if(marbles<63 && marbles>31){
                choice = marbles - 31;
             
            }
            else if(marbles<31 && marbles>15){
                choice = marbles - 15;
               
            }
            else if(marbles<15 && marbles>7){
                choice = marbles - 7;
              
            }
            else if(marbles<7 && marbles>3){
                choice = marbles - 3;
                
            }
            else{
                choice = ThreadLocalRandom.current().nextInt(1,((marbles/2)+1));
            }
        }
        
    }  
     public int getChoice(){
         return choice;
     }
}
