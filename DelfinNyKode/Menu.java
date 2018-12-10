import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu{
	
	// Objekter skabes
	MemberFunctions member = new MemberFunctions();
	Debt debt = new Debt();
   
	// Attributter
	private Scanner scan = new Scanner(System.in);
	private boolean stop = false;
	private String password = "";
	private String choice = "";
   
	// Sign in menu
	public void signIn()throws FileNotFoundException{
      
		// menu navigation
		while(stop != true){
			
			 System.out.println("");
			 System.out.println("Welcome to Swim Club Dolphin's Computer System!");
	         
	         System.out.print("Sign in: ");
	         password = scan.next();
	         
             if(password.equals("manager")){
	        	 manager();     
	         }else if(password.equals("cashier")){
	        	 cashier();
	         }else {
	        	 System.out.println("Incorrect Password!");
	             	 System.out.println("Try again");
	                 signIn();
	         }
		}
		// eksisterende medlemmer loades
		member.loadMembers();
	}

   // Manager menu
   public void manager()throws FileNotFoundException{
	   
      System.out.println("Now logged in as 'Manager'");
      System.out.println("1 - Add new Member");
      System.out.println("2 - Quit Manager menu");
      
      try{
         System.out.print("Choice: ");
         choice = scan.next();
      
         if(choice.equals("1")){
            member.addMember();
            member.saveMember();
         }
         else if(choice.equals("2")){
            System.out.println("Manager signing off");
            stop = false;
         }else{
            System.out.println("Invalid input!");
            manager(); //recursive
         }
         
      }catch(InputMismatchException i){
         System.out.println("Invalid input!");
         System.out.println("");  
      }   
   }

   // Cashier menu
   public void cashier()throws FileNotFoundException{
	   
      System.out.println("Now logged in as 'Cashier'");
      System.out.println("1 - View Member debt");
      System.out.println("2 - Quit Cashier menu");
     
      try{   
         System.out.print("Choice: ");
         choice = scan.next();
         
         if(choice.equals("1")){
            debt.viewDebt();
            System.out.println("");
            cashier();    
         }
         else if(choice.equals("2")){
            System.out.println("Cashier signing off");
            stop = false;
         }else{
            System.out.println("Invalid input!");
            cashier();
         }
            
      }catch(InputMismatchException i){
         System.out.println("Invalid input!");   
      } 
   }
}
