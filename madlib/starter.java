
import java.util.Scanner;//We need to input this class from the library, if BlueJ had all classes stored already, we would have major memory loss and make the program inefficient


public class starter//class header--> public refers to scope of accessibility 
{
    public static void main(String[] args)//main method will work as engine for program, method
    {
        System.out.println("Welcome to the NASA database\nPlease input first name to continue");//println is a method from the Printstream class, System.out is a reference to the Printstream object
        //the input for the printstream method is in the quoted text, this repeats for every System.out input
        Scanner entry = new Scanner (System.in);//this creates a new scanner object to store the entries by the user, the variable 'entry' is used as a reference to this object
        String name;//the user's entry for this question will be stored under the variable 'name'
        name = entry.nextLine();//entry.nextLine(); is used in case the user's entry has two words with a space, entry.next(); only reads the string of text beofre a space and stops.
        //the variable 'name' is assinged to the scanner entry, this repeats for every user entry
        
        
        System.out.println("Please enter the name of a Greek God or Goddess");
        String god;//the user's entry for this question will be stored under the variable 'god'
        god = entry.nextLine();
        
        System.out.println("Please enter the name of a planet");
        String planet;//the user's entry for this question will be stored under the variable 'planet'
        planet = entry.nextLine();
        
        System.out.println("Please enter the first name of a friend");
        String frname;//the user's entry for this question will be stored under the variable 'frname'
        frname = entry.nextLine();
        
        System.out.println("Please enter an adjective");
        String adj1;//the user's entry for this question will be stored under the variable 'adj1'
        adj1 = entry.nextLine();
        
        System.out.println("Please enter a breakfast food");
        String food;//the user's entry for this question will be stored under the variable 'food'
        food = entry.nextLine();
        
        System.out.println("Please enter a metal object (plural)");
        String obj;//the user's entry for this question will be stored under the variable 'obj'
        obj = entry.nextLine();
        
        System.out.println("Please enter a negative adjective");
        String adj2;//the user's entry for this question will be stored under the variable 'adj2'
        adj2 = entry.nextLine();
        
        System.out.println("Please enter the name of any tool");
        String tool;//the user's entry for this question will be stored under the variable 'tool'
        tool = entry.nextLine();
        
        System.out.println("Please enter an adjective");
        String adj3;//the user's entry for this question will be stored under the variable 'adj3'
        adj3 = entry.nextLine();
        
        System.out.println("Please enter a scary adjective");
        String adj4;//the user's entry for this question will be stored under the variable 'adj4'
        adj4 = entry.nextLine();
        
        System.out.println("Please enter any number");
        String num;//the user's entry for this question will be stored under the variable 'num'
        num = entry.nextLine();
        
        System.out.println("Please enter a color");
        String adj5;//the user's entry for this question will be stored under the variable 'adj5'
        adj5 = entry.nextLine();
        
        System.out.println("Please enter any non-human body part (from an animal or insect) (singular)");
        String part;//the user's entry for this question will be stored under the variable 'part'
        part = entry.nextLine();
        
        
        
        
        System.out.println("\n\nConnecting...\nConnection established\n>NEW TRANSMISSION<\n>"+god+" 5 MISSION LOG<\n''Good morning Commander "+name+"'', the voice rang out over the comm system in the main hub of the ISS.\nCommander "+name+" and his crew of the " +god+ " 5 are currently orbiting " +planet+".\n''All is well Houston'', you say.\nLooks like it's going to be another "+adj1+" day out here, says "+frname+".\nYou prepare some freeze-dried "+ food+" for breakfast.\nAll of a sudden you hear a loud noise, like two "+obj+" being hit together.\nYou look outside and find what seems to be someone in "+frname+"'s space suit floating outside the window.\n''Commander "+name+", let me in, it's "+frname+", I'm coming in from my repair mission''\n''How could that be "+frname+" if he's in here with me?'', you think.\nYou look at "+frname+" inside and you both share a "+adj2+" expression.\nOutside, the mystery "+frname+" bangs on the door with his "+tool+", pleading for you to open up.\n''Please don't let him in, "+name+", it's crazy.'', says the "+frname+" from inside.\n''Oh no, who do I believe??'', your mind races.\nYou decide to open the airlock, not wanting to leave anyone behind, the outside "+frname+" thanks you and gives you a "+adj3+" hug.\nYou stare dumbfounded at the unkonwn man in the suit, unable to see his face.\nThe two "+frname+"s look at eachother and share a "+adj4+" grin.\nThey turn to you and say in unision, ''Wrong decision Commander " +name+"''.\nYou see " +num+" "+adj5+" "+part+"s pop out of their bodies, their grotesque figures tower over you and all of a sudden-\n\n>ERROR\n\nNASA Database: RESTRICTED INFORMATION- YOU DO NOT HAVE PERMISSION\n\nConnecting...\nConnection lost\n\nSession Failed");
        //the println method outputs a string of text, including the variables from the user's entry, to create the finalized madlibs story.
        //the input of the printstream method is in the quoted text
    }
}

//PSEUDOCODE: 1. Prompt user for name, store user input with a new scanner object.
//2. Prompt user for parts of speech and other words necessary for Madlib, store input with seperate variables in allocated memory
//3. Using a pointer, retrieve user inputs from allocated memory, intert said strings of text into paragraph
//4. The paragraph has strings of text printed along with variables of the user's input included to make the story
//5. The program finishes after the paragraph is outputed




