import java.util.Scanner;
public class PartyAffiliation
{
static void main()
    {
     Scanner in =  new Scanner(System.in);
     String partyAffiliation = "";

     IO.print("Enter your Party Affiliation [D/R/I]: ");
     partyAffiliation = in.nextLine();

     if (partyAffiliation.equals("D"))
       IO.println("You get a Democratic Donkey!");
     else if (partyAffiliation.equals("R"))
         IO.println("You get a Republican Elephant!");
     else if (partyAffiliation.equals("I"))
         IO.println("You get a Independent Person!");
     else
         IO.println("You have entered an invalid option, please restart and try again.");


    }

}
