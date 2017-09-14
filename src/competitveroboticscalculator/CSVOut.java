package competitveroboticscalculator;


import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class CSVOut {
    public void printCSV(ArrayList<ArrayList<Operation>> output, ArrayList<Operation> list) throws FileNotFoundException{
		
		PrintWriter writer = new PrintWriter("RoboCalc.csv");
		StringBuilder sb = new StringBuilder();
                
		
		sb.append("Strategy:");
                sb.append(',');
                for(int j = 0; j < list.size(); j++){
                    sb.append(list.get(j).name + " Count:");
                    sb.append(',');
                }
                sb.append("Sum: ");
                sb.append('\n');
                
		for(int i = 0; i < output.size(); i++){
			int sum = 0;
                        sb.append(i+1);
                        sb.append(',');
                        for(int k = 0; k < list.size(); k++){
                            int[] opCount = new int[list.size()]; 
                            for(int j = 0; j < output.get(i).size(); j++){
                                
                                if (list.get(k).equals(output.get(i).get(j))){
                                    opCount[k] += 1;
                                    sum += output.get(i).get(j).pointVal;
                                }
                            }
                            sb.append(opCount[k]);
                            sb.append(',');
			}
			sb.append(sum);
			sb.append('\n');
		}
		
		writer.write(sb.toString());
		writer.close();
	}
}
