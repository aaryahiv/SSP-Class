import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends Actor
{
    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int x = getX();
        int y = getY();
        Space myWorld = new Space();
        getWorld().showText("Your Attempts: "+myWorld.attempts, 200,300);
        getWorld().showText("Your Score: "+myWorld.score, 200,350);
        
        if(Greenfoot.isKeyDown("right")){
            move(4);
        }
        if(Greenfoot.isKeyDown("left")){
            move(-4);
        }
        if(Greenfoot.isKeyDown("down")){
            setLocation(x, y+4);
        }
        if(Greenfoot.isKeyDown("up")){
            setLocation(x, y-4);
        }
        
        String pressedKey = Greenfoot.getKey();
        
        if("space".equals(pressedKey)){
            myWorld.attempts += 1;
            myWorld.score -= 1;
            getWorld().addObject(new Bullet(), getX(), getY());
        }
        
        Actor asteroidObj = getOneObjectAtOffset(0,0, Asteroid.class);
        if(asteroidObj != null) {
            getWorld().showText("You Lose !!! GAME OVER!!!", 200, 100);
            myWorld.clearVar();
            Greenfoot.stop();
        }
        
        if (myWorld.asteroidCount == 0) {
            getWorld().showText("You WIN !!! GAME OVER!!!", 200, 100);
            myWorld.clearVar();
            Greenfoot.stop();
        }

        
    }    
}
