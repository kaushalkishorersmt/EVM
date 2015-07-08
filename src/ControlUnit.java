
public class ControlUnit {
	
	public ControlUnit(){
		
		System.out.println("**********Welcome in EVM System *********");
		
	}
	
	private CandidateCompositeEntity compositeEntity = new CandidateCompositeEntity();

	   public void printResult(){
		   
		   
	   
	      for (int i = 0; i < compositeEntity.getVote().length; i++) {
	         System.out.println(i+1 +" Candidate's vote ==> " + compositeEntity.getVote()[i]);
	         //System.out.println("******************************************");
	      }
	      
	      System.out.println("****************************");
	   }

	   public void setVote(int data1, int data2, int data3){
	      compositeEntity.setVote(data1, data2, data3);
	   }
	   public void stopPolling(){
		   System.out.println("Polling stopped !");
	   }
	
	
}
