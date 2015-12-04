import java.util.*;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.StringTokenizer;


public class MarieTwo {

	public static void main(String[] args) {
		
		//Declare HashMap to map instructions to memory locations
		Map <Integer,String> RAM = new HashMap <Integer,String>();
		Iterator <Entry<Integer,String>> iterator = RAM.entrySet().iterator(); 
		int ACC=0;			//Declare accumulator variable
		
		System.out.println("Reading File from Java code");

		// Name of the file
		String fileName = "example1.txt";

		try {
			// Create object of FileReader
			FileReader inputFile = new FileReader(fileName);
			
			//Read 
			Scanner scanFile = new Scanner (inputFile);
				while (scanFile.hasNext()){
					Integer memLocation = scanFile.nextInt();
					String instructLine = scanFile.nextLine();
					RAM.put(memLocation, instructLine);
					
				}
					System.out.println(RAM.get(106));
				for(Map.Entry<Integer,String> entry : RAM.entrySet()){
					StringTokenizer st = new StringTokenizer(entry.getValue());
					while (st.hasMoreTokens()){
						System.out.println(st.nextToken());
					}
					//String[] blah = (entry.getValue()).split(" ");
					//System.out.println(blah[1]);
					//if (blah[1]== "load")
						//ACC = RAM.get(((Integer.parseInt(blah[2]))));
						
						/*if (blah[2]==NULL) (//go to next instruction)*/
				}
				System.out.println(ACC);
				/*if (iterator.hasNext()){
					Entry<Integer,String> first = iterator.next();
					System.out.println(first);
				}*/
				} 
		catch (Exception e) 
		{
		System.out.println("Error while reading file line by line:" + e.getMessage());
		}
	
	System.exit(0);
	}

}
