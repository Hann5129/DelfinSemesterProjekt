import java.util.*;
import java.io.*;

//Manager henter/kan bruge metoder fra Cashier, via extends
public class Manager extends Cashier{

   private int choiceAge;
   private String efternavn;
   private String fornavn;
   private String choiceActivePassive;
   private String choiceCompetitive;
   Scanner scan = new Scanner(System.in); //Opretter Scanner

   public void addMember(){
	   System.out.println("Du skal nu indtaste medlemmets oplysninger");
	   
	   System.out.println("Indtast Fornavn: ");
	   fornavn = scan.nextLine();
	   System.out.println("Indtastet fornavn: " +fornavn);
   
	   System.out.println("Indtast Efternavn:");
	   efternavn = scan.nextLine();
	   System.out.println("Indtastet fornavn : " +efternavn);
   
	   System.out.println("Skal medlemmet have aktivt eller passivt medlemsskab?");
	   choiceActivePassive = scan.nextLine();
	   if (choiceActivePassive.equalsIgnoreCase ("aktivt")){
		   System.out.println("Aktivt medlemsskab registreret");
	   }
	   if (choiceActivePassive.equalsIgnoreCase ("passivt")){
		   System.out.println("Passivt medlemsskab registreret");
	   }
	   else{
		   System.out.println("Du har benyttet en ugyldig kommando, benyt venligst 'aktivt' eller 'passivt'");
	   }
   
	   System.out.println("Tast 1 for under 18, 2 for over 18, og 3 for +60: ");
	   choiceAge = scan.nextInt();
	   if (choiceAge == (1)){
		   System.out.println("Du har valgt under 18.");
	   }
	   if (choiceAge == (2)){
		   System.out.println("Du har valgt over 18.");
	   }	
	   if (choiceAge == (3)){
		   System.out.println("Du har valgt +60.");
	   }
	   else{
		   System.out.println("Du har valgt en ugyldig kommando, benyt venligst følgende, og prøv igen: ");
	   }
   
	   System.out.println("Er medlemmet motionist eller konkurrence svommer?");
	   choiceCompetitive = scan.nextLine();
	   if (choiceCompetitive.equalsIgnoreCase ("motionist")){
		   System.out.println("Du har valgt Motionist");
	   }
	   if (choiceCompetitive.equalsIgnoreCase ("konkurrence")){
		   System.out.println("Du har valgt Konkurrence");
	   }
	   else{
		   System.out.println("Du har skrevet en ugyldig kommando, benyt venligst 'motionist' eller 'konkurrence'");
		   System.out.println("Prøv venligst igen");
	   }   
  }
    
  public void deleteMember(){
  
  }
}
