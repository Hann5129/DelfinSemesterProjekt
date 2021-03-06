import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class ManagerFunctions{

   // Attributter
   private String groups[] = {"Junior", "Senior"};
   private int fees[] = {500,1000,1600};
   private static ArrayList<Member> memberList = new ArrayList<Member>();
   private int clubFee;
   private String ageGroup;
   private Scanner scan = new Scanner(System.in);
 
   // memberList getter
   public static ArrayList<Member> getMemberList(){
	   return memberList;
   }
   
   // Her laeses eksisterende data fra filerne, som gemmes i en ArrayList (sÃ¥ data ikke gÃ¥r tabt)
   public void loadMembers()throws FileNotFoundException{
	   
	  Scanner scan1 = new Scanner(new File("competition.txt"));
      
      // sÃ¥ lÃ¦nge der er input til scan1 kÃ¸res while loopet   
      while (scan1.hasNext()) {
         String name = scan1.next();
         int age = scan1.nextInt();
         String ageGroup = scan1.next();  
         String activityStatus = scan1.next();
         String participationForm = scan1.next();
         int clubFee = scan1.nextInt();
         memberList.add(new Competitor(name, age, ageGroup, activityStatus, participationForm, clubFee));
      }
      Scanner scan2 = new Scanner(new File("exercise.txt"));
      
      // samme som overstÃ¥ende bare for scan2 obj.			   
      while (scan2.hasNext()) {
         String name = scan2.next();
         int age = scan2.nextInt();
         String ageGroup = scan2.next();
         String activityStatus = scan2.next();
         String participationForm = scan2.next();
         int clubFee = scan2.nextInt();
         memberList.add(new Exerciser(name, age, ageGroup, activityStatus, participationForm, clubFee));
      }
      scan1.close();
      scan2.close();
   }
 
   // TilfÃ¸jelse af nye medlemmer, som derefter udskrives   
   public void addMember(){ 
      try{ 
    	 
	 // input igennem scanneren for variable     
         System.out.print("Type in member's name: ");
         String name = scan.next();
         
         System.out.print("Type in member's age: ");
         int age = scan.nextInt();   
         
         System.out.print("Type in active/passive ");
         String activityStatus = scan.next();   
         
         System.out.print("Type in exercise/competitive: ");
         String participationForm = scan.next(); 
         
	 // sortering af medlemmer paa baggrund af aktivitetsforms, alder og deltagelseform.     
         if(activityStatus.equalsIgnoreCase("passive")){
             clubFee = fees[0];
             if(age <= 18){ 
            	 ageGroup = groups[0];
             }
             else{
            	 ageGroup = groups[1];
             }
          }
          else if (age < 18 && activityStatus.equalsIgnoreCase("active")){
        	 clubFee = fees[1];
        	 ageGroup = groups[0];
          }
          else if ((age >= 18 && age < 60) && activityStatus.equalsIgnoreCase("active")){
         	 clubFee = fees[2];
         	 ageGroup = groups[1];
          }
          else if (age >= 60 && activityStatus.equalsIgnoreCase("active")){
         	 clubFee = (fees[2]-400);
         	 ageGroup = groups[1];
          }
         
          if(participationForm.equalsIgnoreCase("exercise")){
         	 System.out.println();
         	 System.out.println("NEW MEMBER ADDED:");
        	 System.out.println("Name: "+name+"\n" + 
        			                "Age: "+age+"\n" + 
        			                "Activity Status: "+activityStatus+ "\n" + 
        			                "Participation Form: "+participationForm+ "\n" +
        			                "Age Group: "+ageGroup+ "\n" +
        			                "Club Fee: "+clubFee+" kr.");
		 // Instans af exerciser/motionist skabes og lagres i ArrayListen "memberList"
        	 memberList.add(new Exerciser(name, age, ageGroup, activityStatus, participationForm, clubFee));
              
         }else if(participationForm.equalsIgnoreCase("competitive")){
        	 System.out.println();
        	 System.out.println("NEW MEMBER ADDED:");
        	 System.out.println("Name: "+name+"\n" + 
        			                "Age: "+age+"\n" + 
        			                "Activity Status: "+activityStatus+ "\n" + 
        			                "Participation Form: "+participationForm+ "\n" +
        			                "Age Group: "+ageGroup+ "\n" +
        			                "Club Fee: "+clubFee+" kr.");
		 // Instans af competitior/kokurrencesvÃ¸mmer skabes og lagres i ArrayListen "memberList" 
        	 memberList.add(new Competitor(name, age, ageGroup, activityStatus, participationForm, clubFee));
         }
      // exception(fejl) fanges	      
      }catch(Exception e){
         System.out.println("User input invalid!");
      }
   }
   
   // Gemmer memberList i en fil
   public void saveMember()throws FileNotFoundException{
	   
      PrintStream write1 = new PrintStream("exercise.txt");
      PrintStream write2 = new PrintStream("competition.txt");
      
      // for each loop, der gÃ¥r igennem ArrayListen(memberList) og sortere objekterne alt efter type, hvorefter de skrives 
      for(Member i : memberList){
         if (i instanceof Exerciser){
            write1.println(i.getName()+" "+i.getAge()+" "+i.getAgeGroup()+" "+i.getActivityStatus()+" "+i.getParticipationForm()+" "+i.getClubFee());
         }
         else if (i instanceof Competitor){
            write2.println(i.getName()+" "+i.getAge()+" "+i.getAgeGroup()+" "+i.getActivityStatus()+" "+i.getParticipationForm()+" "+i.getClubFee());
         }
      }
      write1.close();
      write2.close();
   }
}

