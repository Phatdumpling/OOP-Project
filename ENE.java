package event;

import java.util.Scanner;//research

public class ENE extends ME{
  public static boolean Ghouse = false;

  public ENE(int ECEC, int ENEC, int HEC, int PEC, boolean ASC1) {
    super(ECEC, ENEC, HEC,PEC, ASC1);
  }

  public ENE () {
  }

  public void E1() {
    Scanner input = new Scanner(System.in);
    int C;
    boolean sure = false;
    String decoy;
    
    while (sure == false) {
      System.out.println("The minister of Environmental issues proposes a plan to cut back on logging jobs. Will you accept?");
      System.out.println("");
      C = input.nextInt();
      eceC = 0;
      eneC = 0;
      heC = 0;
      peC = 0;
      
      System.out.println("");
      if (C == 1) {
        eceC = -15;
        eneC = 30;
        heC = 0;
        peC = -10;

        if (ASCC == true) {
          System.out.println("Economy:       " + eceC);
          System.out.println("Environment:   +" + eneC);
          System.out.println("Health:        " + heC);
          System.out.println("People:        " + peC);
          System.out.println("");
        } else {
          System.out.println("Economy: Small");
          System.out.println("Environment: Large");
          System.out.println("People: Small");
          System.out.println("");
        }

        sure = SURE();
      } else {
        eceC = 15;
        eneC = -25;
        heC = 0;
        peC = 0;

        if (ASCC == true) {
          System.out.println("Economy:       +" + eceC);
          System.out.println("Environment:   " + eneC);
          System.out.println("Health:        " + heC);
          System.out.println("People:        " + peC);
          System.out.println("");
        } else {
          System.out.println("Economy: Small");
          System.out.println("Environment: Large");
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
      System.out.println("Researchers have been able to mutate a plant and wish to test it if it has possible medicinal properties. Do you wish to fund them?");
      System.out.println("");
      C = input.nextInt();
      eceC = 0;
      eneC = 0;
      heC = 0;
      peC = 0;
      
      System.out.println("");
      if (C == 1) {
        eceC = -30;
        eneC = 15;
        heC = 10;
        peC = 5;

        if (ASCC == true) {
          System.out.println("Economy:       " + eceC);
          System.out.println("Environment:   +" + eneC);
          System.out.println("Health:        +" + heC);
          System.out.println("People:        +" + peC);
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
        eneC = -20;
        heC = -5;
        peC = 0;

        if (ASCC == true) {
          System.out.println("Economy:       +" + eceC);
          System.out.println("Environment:   " + eneC);
          System.out.println("Health:        " + heC);
          System.out.println("People:        " + peC);
          System.out.println("");
        } else {
          System.out.println("Economy: Small");
          System.out.println("Environment: Large");
          System.out.println("Health: Small");
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
      System.out.println("One of your powerplants had a meltdown! Do you want to prioritize the people over the environment?");
      System.out.println("");
      C = input.nextInt();
      eceC = 0;
      eneC = 0;
      heC = 0;
      peC = 0;
      
      System.out.println("");
      if (C == 1) {
        eceC = 0;
        eneC = -30;
        heC = 0;
        peC = -5;

        if (ASCC == true) {
          System.out.println("Economy:       " + eceC);
          System.out.println("Environment:   " + eneC);
          System.out.println("Health:        " + heC);
          System.out.println("People:        " + peC);
          System.out.println("");
        } else {
          System.out.println("Environment: Large");
          System.out.println("People: Small");
          System.out.println("");
        }

        sure = SURE();
      } else {
        eceC = 0;
        eneC = -5;
        heC = 0;
        peC = -30;

        if (ASCC == true) {
          System.out.println("Economy:       " + eceC);
          System.out.println("Environment:   " + eneC);
          System.out.println("Health:        " + heC);
          System.out.println("People:        " + peC);
          System.out.println("");
        } else {
          System.out.println("Environment: Small");
          System.out.println("People: Large");
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
      System.out.println("Invasive animals have been seen near city borders, and health officials fear that they may carry diseases similar to covid. Will you give the order to exterminate them?");
      System.out.println("");
      C = input.nextInt();
      eceC = 0;
      eneC = 0;
      heC = 0;
      peC = 0;
      
      System.out.println("");
      if (C == 1) {
        eceC = 0;
        eneC = -25;
        heC = 15;
        peC = 15;

        if (ASCC == true) {
          System.out.println("Economy:       " + eceC);
          System.out.println("Environment:   " + eneC);
          System.out.println("Health:        " + heC);
          System.out.println("People:        " + peC);
          System.out.println("");
        } else {
          System.out.println("Environment: Large");
          System.out.println("Health: Small");
          System.out.println("People: Small");
          System.out.println("");
        }

        sure = SURE();
      } else {
        eceC = 0;
        eneC = 15;
        heC = -10;
        peC = 5;

        if (ASCC == true) {
          System.out.println("Economy:       " + eceC);
          System.out.println("Environment:   " + eneC);
          System.out.println("Health:        " + heC);
          System.out.println("People:        " + peC);
          System.out.println("");
        } else {
          System.out.println("Environment: Small");
          System.out.println("Health: Small");
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
      System.out.println("The minister of health urges you to preserve some native plants in green houses. Will you heed to his words");
      System.out.println("");
      C = input.nextInt();
      eceC = 0;
      eneC = 0;
      heC = 0;
      peC = 0;
      
      System.out.println("");
      if (C == 1) {
        eceC = -10;
        eneC = -10;
        heC = 0;
        peC = 10;

        if (ASCC == true) {
          System.out.println("Economy:       " + eceC);
          System.out.println("Environment:   " + eneC);
          System.out.println("Health:        " + heC);
          System.out.println("People:        " + peC);
          System.out.println("");
        } else {
          System.out.println("Economy: Small");
          System.out.println("Environment: Small");
          System.out.println("People: Small");
          System.out.println("");
        }

        Ghouse = true;
        sure = SURE();
      } else {
        eceC = 5;
        eneC = 0;
        heC = 0;
        peC = -5;

        if (ASCC == true) {
          System.out.println("Economy:       " + eceC);
          System.out.println("Environment:   " + eneC);
          System.out.println("Health:        " + heC);
          System.out.println("People:        " + peC);
          System.out.println("");
        } else {
          System.out.println("Economy: Small");
          System.out.println("People: Small");
          System.out.println("");
        }
        
        Ghouse = false;
        sure = SURE();
      }
    }
  }//method end55555
}