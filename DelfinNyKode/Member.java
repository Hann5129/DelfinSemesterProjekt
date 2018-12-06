package semesterprojekt;

public class Member{

   // Attributter
   private String name;
   private int age;
   private String ageGroup;
   private String activityStatus;
   private String participationForm;
   private int clubFee;
   private boolean feePaid = true;

   // Constructor
   public Member(String name,int age, String ageGroup, String activityStatus, String participationForm, int clubFee){
      this.name = name;
      this.age = age;
      this.ageGroup = ageGroup;
      this.activityStatus = activityStatus;
      this.participationForm = participationForm;
      this.clubFee = clubFee;
        
   }
   public Member(String name){
      this.name = name;
   }

   // Getters
   public String getName(){
	  return this.name;
	  }
   public int getAge(){
      return this.age;
      }
   public String getAgeGroup(){
      return this.ageGroup;
      }
   public String getActivityStatus(){
      return this.activityStatus;
      }
   public String getParticipationForm(){
      return this.participationForm;
      }
   public int getClubFee(){
      return this.clubFee;
      }
   public boolean getFeePaid(){
	  return this.feePaid;
	  }
   
   // Setter
   public void setFeePaid(boolean feePaid){
      this.feePaid = feePaid;
      }
  
}