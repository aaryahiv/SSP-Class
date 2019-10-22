import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Space here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Space extends World
{
   static public int attempts = 0;
   static public int score = 0; 
   static public int asteroidCount = 5;
        

    /**
     * Constructor for objects of class Space.
     * 
     */
    
    
    public Space()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
        //clearVar();

      
    }
    public void clearVar()
    {
        attempts = 0;
        score = 0; 
        asteroidCount = 5;
    }
    
    
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Rocket rocket = new Rocket();
        addObject(rocket,270,191);
        rocket.setLocation(88,196);
        Asteroid asteroid = new Asteroid();
        addObject(asteroid,573,80);
        asteroid.setLocation(572,167);
        Asteroid asteroid2 = new Asteroid();
        addObject(asteroid2,570,264);
        Asteroid asteroid3 = new Asteroid();
        addObject(asteroid3,574,355);
        Asteroid asteroid4 = new Asteroid();
        addObject(asteroid4,579,54);
        Asteroid asteroid5 = new Asteroid();
        addObject(asteroid5,582,116);
       
    }
}
