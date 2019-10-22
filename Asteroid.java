import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Asteroid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Asteroid extends Actor
{
    /**
     * Act - do whatever the Asteroid wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
  
        move(-4);
        
        if(getX() < 10) {
            //System.out.println("Removing Asteroid Object");
            this.setLocation(550,Greenfoot.getRandomNumber(395));
            //Space myWorld = new Space();
            //System.out.println("Moved Asteroid Object");
        }
       
        
    }    
}
