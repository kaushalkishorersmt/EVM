
public class MainApplication {

	public static void main(String arr[]){
		
		ControlUnit controlUnit = new ControlUnit();
		System.out.println(" First voter gave vote ... ");
			controlUnit.setVote(1,0,0);
			controlUnit.printResult();
		  
			System.out.println(" After second and third voter has given the vote ... "); 	
			controlUnit.setVote(1,1,1);
			controlUnit.printResult();
			
			System.out.println(" All voters has given the votes now final status .." ); 
			controlUnit.setVote(3,1,1);
			controlUnit.printResult();
			
			controlUnit.stopPolling();
	      
	       
	       
	       
	}
}
