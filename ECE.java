//Part of event package
package event;

import java.util.Scanner;
//This will be the only class of ECE, ENE, HE, and PE commented

//Economy Events
public class ECE extends ME{
  //We have a static boolean variable which is the class's save condition, each class has a unique save condition
  public static boolean EmeFunds = false;

  //First constructor will take in 4 int values usually 0, ASC1 is the allsight value from the public static variable from Main.java. This constuctor sets the starting values
  public ECE(int ECEC, int ENEC, int HEC, int PEC, boolean ASC1) {
    super(ECEC, ENEC, HEC,PEC, ASC1);
  }
  
  public ECE () {
  }

  //The first to 4th event is more or less the same in every class except the second event in the economy method so I will only be explaining what is happening in ECE.E1()
  //The fifth event method will be explained later
  public void E1() {
    Scanner input = new Scanner(System.in);//scanner object
    //C is the choice variable as you may have seen a few times in Main.java. Sure is the condition for the while loop and will change to true with the SURE method once the user has locked in a choice. Decoy is a decoy if I ever need to use it.
    int C;
    boolean sure = false;
    String decoy;

    //While menu will keep on going as long as the user has not made a solid vote
    while (sure == false) {
      //Statement giving insight on what is happening
      System.out.println("There is an large ore vein discovered near a city would you like to begin a mining operation?");
      System.out.println("");
      //The choice the user makes
      C = input.nextInt();
      //The change in each of the primary values will reset each time just to be sure.
      eceC = 0;
      eneC = 0;
      heC = 0;
      peC = 0;
      
      System.out.println("");

      //This will occur if the user has indicated yes entering the int value 1 and will trigger the changes to the changes to the primary value variables (yes that is a mouthful).
      if (C == 1) {     
        eceC = 30;
        eneC = -25;
        peC = -10;

        //Here is what the allsight is for. Every game it will start off as false and when it is active it will show you exactly how much each event will change and which way it will change whether it will be an increase, decrease, or 0.
        if (ASCC == true) {
          System.out.println("Economy:       +" + eceC);
          System.out.println("Environment:   " + eneC);
          System.out.println("Health:        " + heC);
          System.out.println("People:        " + peC);
          System.out.println("");
        
        //If you do not have allsight it will be Large or small, the user has no idea how large or how small, which is the point
        } else {
          System.out.println("Economy: Large");
          System.out.println("Environment: Small");
          System.out.println("People: Small");
          System.out.println("");
        }

        //Sure method to lock in your choice
        sure = SURE();
      
      //This is the other choice you can make if the number you enter is anything else which will indicate no. The system I use here is pretty much the same.
      } else {
        eceC = -25;
        eneC = 10;
        peC = 10;

        if (ASCC == true) {
          System.out.println("Economy:       " + eceC);
          System.out.println("Environment:   +" + eneC);
          System.out.println("Health:        " + heC);
          System.out.println("People:        +" + peC);
          System.out.println("");
        } else {
          System.out.println("Economy: Large");
          System.out.println("Environment: Small");
          System.out.println("People: Small");
          System.out.println("");
        }
        
        sure = SURE();
      }
    }// method end11111111111111111111111111111111111111111
  }
  //E2 is special only to ECE.java. Every other E2 of other classes are similar to E1. I will be highlighting key differences and will do the same for E5. P.S. E5 are the same throughout each class.
  public boolean E2() {
    Scanner input = new Scanner(System.in);
    int C;
    boolean sure = false;

    //We immediately start out with a new variable and it will act as a return value because E2 is a boolean method
    boolean R = false;
    String decoy;
    
    while (sure == false) {
      //As you can tell from the Statement I hope you can tell what the method does from here
      System.out.println("Would you like to invest in some technology to give us insight when making decisions?");
      System.out.println("");
      C = input.nextInt();
      eceC = 0;
      eneC = 0;
      heC = 0;
      peC = 0;
      
      System.out.println("");
      if (C == 1) {
        eceC = -30;
        eneC = 0;
        heC = 0;
        peC = 0;
        //We can see our new variable in action if you say yes which will turn it to true
        R = true;

        //same things here showing changes to changing primary values
        if (ASCC == true) {
          System.out.println("Economy:       " + eceC);
          System.out.println("Environment:   " + eneC);
          System.out.println("Health:        " + heC);
          System.out.println("People:        " + peC);
          System.out.println("");
        } else {
          System.out.println("Economy: Large");
          System.out.println("");
        }

        sure = SURE();
      } else {
        eceC = 0;
        eneC = 0;
        heC = 0;
        peC = 0;
        
        //Here if you answered no R will be false
        R = false;

        if (ASCC == true) {
          System.out.println("Economy:       " + eceC);
          System.out.println("Environment:   " + eneC);
          System.out.println("Health:        " + heC);
          System.out.println("People:        " + peC);
          System.out.println("");
        } else {
          System.out.println("None: nothing");
          System.out.println("");
        }
        
        sure = SURE();
      }
    }

    //R is then returned
    //Go to Main.java 179 to get more insight if I havent changed it
    return R;
  }//method end2222222222222222222222222222222222222222222222222222

  public void E3() {
    Scanner input = new Scanner(System.in);
    int C;
    boolean sure = false;
    String decoy;
    
    while (sure == false) {
      System.out.println("A shady person approaches you he offers you a hefty bribe to support a certain corporation. Do you accept?");
      System.out.println("");
      C = input.nextInt();
      eceC = 0;
      eneC = 0;
      heC = 0;
      peC = 0;
      
      System.out.println("");
      if (C == 1) {
        eceC = 15;
        eneC = 0;
        heC = 0;
        peC = -10;

        if (ASCC == true) {
          System.out.println("Economy:       +" + eceC);
          System.out.println("Environment:   " + eneC);
          System.out.println("Health:        " + heC);
          System.out.println("People:        " + peC);
          System.out.println("");
        } else {
          System.out.println("Economy: Small");
          System.out.println("People: Small");
          System.out.println("");
        }
        
        sure = SURE();
      } else {
        eceC = 0;
        eneC = 0;
        heC = 0;
        peC = 0;

        if (ASCC == true) {
          System.out.println("Economy:       " + eceC);
          System.out.println("Environment:   " + eneC);
          System.out.println("Health:        " + heC);
          System.out.println("People:        " + peC);
          System.out.println("");
        } else {
          System.out.println("None: nothing");
          System.out.println("");
        }
        
        sure = SURE();
      }
    }
  }//method end33333333333333333333333333333333333333333333333333

  public void E4() {
    Scanner input = new Scanner(System.in);
    int C;
    boolean sure = false;
    String decoy;
    
    while (sure == false) {
      System.out.println("You have a meeting today! Would you like it to focus on improving the country's economic standing");
      System.out.println("");
      C = input.nextInt();
      eceC = 0;
      eneC = 0;
      heC = 0;
      peC = 0;
      
      System.out.println("");
      if (C == 1) {
        eceC = 40;
        eneC = -15;
        heC = -15;
        peC = -15;

        if (ASCC == true) {
          System.out.println("Economy:       +" + eceC);
          System.out.println("Environment:   " + eneC);
          System.out.println("Health:        " + heC);
          System.out.println("People:        " + peC);
          System.out.println("");
        } else {
          System.out.println("Economy: Large");
          System.out.println("Environment: Small");
          System.out.println("Health: Small");
          System.out.println("People: Small");
          System.out.println("");
        }
        
        sure = SURE();
      } else {
        eceC = 5;
        eneC = 5;
        heC = 5;
        peC = 5;
        if (ASCC == true) {
          System.out.println("Economy:       +" + eceC);
          System.out.println("Environment:   +" + eneC);
          System.out.println("Health:        +" + heC);
          System.out.println("People:        +" + peC);
          System.out.println("");
        } else {
          System.out.println("Economy: Small");
          System.out.println("Environment: Small");
          System.out.println("Health: Small");
          System.out.println("People: Small");
          System.out.println("");
        }
        
        sure = SURE();
      }
    }
  }//method end444444444444444444444444444444444444444444444444444

  //This is the 5th Event method and will be known as the save condition method as it will deal with it whenever it runs
  public void E5() {
    //Same variables basically
    Scanner input = new Scanner(System.in);
    int C;
    boolean sure = false;
    String decoy;
    
    while (sure == false) {
      //Same things here
      System.out.println("The minister of finance ask you if you wish to set up some emergency funds. Would you like to do so?");
      System.out.println("");
      C = input.nextInt();
      eceC = 0;
      eneC = 0;
      heC = 0;
      peC = 0;
      
      System.out.println("");
      //More same things basically
      if (C == 1) {
        eceC = -35;
        eneC = 0;
        heC = 0;
        peC = 0;

        if (ASCC == true) {
          System.out.println("Economy:       " + eceC);
          System.out.println("Environment:   " + eneC);
          System.out.println("Health:        " + heC);
          System.out.println("People:        " + peC);
          System.out.println("");
        } else {
          System.out.println("Economy: Large");
          System.out.println("");
        }
        
        //Honestly this is the only difference, depending on whether the user indicates yes or no the save condition of each class will be changed. Once this method is exited with the save condition being true, the method cannot run again until the save condition is false. To turn save condition false the you have to get the respective the class of the save condition represents below or to 0.
        EmeFunds = true;
        sure = SURE();

      } else {
        eceC = 0;
        eneC = 0;
        heC = 0;
        peC = 0;

        if (ASCC == true) {
          System.out.println("Economy:       " + eceC);
          System.out.println("Environment:   " + eneC);
          System.out.println("Health:        " + heC);
          System.out.println("People:        " + peC);
          System.out.println("");
        } else {
          System.out.println("None: nothing");
          System.out.println("");
        }
        
        //Save condition is turned false if you say no
        EmeFunds = false;
        sure = SURE();
      }
    }
  }//method end5555555555555555555555555555555555555555
}