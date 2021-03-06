package commands;

import headGame.Head;

/**
 * Sets the {@link headGame.Head} speed
 * @author eandr127
 */
public class CommandSpeed{
    
    /**
     * Sets the {@link headGame.Head} speed
     * @param cmdArgs the command arguments
     */
    public CommandSpeed(String[] cmdArgs){
        if(cmdArgs.length != 2){
            if (cmdArgs.length < 2){
                System.out.println("Not enough args");
                System.out.println("Usage: /speed [Speed]");
            }
            else {
                System.out.println("Too many args");
                System.out.println("Usage: /speed [Speed]");
            }
        }
        else {
            int Speed = Integer.parseInt(cmdArgs[1]);
            if(1000 < Speed){
            System.out.println("Speed must be less than 1000"); 
        }
            else {
                if(1 > Speed) {
                    System.out.println("Speed must be less than 1000"); 
                }       
            Head.speed = Speed ;
            System.out.println("Speed changed to " + Speed+" (" + Speed / 100 + ")");
            }
        }
    }    
}
