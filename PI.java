//Part of menu package
package menu;
//to future self, this part is for program desc, help menu and such
import java.util.Scanner;
import java.util.Random;

public class PI extends Prime{
  //!!!NEWSTUFF HERE!!!
  //PI has a Helper
  private Helper comment;

  //Name variable to store name in PI.java, I forgot what PI stands for... Oh well its here to stay
  private static String name;

  //First constructor for PI.java will first go to the second constructor then set your name to the name that has been entered when the constuctor was created.
  public PI(String iname) {
    this(iname, 0);
    name = iname;
  }

  //Constuctor mainly for Helper.java
  public PI(int EC, int EN, int H, int P) {
    comment = new Helper(EC, EN, H, P);
  }

  //Gives a nice little greeting and question that beginners should probably read :)
  public PI(String iname, int x) {
    System.out.println("");
    System.out.println("Alright " + iname + " would you like to check out anything before we start?");
  }

  //This is the main menu of the class a classic while loop main menu
  public void MM() {
    Scanner input = new Scanner(System.in);
    boolean x = true;
    int c;

    //while menu, using c as making choices indicated with brackets the numbers to enter for each choice while loop whill end when user chooses start game
    while(x == true){
      //There are 4 choices and each will go into their own repspective methods which will be explained when you get to them
      System.out.println("(1) Start game");
      System.out.println("(2) Help");
      System.out.println("(3) Change name");
      System.out.println("(4) Ask question (no longer WIP)");
      c = input.nextInt();
      System.out.println("");
      if (c == 1) {
        //Choosing this will end the loop
        x = false;
      } else if (c == 2) {
        HELP();
      } else if (c == 3) {
        CN();
      } else if (c == 4) {
        AQ();
      } else {
        System.out.println("");
      }
    }
  }

  //Help method pretty self explainitory mainly for beginners
  public void HELP() {
    Scanner input = new Scanner(System.in);
    boolean x = true;
    int c;
    while (x == true) {
      //4 choices, Description will give a little bit of insight on how I was inspired to make this type of game and how I got alot of the ideas for it. How do i play gives you instructions on how to play and some insight on how the game works. Lore gives some background on the game and what is happening. Go back is self explainitory as it ends the loop and you will go back to the main menu method <<MM()>>
      System.out.println("(1) Description");
      System.out.println("(2) How do I play");
      System.out.println("(3) Lore");
      System.out.println("(4) Go back");
      c = input.nextInt();
      System.out.println("");
      if (c == 1) {
        System.out.println("This game design was inspired by the game lapse \"a forgotten world\". In that game the health meter that I have in this game will have been replaced by a war meter. The reason for that is that the setting lapse was in is in a nuclear fallout sort of scenario.");
        System.out.println("");
      } else if (c == 2) {
        System.out.println("In this game there will be 2 options for a question. Type 1 for yes, any other integer will be considered no. Do not use letters or special characters");
        System.out.println("During when you pick an option you will be given some foresight on how much it will impact your country as in Small or Large however whether it will benifit your country in that way it will be up to you to know that.");
        System.out.println("There will be 4 parameters you will have to manage, Economy, Environment, Health, People. Do not let them drop to 0.");
        System.out.println("");
      } else if (c == 3) {
        System.out.println("The year is 2020, you have been elected to be the next head of the state and will have to lead it as best you can good luck and make sure to not get forcibly removed from your post.");
        System.out.println("");
      } else if (c == 4) {
        x = false;
      } else {
        System.out.println("");
      }
    }
  }

  //This is the change name function and it asks you to enter a new name and will change the name so if you made a mistake typeing your name you can change it here, this is a mutator method
  public void CN() {
    Scanner input = new Scanner(System.in);
    System.out.println("What is your new name?");
    String x = input.nextLine();
    System.out.println("");
  }

  //GN stands for get name, it will return the name value and is an accessor method
  public String GN() {
    return name;
  }

  //This is a litteral 8 ball I thought it would be funny and I needed something to override
  @Override
  public void AQ() {
    Scanner input = new Scanner(System.in);
    Random rand = new Random();
    int randInt;
    String Q;
    System.out.println("What is your question?");
    Q = input.nextLine();
    System.out.println("");
    randInt = rand.nextInt(21);
    if (Q.equalsIgnoreCase("this is 8 ball")) {
      System.out.println("HE KNOWS!!!");
    } else {
      if (randInt == 1) {
        System.out.println("As I see it, yes.");
      } else if (randInt == 2) {
        System.out.println("Ask again later.");
      } else if (randInt == 3) {
        System.out.println("Better not tell you now.");
      } else if (randInt == 4) {
        System.out.println("Cannot predict now.");
      } else if (randInt == 5) {
        System.out.println("Concentrate and ask again.");
      } else if (randInt == 6) {
        System.out.println("Don’t count on it.");
      } else if (randInt == 7) {
        System.out.println("It is certain.");
      } else if (randInt == 8) {
        System.out.println("It is decidedly so.");
      } else if (randInt == 9) {
        System.out.println("Most likely.");
      } else if (randInt == 10) {
        System.out.println("My reply is no.");
      } else if (randInt == 11) {
        System.out.println("My sources say no.");
      } else if (randInt == 12) {
        System.out.println("Outlook not so good.");
      } else if (randInt == 13) {
        System.out.println("Outlook good.");
      } else if (randInt == 14) {
        System.out.println("Reply hazy, try again.");
      } else if (randInt == 15) {
        System.out.println("Signs point to yes.");
      } else if (randInt == 16) {
        System.out.println("Very doubtful.");
      } else if (randInt == 17) {
        System.out.println("Without a doubt.");
      } else if (randInt == 18) {
        System.out.println("Yes.");
      } else if (randInt == 19) {
        System.out.println("Yes – definitely.");
      } else if (randInt == 20) {
        System.out.println("You may rely on it.");
      }
    }
    System.out.println("");
  }

  //toString method for the class will be used every turn showing your ID, name, and the number of turns you have left
  public String toString(int TL) {
    return "Government ID 0085\nName: " + name + "\nTurns Left: " + TL;
  }

  //!!!NEWSTUFF HERE!!! A helper method
  public Helper getComment() {
    return comment;
  }
}