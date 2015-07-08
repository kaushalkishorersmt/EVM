
/*
 * public interface Shape {
		   void draw();
		}
 * */

public class Candidate {
	
	Candidate1 do1 = new Candidate1();
	Candidate2 do2 = new Candidate2();
	Candidate2 do3 = new Candidate2();

	   public void setVote(int count1, int count2,int count2){
	      do1.setVote(count1);
	      do2.setVote(count2);
	      do3.setVote(count3);
	   }

	   public int[] getData(){
	      return new int[] {do1.getVote(),do2.getVote()};
	   }
	
}
