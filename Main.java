//importing scanner and random classes
import java.util.Scanner;
import java.util.Random;

//importing classes from event and menu package
import event.ECE;
import event.ENE;
import event.HE;
import event.ME;
import event.PE;
import menu.PI;
import menu.Helper;
import menu.Prime;
import menu.Operator;

//ECE.java, ENE.java, HE.java, PE.java are all pretty much the same so ECE.java will be the only one commented. There will be many other variations of repeats of commenting.

class Main {
  //EC is the Economy value, EN is the Environment value, H is the Health value, P is the People value, the win condition will decide if you have won or not, AS stands for all sight if it is true it will give more detail on what each event will do.
  public static int EC = 60;
  public static int EN = 60;
  public static int H = 60;
  public static int P = 60;
  public static boolean win = false;
  public static boolean AS = false;

  //main method
  public static void main(String[] args) {
    //Creating random and scanner object
    Random rand = new Random();
    Scanner input = new Scanner(System.in);

    //randInt will be the number representing our random number. Elected will determine if you are still in office, it will turn false when you win or lose. TL is the # of turns you have left to get through defaulting at 50. decoy is for nextInt() if needed. Effectcount is the number of effects you have active.
    int randInt;
    boolean Elected = true;
    int TL = 50;
    String decoy;
    int EffectCount;

    //Opening statement
    System.out.println("Welcome to the simulator. Here you will be managing a country most likely through the period of Covid 19. Your goal is to get through the period of Covid-19");

    //This section asks for you name and will send it to the PI class as an instance variable there
    System.out.println("What is your name?");
    System.out.println("");
    PI PI1 = new PI(input.nextLine());

    //Starting main menu method from PI class
    PI1.MM();

    //While menu will keep going as long as you are elected
    while(Elected == true) {

      PI PI2 = new PI(EC, EN, H, P);
      //Effect count is set as 0 at the beginning of while loop
      EffectCount = 0;
      System.out.println(PI1.toString(TL));//in the actual game there is no turn system. In that game you lose and lose over and over again. There is no way to win.

      //GUI of showing all 4 values to focus on.
      System.out.println("Economics:        "+EC+"/100");
      System.out.println("Environment:      "+EN+"/100");
      System.out.println("Health:           "+H+"/100");
      System.out.println("People Support:   "+P+"/100");
      System.out.println("");

      System.out.println(PI2.getComment());

      //The effects section will show 'none' if you have no effects. There is a check for every single effect and EffectCount will go up by one every time and the effect you have will be displayed. You can have multiple effects at once.
      System.out.println("Active Effects: ");
      if (ECE.EmeFunds == true) {
        System.out.println("[Emergency Funds]");
        EffectCount++;
      }
      if (ENE.Ghouse == true) {
        System.out.println("[Greenhouse]");
        EffectCount++;
      }
      if (HE.Quarantine == true) {
        System.out.println("[Quarantine Zones]");
        EffectCount++;
      }
      if (PE.Security == true) {
        System.out.println("[Extra Security]");
        EffectCount++;
      }
      if (AS == true) {
        System.out.println("[All Sight]");
        EffectCount++;
      }
      if (EffectCount == 0) {
        System.out.println("[None]");
      }

      System.out.println("");

      //An integer is selected from 1-4 and will choose a method to run from Economy, Environment, Health, and People.
      randInt = rand.nextInt(5);//placeholder
      if (randInt == 1) {
        Economy();
      } else if (randInt == 2) {
        Environment();
      } else if (randInt == 3) {
        Health();
      } else if (randInt == 4) {
        People();
      } else {
        System.out.println("");
      }
      //decoy = input.nextLine();
      TL--;//this reduces turn count by 1

      //The next 5 if statements run either your turn count is 0 or any of the main values are or have fallen below 0. The Elected variable may or may not turn false here.
      if (EC <= 0) {
        Elected = ECL();

      }
      if (EN <= 0) {
        Elected = ENL();

      }
      if (H <= 0) {
        Elected = HL();

      }
      if (P <= 0) {
        Elected = PL();

      }
      if (TL == 0 && EC > 0 && EN > 0 && H > 0 && P > 0) {
        Elected = Victory();

      } else {
        System.out.println("");
      }

      //Since the maximum value is 100 if one of the 4 values is above 100 it will turn back to 100.
      if (EC > 100) {
        EC = 100;
      }
      if (EN > 100 ) {
        EN = 100;
      }
      if (H > 100) {
        H = 100;
      }
      if (P > 100) {
        P = 100;
      }

      
    }

    //This will occur after the while loop and will happen if the user loses. This will display your name, how many turns you have left, and your final values.
    if (win == false) {
      System.out.println(PI1.GN() + ", you have lasted a total of " + (50-TL) + " turns before being forcibly elected out of the office.");
    System.out.println("Economics:        "+EC+"/100");
    System.out.println("Environment:      "+EN+"/100");
    System.out.println("Health:           "+H+"/100");
    System.out.println("People Support:   "+P+"/100");
    System.out.println("");
    }

  }//end of main method
  
  //The Economy, Environment, Health, and People method works very much the same except for 1 part so I will just talk about the Economy class as a general basis.
  public static void Economy() {
    //Each method will have its own random integer from 1-5
    Random rand = new Random();
    int randInt = rand.nextInt(6);

    //This creates an object from each respective class and input 4 zeros and the AS value.
    ECE ECE1 = new ECE(0, 0, 0, 0, AS);

    //If rand lands on 1 it will initiate the first event of the class
    if (randInt == 1) {
      ECE1.E1();

    //If rand lands on 2 it will initiate the second event of the class. In every other method except economy everything past this else if statement will look the same as it did if it landed on one. For the Economy method specifically if AS is true it will roll a number between 1 and 4, if it lands on one if will call the first event of the Economy class, if it lands on 2 it will call the Environment class, if it lands on 3 it will call the thrid event, if it lands on 4 the fourth event.
    //If AS is false here it will call the second event of the class
    } else if (randInt == 2) {
      if (AS == true) {
        randInt = rand.nextInt(5);
        if (randInt == 1) {
          ECE1.E1();
        } else if (randInt == 2) {
          Environment();
        } else if (randInt == 3) {
          ECE1.E3();
        } else if (randInt == 4) {
          ECE1.E4();
        } else {
          System.out.println("");
        }
      } else {
        //As you can see here the allsight method is determined from E2 of ECE.java and will activate allsight throughout all the classes
        AS = ECE1.E2();
      }
      
      //If rand lands on 3 it will initiate the third event of the class
    } else if (randInt == 3) {
      ECE1.E3();

      //If rand lands on 4 it will initiate the fourth event of the class
    } else if (randInt == 4) {
      ECE1.E4();

      //If rand lands on 5 it will initiate the fifth event of the class
      //The 5th event of each class is special as each class has a special effect and activating it will give you a save condition which will be explained later.
    } else if (randInt == 5) {
      //Here it will check if the save condition is active in the class and will not run the fifth event if it is true as you cannot stack the same save condition.
      if (ECE.EmeFunds == true) {
        //if it is true it will roll between 1-4 same as the before however in the other methods if randInt lands on 2 it will run the 2nd event of the respective class.
        randInt = rand.nextInt(5);
        if (randInt == 1) {
          ECE1.E1();
        } else if (randInt == 2) {
          Environment();
        } else if (randInt == 3) {
          ECE1.E3();
        } else if (randInt == 4) {
          ECE1.E4();
        } else {
          System.out.println("");
        }
      } else {
        //It will run the 5th event if the save condition is not active
        ECE1.E5();
      }
    } else {
      System.out.println("");
    }

    //here is where the values are changed as they are static variables. They are each changed by the change values of their respective class.
    EC += ECE1.eceC;
    EN += ECE1.eneC;
    H += ECE1.heC;
    P += ECE1.peC;
  }

  public static void Environment() {
    Random rand = new Random();
    int randInt = rand.nextInt(6);
    ENE ENE1 = new ENE(0, 0, 0, 0, AS);

    if (randInt == 1) {
      ENE1.E1();

    } else if (randInt == 2) {
      ENE1.E2();

    } else if (randInt == 3) {
      ENE1.E3();

    } else if (randInt == 4) {
      ENE1.E4();

    } else if (randInt == 5) {
      if (ENE.Ghouse == true) {
        randInt = rand.nextInt(5);
        if (randInt == 1) {
          ENE1.E1();
        } else if (randInt == 2) {
          ENE1.E2();
        } else if (randInt == 3) {
          ENE1.E3();
        } else if (randInt == 4) {
          ENE1.E4();
        } else {
          System.out.println("");
        }
      } else {
        ENE1.E5();
      }
    } else {
      System.out.println("");
    }
    
    EC += ENE1.eceC;
    EN += ENE1.eneC;
    H += ENE1.heC;
    P += ENE1.peC;
  }

  public static void Health() {
    Random rand = new Random();
    int randInt = rand.nextInt(6);
    HE HE1 = new HE(0, 0, 0, 0, AS);

    if (randInt == 1) {
      HE1.E1();

    } else if (randInt == 2) {
      HE1.E2();

    } else if (randInt == 3) {
      HE1.E3();

    } else if (randInt == 4) {
      HE1.E4();

    } else if (randInt == 5) {
      if (HE.Quarantine == true) {
        randInt = rand.nextInt(5);
        if (randInt == 1) {
          HE1.E1();
        } else if (randInt == 2) {
          HE1.E2();
        } else if (randInt == 3) {
          HE1.E3();
        } else if (randInt == 4) {
          HE1.E4();
        } else {
          System.out.println("");
        }
      } else {
        HE1.E5();
      }
    } else {
      System.out.println("");
    }

    EC += HE1.eceC;
    EN += HE1.eneC;
    H += HE1.heC;
    P += HE1.peC;
  }

  public static void People() {
    Random rand = new Random();
    int randInt = rand.nextInt(6);
    PE PE1 = new PE(0, 0, 0, 0, AS);

    if (randInt == 1) {
      PE1.E1();

    } else if (randInt == 2) {
      PE1.E2();

    } else if (randInt == 3) {
      PE1.E3();

    } else if (randInt == 4) {
      PE1.E4();

    } else if (randInt == 5) {
      if (PE.Security == true) {
        randInt = rand.nextInt(5);
        if (randInt == 1) {
          PE1.E1();
        } else if (randInt == 2) {
          PE1.E2();
        } else if (randInt == 3) {
          PE1.E3();
        } else if (randInt == 4) {
          PE1.E4();
        } else {
          System.out.println("");
        }
      } else {
        PE1.E5();
      }
    } else {
      System.out.println("");
    }

    EC += PE1.eceC;
    EN += PE1.eneC;
    H += PE1.heC;
    P += PE1.peC;
  }
  
  //The next 4 methods are more or less the same and will run if one of the 4 values drop below 0 respectively and will return a boolean value for the Elected variable. If the save condition from the respecitive class is true it will send a message that the save condition has been used then set the save condition to false, set the value that has fallen below or is 0 to 40 and will return true. If you don't have a save condition you will lose and Elected will be false.
  public static boolean ECL() {
    if (ECE.EmeFunds == true) {
      System.out.println("The emergency funds you invested in has been used to keep your economy alfloat");
      System.out.println("");
      ECE.EmeFunds = false;
      EC = 40;
      return true;
    }
    System.out.println("Banks hate u");
    return false;
  }

  public static boolean ENL() {
    if (ENE.Ghouse == true) {
      System.out.println("The back up plants you stored in the green house were able to save your country's environment");
      System.out.println("");
      ENE.Ghouse = false;
      EN = 40;
      return true;
    }
    System.out.println("The earth hates u");
    return false;
  }

  public static boolean HL() {
    if (HE.Quarantine == true) {
      System.out.println("You were able to use the quarantine zones you invested in to avoid an exponential spike in covid outbreaks.");
      HE.Quarantine = false;
      H = 40;
      return true;
    }
    System.out.println("WHO hates u");
    return false;
  }

  public static boolean PL() {
    if (PE.Security == true) {
      System.out.println("Your personal security foce was able protect you during an attempt on your life, you are able to continue working.");
      PE.Security = false;
      P = 40;
      return true;
    }
    System.out.println("People hate u");
    return false;
  }

  //The victory condition will set win to true and send you a victory message and you will no longer be elected because you lasted through your term.
  public static boolean Victory() {
    System.out.println("You win");
    win = true;
    return false;
  }
}