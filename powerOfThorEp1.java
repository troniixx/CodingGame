import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTx = in.nextInt(); // Thor's starting X position
        int initialTy = in.nextInt(); // Thor's starting Y position

        // game loop
        while (true) {
            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");
            String direction = "";
            
          //check for the Y coordinates and add the according direction (N or S) {
            if (initialTy < lightY) 
            {
                initialTy++; //update Y position of thor
                direction = "S";
            } else if (initialTy > lightY) 
            {
                initialTy--; //update Y position of thor
                direction = "N";
            } 
    //}
          
          
          // check for the  X coordinates comparing where you are and where the light is, and add according direction (E or W) {
            if (initialTx < lightX) 
            {
                initialTx++; //update X position of thor
                direction += "E";
            } else if (initialTx > lightX) 
            {
                initialTx--; //update X position of thor
                direction += "W";
            }
          
          //}
            
            System.out.println(direction);
        }
    }
}
