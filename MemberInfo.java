public class MemberInfo{
   //attributter
   private int age;
   private String firstName;
   private String lastName;
   private boolean active;
   private String ageGroup;
   private boolean competitor;
   
   //contructor
   public Memberinfo(int age, String name, boolean active, String ageGroup, boolean competitor){
      this.age = age;
      this.name = name;
      this.active = active;
      this.ageGroup = ageGroup;
      this.competitior = competitor;
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
      return boolean;
   }
   public boolean getSenior(){
      return boolean;
   }
   public boolean getCompetitor(){
      return boolean;
   }
   
   //setters
   public int setAge(int age){
      this.firstName = firstName;
   }
   public String setFirstName(String firstName){
      this.firstName = firstName;
   }
   public String setLastName(String lastName){
      this.lastName = lastName;
   }
   public boolean setActive(boolean active){
      this.active = active;
   }
    public String setAgeGroup(String ageGroup){
      this.ageGroup = ageGroup;
   }
   public boolean setCompetitor(boolean competitor){
      this.competitor = competitor;
   }


}
