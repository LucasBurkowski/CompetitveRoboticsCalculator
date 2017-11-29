package competitveroboticscalculator;


public class Operation {
	double time; 
	double pointVal;
	int count;
        int max;
        int minCount;
	String name;
	boolean repeat;
	
	public Operation(){	
	}
	
	public Operation(double time, double pointVal, String name, int max, int minCount){
		this.time = time;
		this.pointVal = pointVal;
		this.name = name;
                this.max = max;
                this.minCount = minCount;
                this.count = 0;
                
                this.time *= this.minCount;
	}
        
        public boolean getRepeat(){
            if (count == max)
                return true;
            else{
                return false;
            }
        }
        
        public double getTime(){
            return this.time;
        }
        
        public boolean equals(Operation op){
            if (this.name.equals(op.name)){
                return true;
            }else{
                return false;
            }
        }
}
