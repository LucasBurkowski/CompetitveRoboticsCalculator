/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competitveroboticscalculator;

/**
 *
 * @author lucas_000
 */
public class ScoringOp {
    String name;
    int time;
    int pointVal;
    
    public ScoringOp(String name, int time, int pointVal){
        this.name = name;
        this.time = time;
        this.pointVal = pointVal;
    }
    
    public void setName(String name){
        this.name = name;
    }
        
    public void setTime(int time){
        this.time = time;
    }
    
    public void setPoint(int pointVal){
        this.pointVal = pointVal;
    }
    
}
