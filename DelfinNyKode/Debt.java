import java.util.ArrayList;

public class Debt{

   	// Visning af alle klubbens medlemmer som skylder kontingent.
	// Der udvælges KUN en tilfældig person på memberList, som udskrives.
	public void viewDebt(){
		
		// En ArrayList af typen Member kaldet memberList skabes, 
		// som skaber et nyt object af memberFunctions, hvorpå getteren for memberList kaldes.
		ArrayList<Member> memberList = new MemberFunctions().getMemberList();
		
	 	// en random værdi inden for intervallet af ArrayListens størrelse vælges.
		// Der type castes, fordi returtypen på Math.random metoden er double.
		int random = (int) (Math.random() * memberList.size());
   
	 	System.out.println();
	 	System.out.println("List of Members in debt:");
		// tilfældigt medlem vælges og sættes til ubetalt
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
	   // for each loop, der sætter resten af medlemmerne til at have betalt kontingent
	   for(Member i : memberList){
		   i.setFeePaid(true);         
      } 
   }
}


