public class MemberInfo{
	   //attributter
	   private int age;
	   private String firstName;
	   private String lastName;
	   private boolean active;
	   private String ageGroup;
	   private boolean competitor;
	   
	   //contructor
	   public void Memberinfo(int age, String firstName, String lastName, boolean active, String ageGroup, boolean competitor){
	      this.age = age;
	      this.firstName = firstName;
	      this.lastName = lastName;
	      this.active = active;
	      this.ageGroup = ageGroup;
	      this.competitor = competitor;
	   }
	   
	   //getters 
	   public String getFirstName(){
	      return this.firstName;
	   }
	   public String getLastName(){
	      return this.lastName;
	   }
	   public int getAge(){
	      return this.age;
	   }
	   public boolean getActive(){
	      return active;
	   }
	   public String getAgeGroup(){
	      return ageGroup;
	   }
	   public boolean getCompetitor(){
	      return competitor;
	   }
	   
	   //setters
	   public int setAge(int age){
	      return this.age = age;
	   }
	   public String setFirstName(String firstName){
	      return this.firstName = firstName;
	   }
	   public String setLastName(String lastName){
	      return this.lastName = lastName;
	   }
	   public boolean setActive(boolean active){
	      return this.active = active;
	   }
	    public String setAgeGroup(String ageGroup){
	      return this.ageGroup = ageGroup;
	   }
	   public boolean setCompetitor(boolean competitor){
	      return this.competitor = competitor;
	   }


	}
