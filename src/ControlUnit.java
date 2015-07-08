
public class ControlUnit {
	
	private CandidateCompositeEntity compositeEntity = new CandidateCompositeEntity();

	   public void printData(){
	   
	      for (int i = 0; i < compositeEntity.getVote().length; i++) {
	         System.out.println(i+1 +" Candidate's vote ==> " + compositeEntity.getVote()[i]);
	      }
	   }

	   public void setVote(int data1, int data2, int data3){
	      compositeEntity.setVote(data1, data2, data3);
	   }
	
	
}
