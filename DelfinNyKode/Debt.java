import java.util.ArrayList;

public class Debt{

   // Visning af alle klubbens medlemmer som skylder kontingent
	public void viewDebt(){
		
		// En ArrayList af typen Member kaldet memberList skabes, 
		// som skaber et nyt object af memberFunctions, hvorpå getteren for memberList kaldes.
		ArrayList<Member> memberList = new MemberFunctions().getMemberList();
		
	 	int random = (int) (Math.random() * memberList.size());
   
	 	System.out.println();
	 	System.out.println("List of Members in debt:");
	 	memberList.get(random).setFeePaid(false);
   
	 	// for each loop som udskriver liste af medlemmer i restance
	 	for(Member i : memberList){
		   if (i.getFeePaid() == false){
			   System.out.println("-----------------------------");
			   System.out.println("Name: "+i.getName()+"\n"+
            					  "Age: "+i.getAge()+"\n"+
            					  "Age Group: "+i.getAgeGroup()+"\n"+
            					  "Activity Status: "+i.getActivityStatus()+"\n"+
            					  "ParticipationForm: "+i.getParticipationForm()+"\n"+
            					  "Debt: "+i.getClubFee()+" kr.");
         }
      } 
	   for(Member i : memberList){
		   i.setFeePaid(true);         
      } 
   }
}


