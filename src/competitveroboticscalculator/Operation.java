package competitveroboticscalculator;


public class Operation {
	int time; 
	int pointVal;
	int count;
        int max;
	String name;
	boolean repeat;
	
	public Operation(){	
	}
	
	public Operation(int time, int pointVal, String name, int max){
		this.time = time;
		this.pointVal = pointVal;
		this.name = name;
                this.max = max;
                this.count = 0;
	}
        
        public boolean getRepeat(){
            if (count == max)
                return true;
            else{
                return false;
            }
        }
        
        public int getTime(){
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
