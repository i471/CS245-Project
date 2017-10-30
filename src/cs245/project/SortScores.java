/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs245.project;

import java.util.Comparator;

/**
 *
 * @author Josh
 * @param <Score>
 */
public class SortScores implements Comparator<Score> 
{

    @Override
    public int compare(Score o1, Score o2) 
    {
        return((Integer.valueOf(o2.getScore())) - (Integer.valueOf(o1.getScore())));
    }

}
