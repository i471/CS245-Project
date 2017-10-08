/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hello.swing;
import java.util.Random;
/**
 *
 * @author User
 */
public class RandomNameGenerator {
    
    private Random random = new Random();
    
    String names[] = {"abstract", "cemetery",
    "nurse", "pharmacy", "climbing"};
    
    
    public String getName(){
        return names[random.nextInt(names.length)];
        
    }
  
}

