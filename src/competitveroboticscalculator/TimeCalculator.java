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
public class TimeCalculator {
    int time = 120;
    ScoringOp[] list;
    
    public boolean calcTime(ScoringOp[] operations, int n, int time){
        if (time == 0)
            return true;
        if (n == 0 && time != 0)
            return false;
        if (operations[n - 1].time > time)
            return calcTime(operations, n - 1, time);
        
        return calcTime(operations, n-1, time) || calcTime(operations, n-1, time-operations[n-1].time);
    }
    
}
