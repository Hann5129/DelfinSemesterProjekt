public class MemberInfo{
	   //attributter
	   private String firstName;
	   private String lastName;
	   private String active;
	   private String ageGroup;
	   private String competitor;
      private int subscriptionFeePrice;
	   
	   //contructor
	   public MemberInfo(String firstName, String lastName, String active, String ageGroup, String competitor, int subscriptionFeePrice){
	      this.firstName = firstName;
	      this.lastName = lastName;
	      this.active = active;
	      this.ageGroup = ageGroup;
	      this.competitor = competitor;
         this.subscriptionFeePrice = subscriptionFeePrice;
	   }
	   
	   //getters 
	   public String getFirstName(){
	      return this.firstName;
	   }
	   public String getLastName(){
	      return this.lastName;
	   }
	   public String getActive(){
	      return active;
	   }
	   public String getAgeGroup(){
	      return ageGroup;
	   }
	   public String getCompetitor(){
	      return competitor;
	   }
      public int getSubscriptionFeePrice(){
         return subscriptionFeePrice;
      }
	   
	   //setters
	   public String setFirstName(String firstName){
	      return this.firstName = firstName;
	   }
	   public String setLastName(String lastName){
	      return this.lastName = lastName;
	   }
	   public String setActive(String active){
	      return this.active = active;
	   }
	    public String setAgeGroup(String ageGroup){
	      return this.ageGroup = ageGroup;
	   }
	   public String setCompetitor(String competitor){
	      return this.competitor = competitor;
	   }
      public int setSubscriptionFeePrice(int subscriptionFeePrice){
         return this.subscriptionFeePrice = subscriptionFeePrice;
      }
	}