import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(4);
        Actor asteroidObj = getOneObjectAtOffset(0,0, Asteroid.class);
        if(asteroidObj != null) {
            Space myWorld = new Space();
            getWorld().removeObject(asteroidObj);
            myWorld.asteroidCount -= 1;
            myWorld.score += 5;
        }
    }    
}
