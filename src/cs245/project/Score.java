/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs245.project;

/**
 *
 * @author Josh
 */
public class Score 
{
    String initials;
    String score;

    public Score(String setInit, String setScore)
    {
        initials = setInit;
        score = setScore;
    }
    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
    
}
