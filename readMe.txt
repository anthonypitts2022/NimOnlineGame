Name: Anthony Pitts

Programming Project 3 readMe:


                                     ***      NIM GAME:     ***

The Nim game was broken up into three classes: Game, Computer, and Human

              Game.java
             
This class first declared the instance variables, such as int marbles.
The getMarbles method returns the variable marbles which is the number of marbles left in the pile.
The class then instantiated humanPlayer and computerPlayer objects of class Human and class Computer, respectively, in 
      the Game constructer.
The play method follows an obvious procedure of calling on the objects to perform their respective move methods,
      which I will explain in detail below. Before the humanPlayer.move() method is enacted, the code prints out
      the number of marbles left. The play method then takes the choice, or number of marbles the computerPlayer
      or humanPlayer wants to take that round, and then after checking if it is a legal choice, that choice, gathered
      by the getChoice method is subtracted from previous amount of marbles.
      Whichever player attempts to begin their move method with 1 marble left, loses and the other player wins.

              
              Computer.java
The Computer class begins by declaring instance variables and then has a Computer constructor method, of which objects
     are instantiated from. The move method for a computer breaks into two paths. If it is level one, or the easy level, 
     the computer randomly generates a legal choice and that is stored in the variable choice. If it is level two, or the
     hard level, the computer goes through if statements to see which region between the numbers which allow the computer
     to always win (3,7,15,31,63) it is in. If in one of these regions, it chooses to take as many marbles to make the
     marble pile equal the closet of the special numbers(3,7,15,31,63), that is less than the size of the pile. If the 
     number of marbles at the start of the computer's move method is equal to 3,7,15,31, or 63 it will revert back to 
     the manner by which it randomly generated a legal number, at level 1. The computer's choice is stored in the 
     variable choice and it is used in the computerPlayer.getChoice method in the Game.java class.
              
              Human.java
The Human class begins by declaring instance variables and then has a Human constructor method, of which objects are 
    instantiated from. The move method for a human follow a much simpler structure than the computer. The human is 
    simply prompted asking how many marbles to take and the human inputs a choice. This is stored in the variable 
    choice and it is used in the humanPlayer.getChoice method in the Game.java class. 
                                                                          
                                       
