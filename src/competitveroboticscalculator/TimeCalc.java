package competitveroboticscalculator;


import java.util.*;

public class TimeCalc {
    public void calcTime(ArrayList<Operation> operations, int n, int time, ArrayList<Operation> current, ArrayList<ArrayList<Operation>> out){
        if (timeLeft(operations, time) == false || time == 0){
            ArrayList<Operation> temp = new ArrayList<Operation>(current);
            out.add(temp);
            for(int i = 0; i < operations.size(); i++){
                operations.get(i).count = 0;
            }
            return;
        }
        for(int i = n; i < operations.size(); i++){
        	if(time < operations.get(i).time){
                    return;
        	}
        	if (operations.get(i).count == operations.get(i).max)
    		{
                    return;
    		}else{
    		operations.get(i).count += 1;
            	current.add(operations.get(i));
            	calcTime(operations, i, time - operations.get(i).time, current, out);
            	current.remove(current.size()-1);
    		}
        }
    }
    
    boolean timeLeft(ArrayList<Operation> operations, int time){
        boolean[] ops = new boolean[operations.size()];
        for(int i = 0; i < operations.size(); i++){
            if(time > operations.get(i).time){
                return true;
            }
        }
        return false;
    }
    
    public void sortOps(ArrayList<Operation> ops){
        Collections.sort(ops, new Comparator<Operation>(){
            @Override
            public int compare(Operation o1, Operation o2){
                return Integer.compare(o2.getTime(), o1.getTime());
            }
        });
    }
}
