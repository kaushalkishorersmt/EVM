
public class Client {
   private CandidateCompositeEntity compositeEntity = new CandidateCompositeEntity();

   public void printData(){
   
      for (int i = 0; i < compositeEntity.getVote().length; i++) {
         System.out.println("Vote: " + compositeEntity.getVote()[i]);
      }
   }

   public void setVote(int data1, int data2, int data3){
      compositeEntity.setVote(data1, data2, data3);
   }
}
