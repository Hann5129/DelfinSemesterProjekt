package semesterprojekt;

import java.util.ArrayList;

public class Debt{

   // Visning af alle klubbens medlemmer som skylder kontingent
	public void viewDebt(){
		
		ArrayList<Member> memberList = new MemberFunctions().getMemberList();
		
	 	int random1 = (int) (Math.random() * memberList.size());
	 	int random2 = (int) (Math.random() * memberList.size());
   
	 	System.out.println();
	 	System.out.println("List of Members in debt:");
	 	memberList.get(random1).setFeePaid(false);
	 	memberList.get(random2).setFeePaid(false);
   
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


