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
                                                                          
                                              
                             ***     ZIPCODE/BARCODE CONVERTER:    ***
                                     
This project is effectuated through the main method found in the ZipTest class. 
The Zipcode class has three instance variables, as zip, bar, and the zipArray. The zipArray is an Array which, in order
     from 0,9 has the barcode colons and lines which correlate to each number,0-9, that is a zipcode digit. This allows
     for quick access to the conversion between zipcode digits and the five correlated barcode symbols in both the
     method which converts zipcodes to barcodes and the method which converts barcodes to zipcodes.
               
public Zipcode(String bar) is the method which takes an inputted String barcode, bar, and ultimately converts it to 
     a 5 digit zipcode, zip. How this code goes about that is by taking each 5 symbols of the barcode and putting each
     into seperate elements in the barArray[]. The following while loop compares each element of the barArray to each
     element in the zipArray, and whichever element is equal, is placed in another array, called barCodeNumbers. 
     Ultimately, this loop will populate the barCodeNumbers array with 5 elements, 1 integer per element, which correlate,
     in correct sequential order, to the zipcode which correlates with the inputted barcode. 
     IMPORTANT: the last five characters in the bar variable were never put into the barArray because they are only used
     as a check number for the barcode, but not part of the 5-digit zipcode. Then a for loop is used to convert the 
     barCodeNumbers array into a random String variable z. This String variable is then stored in the zip variable.
     
public Zipcode(int zip) is the method which takes an inputted int zipcode, zip, and ultimately converts it to 
     a 30 char barcode, bar. How this code goes about that is by instantiating variables that will be used later. Then
     the inputted variable zip is converted to a String, zipAsString. Then, an integer array, called zip1, is created.
     Then a String array, called barArray, is created. The first for loop's purpose is to take each character in 
     zipAsString and parse it into an integer value and store each integer value into the zip1 array. The following for
     loop takes the zipcode digit in each zip1 array element and set it equal to a random variable a. Then, each
     iteration of the loop takes the String value of zipArray[a] and stores it in the first 5 elements of barArray. The
     variable j and the next 2 if statements are all used to insure the accuracy of the check digit section of the barcode
     I used modulo 10 and the sum of the zipcode if everything worked simply in the second if statement. However, since
     10-(10%10) = 10 , yet the check digit should be 0 and not 10, since that would mean the sum of the zipcode digits
     is already a multiple of ten, the first if statement corrected this. I stored the correct check digit as 
     checkDigitAsInt, which then gets converted to its equilivant value in terms of barcode symbols, by way of the
     zipArray. The variable z and the final for loop are used to take the elements from the barArray and convert them into
     the String variable, bar.
     
This Zipcode class ends with two getter methods. The getBarcode method returns the bar variable value. The getZIPcode 
    method returns the value of the zip variable. Both of these are printed out in the main method found in
    the ZipTest class.
              
                                     
                                     
                                     
                                     
                                     
                                     
                                     