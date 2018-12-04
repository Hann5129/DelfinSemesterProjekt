import java.util.*;
import java.io.*;

//Manager henter/kan bruge metoder fra Cashier, via extends/nedarvning
public class Manager extends Cashier{

   private int choiceAge;
   private String efternavn;
   private String fornavn;
   private String choiceActivePassive;
   private String choiceCompetitive;
   private int choiceFaerdig = 1;
   Scanner scan = new Scanner(System.in); //Opretter Scanner

   public void addMember(){
   MemberInfo meminfo = new MemberInfo(setFirstName, setLastName, setActive, setAgeGroup, setCompetitor, setSubscriptionFeePrice);
   while (choiceFaerdig == 1){
	   System.out.println("Du skal nu indtaste medlemmets oplysninger");
	   
	   System.out.println("Indtast Fornavn: ");
	   fornavn = scan.nextLine();
	   System.out.println("Indtastet fornavn: " + fornavn);
   
	   System.out.println("Indtast Efternavn:");
	   efternavn = scan.nextLine();
	   System.out.println("Indtastet fornavn : " + efternavn);
   
	   System.out.println("Skal medlemmet have aktivt eller passivt medlemsskab?");
      while (choiceActivePassive != "aktivt" && choiceActivePassive != "passivt"){
	   choiceActivePassive = scan.nextLine();
	   if (choiceActivePassive.equalsIgnoreCase ("aktivt")){
		   System.out.println("Aktivt medlemsskab registreret");
         break;
	   }
	   else if (choiceActivePassive.equalsIgnoreCase ("passivt")){
		   System.out.println("Passivt medlemsskab registreret");
         break;
	   }
	   else{
		   System.out.println("Du har benyttet en ugyldig kommando, benyt venligst 'aktivt' eller 'passivt'");
	   }
     }
      while (choiceAge != 1 && choiceAge != 2 && choiceAge != 3){
	   System.out.println("Tast 1 for under 18, 2 for over 18, og 3 for +60: ");
	   choiceAge = scan.nextInt();
	   if (choiceAge == (1)){
		   System.out.println("Du har valgt under 18.");
         if (choiceActivePassive.equals ("passivt")){
         setSubscriptionFeePrice = 500;
         }
         else if (choiceActivePassive.equals ("aktivt")){
         setSubscriptionFeePrice = 1000;
         }
         break;
	   }
	   else if (choiceAge == (2)){
		   System.out.println("Du har valgt over 18.");
         if (choiceActivePassive.equals ("passivt")){
         setSubscriptionFeePrice = 500;
         }
         else if (choiceActivePassive.equals ("aktivt")){
         setSubscriptionFeePrice = 1600;
         }
         break;
  	   }	
	   else if (choiceAge == (3)){
		   System.out.println("Du har valgt +60.");
         if (choiceActivePassive.equals ("passivt")){
         setSubscriptionFeePrice = 500;
         }
         else if (choiceActivePassive.equals ("aktivt")){
         setSubscriptionFeePrice = 1200;
         }
         break;
	   }
	   else{
		   System.out.println("Du har valgt en ugyldig kommando, benyt venligst fÃ¸lgende, og prÃ¸v igen: ");
	   }
     }
   
	   System.out.println("Er medlemmet motionist eller konkurrence svommer?");
      while (choiceCompetitive != "motionist" && choiceCompetitive != "konkurrence"){
	   choiceCompetitive = scan.nextLine();
	   if (choiceCompetitive.equalsIgnoreCase ("motionist")){
		   System.out.println("Du har valgt Motionist");
         break;
	   }
	   else if (choiceCompetitive.equalsIgnoreCase ("konkurrence")){
		   System.out.println("Du har valgt Konkurrence");
         break;
	   }
	   else{
		   System.out.println("Du har skrevet en ugyldig kommando, benyt venligst 'motionist' eller 'konkurrence'");
		   System.out.println("Prøv venligst igen");
	   }
     }
      System.out.println("Ønsker du at tilføje flere medlemmere, eller fortsætte?");
      System.out.println("Tast 1 for at tilføje flere, tast 2 for at forsætte");
      choiceFaerdig = scan.nextInt();
      if (choiceFaerdig == 1){
      choiceFaerdig = 1;
      System.out.println("Du har valgt at tilføje flere medlemmere");
      System.out.println("");
      }
     else if (choiceFaerdig == 2){
      choiceFaerdig = 2;
      System.out.println("Du har valgt at fortsætte");
      break;
      }
      else{
      System.out.println("Du har brugt en forkert kommando, benyt venligt '1' for at tilføje flere, og '2' for at fortsætte");
      System.out.println("Prøv igen");
      }   
    }
  }
    
  public void deleteMember(){
  
  }
}