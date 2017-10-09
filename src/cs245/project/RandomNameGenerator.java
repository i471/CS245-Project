/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs245.project;
import java.util.Random;
/**
 *
 * @author User
 */
public class RandomNameGenerator {
    
    private Random random = new Random();
    
    String names[] = {"abstract", "cemetery",
    "nurse", "pharmacy", "climbing"};
    
    String answer;
    
    public RandomNameGenerator()
    {
        this.setRandomName();
    }
    
    public String getName(){
        return answer;
    }
  
    public int getLength(){
        return answer.length();
    }

    private void setRandomName() {
        answer = names[random.nextInt(names.length)];
    }
}