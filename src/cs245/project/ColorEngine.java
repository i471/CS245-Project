
package cs245.project;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class ColorEngine 
{
    Random random = new Random();
    String answer = "";
    
    public String returnAnswer()
    {
        return this.answer;
    }
    public void nextColor(Graphics g)
    {
        int r = random.nextInt(5);
        switch(r){
            case 0:
             g.setColor(Color.red);
             break;
            case 1:
             g.setColor(Color.yellow);
             break;
            case 2:
             g.setColor(Color.green);  
             break;
            case 3:
             g.setColor(Color.blue);  
             break;
            case 4:
             g.setColor(Color.magenta);  
             break;      
        }
    }
}

