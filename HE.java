package event;

import java.util.Scanner;//mask shortage

public class HE extends ME{
  public static boolean Quarantine = false;

  public HE(int ECEC, int ENEC, int HEC, int PEC, boolean ASC1) {
    super(ECEC, ENEC, HEC,PEC, ASC1);
  }

  public HE () {
  }

  public void E1() {
    Scanner input = new Scanner(System.in);
    int C;
    boolean sure = false;
    String decoy;
    
    while (sure == false) {
      System.out.println("Oh no your there is a mask shortage! Will you put in an emergency order for mask distribution?");
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
        heC = 20;
        peC = 15;

        if (ASCC == true) {
          System.out.println("Economy:       " + eceC);
          System.out.println("Environment:   " + eneC);
          System.out.println("Health:        " + heC);
          System.out.println("People:        " + peC);
          System.out.println("");
        } else {
          System.out.println("Economy: Large");
          System.out.println("Health: Large");
          System.out.println("People: Small");
          System.out.println("");
        }

        sure = SURE();
      } else {
        eceC = 25;
        eneC = 0;
        heC = -10;
        peC = -20;

        if (ASCC == true) {
          System.out.println("Economy:       " + eceC);
          System.out.println("Environment:   " + eneC);
          System.out.println("Health:        " + heC);
          System.out.println("People:        " + peC);
          System.out.println("");
        } else {
          System.out.println("Economy: Large");
          System.out.println("Health: Small");
          System.out.println("People: Large");
          System.out.println("");
        }
        
        sure = SURE();
      }
    }
  }//method end11111111

  public void E2() {
    Scanner input = new Scanner(System.in);
    int C;
    boolean sure = false;
    String decoy;
    
    while (sure == false) {
      System.out.println("Covid-19 outbreak have gone down to single digits each day for a while would you like to open up commercial districts temporarily?");
      System.out.println("");
      C = input.nextInt();
      eceC = 0;
      eneC = 0;
      heC = 0;
      peC = 0;
      
      System.out.println("");
      if (C == 1) {
        eceC = 40;
        eneC = 0;
        heC = -30;
        peC = 5;

        if (ASCC == true) {
          System.out.println("Economy:       " + eceC);
          System.out.println("Environment:   " + eneC);
          System.out.println("Health:        " + heC);
          System.out.println("People:        " + peC);
          System.out.println("");
        } else {
          System.out.println("Economy: Large");
          System.out.println("Environment: Large");
          System.out.println("People: Small");
          System.out.println("");
        }

        sure = SURE();
      } else {
        eceC = -10;
        eneC = 0;
        heC = 25;
        peC = -5;

        if (ASCC == true) {
          System.out.println("Economy:       " + eceC);
          System.out.println("Environment:   " + eneC);
          System.out.println("Health:        " + heC);
          System.out.println("People:        " + peC);
          System.out.println("");
        } else {
          System.out.println("Economy: Small");
          System.out.println("Health: Large");
          System.out.println("People: Small");
          System.out.println("");
        }
        
        sure = SURE();
      }
    }
  }//method end2222222

  public void E3() {
    Scanner input = new Scanner(System.in);
    int C;
    boolean sure = false;
    String decoy;
    
    while (sure == false) {
      System.out.println("Oh no! There was a large outbreak in the city! Will you expend resources to help mitigate the damage?");
      System.out.println("");
      C = input.nextInt();
      eceC = 0;
      eneC = 0;
      heC = 0;
      peC = 0;
      
      System.out.println("");
      if (C == 1) {
        eceC = -20;
        eneC = 0;
        heC = -5;
        peC = 20;

        if (ASCC == true) {
          System.out.println("Economy:       " + eceC);
          System.out.println("Environment:   " + eneC);
          System.out.println("Health:        " + heC);
          System.out.println("People:        " + peC);
          System.out.println("");
        } else {
          System.out.println("Economy: Large");
          System.out.println("Health: Small");
          System.out.println("People: Large");
          System.out.println("");
        }

        sure = SURE();
      } else {
        eceC = 15;
        eneC = 0;
        heC = -40;
        peC = -15;

        if (ASCC == true) {
          System.out.println("Economy:       " + eceC);
          System.out.println("Environment:   " + eneC);
          System.out.println("Health:        " + heC);
          System.out.println("People:        " + peC);
          System.out.println("");
        } else {
          System.out.println("Economy: Small");
          System.out.println("Health: Large");
          System.out.println("People: Small");
          System.out.println("");
        }
        
        sure = SURE();
      }
    }
  }//method end333333

  public void E4() {
    Scanner input = new Scanner(System.in);
    int C;
    boolean sure = false;
    String decoy;
    
    while (sure == false) {
      System.out.println("Doctors all around urge you to put stricter travel orders. Will you make it harder for people to travel in and out of the country?");
      System.out.println("");
      C = input.nextInt();
      eceC = 0;
      eneC = 5;
      heC = 20;
      peC = -20;
      
      System.out.println("");
      if (C == 1) {
        eceC = 0;
        eneC = 5;
        heC = 20;
        peC = -20;

        if (ASCC == true) {
          System.out.println("Economy:       " + eceC);
          System.out.println("Environment:   " + eneC);
          System.out.println("Health:        " + heC);
          System.out.println("People:        " + peC);
          System.out.println("");
        } else {
          System.out.println("Environment: Small");
          System.out.println("Health: Large");
          System.out.println("People: Large");
          System.out.println("");
        }

        sure = SURE();
      } else {
        eceC = 5;
        eneC = -5;
        heC = -35;
        peC = 15;

        if (ASCC == true) {
          System.out.println("Economy:       " + eceC);
          System.out.println("Environment:   " + eneC);
          System.out.println("Health:        " + heC);
          System.out.println("People:        " + peC);
          System.out.println("");
        } else {
          System.out.println("Economy: Small");
          System.out.println("Environment: Small");
          System.out.println("Health: Large");
          System.out.println("People: Small");
          System.out.println("");
        }
        
        sure = SURE();
      }
    }
  }//method end4444444

  public void E5() {
    Scanner input = new Scanner(System.in);
    int C;
    boolean sure = false;
    String decoy;
    
    while (sure == false) {
      System.out.println("The minister of health recommends we build emergency quarantine zones in case of a crisis in the future. Do you wish to do so?");
      System.out.println("");
      C = input.nextInt();
      eceC = 0;
      eneC = 0;
      heC = 0;
      peC = 0;      
      System.out.println("");
      if (C == 1) {
        eceC = -5;
        eneC = 0;
        heC = -20;
        peC = 0;
        Quarantine = true;

        if (ASCC == true) {
          System.out.println("Economy:       " + eceC);
          System.out.println("Environment:   " + eneC);
          System.out.println("Health:        " + heC);
          System.out.println("People:        " + peC);
          System.out.println("");
        } else {
          System.out.println("Economy: Small");
          System.out.println("Health: Large");
          System.out.println("");
        }

        sure = SURE();
      } else {
        eceC = 0;
        eneC = 0;
        heC = 0;
        peC = 0;
        Quarantine = false;

        if (ASCC == true) {
          System.out.println("Economy:       " + eceC);
          System.out.println("Environment:   " + eneC);
          System.out.println("Health:        " + heC);
          System.out.println("People:        " + peC);
          System.out.println("");
        } else {
          System.out.println("None: Nothing");
          System.out.println("");
        }
        
        sure = SURE();
      }
    }
  }//method end55555
}