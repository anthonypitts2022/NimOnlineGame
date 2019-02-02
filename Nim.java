//class to test Nim game

import java.util.Scanner;

public class Nim{
    public static void main(String[] args){
        
        System.out.println("Welcome to Nim.");
        
        Scanner a= new Scanner(System.in);
        System.out.println("What level would you like to play? (1 or 2).");
        int level = a.nextInt();
        Game newGame = new Game(level);
        newGame.play();
        
        System.out.println("Game Over.");
    }
}