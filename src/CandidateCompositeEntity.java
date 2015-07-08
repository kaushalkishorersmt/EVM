



public class CandidateCompositeEntity {

	private BallotUnit obj = new BallotUnit();
	
	public void setVote(int count1, int count2,int count3){
	      obj.setVote(count1,count2,count3);
	      
	   }

	   public int[] getVote(){
	      return obj.getVote();
	   }
	
	
}
