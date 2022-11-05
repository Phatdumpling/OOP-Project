package event;

import java.util.Scanner;

public class PE extends ME{
  public static boolean Security = false;

  public PE(int ECEC, int ENEC, int HEC, int PEC, boolean ASC1) {
    super(ECEC, ENEC, HEC,PEC, ASC1);
  }

  public PE () {
  }

  public void E1() {
    Scanner input = new Scanner(System.in);
    int C;
    boolean sure = false;
    String decoy;
    
    while (sure == false) {
      System.out.println("Would you like to join in the press conference tommorow to discuss your plans with the community?");
      System.out.println("");
      C = input.nextInt();
      eceC = 0;
      eneC = 0;
      heC = 0;
      peC = 0;
      
      System.out.println("");
      if (C == 1) {
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
      } else {
        eceC = 0;
        eneC = 0;
        heC = 0;
        peC = -20;

        if (ASCC == true) {
          System.out.println("Economy:       " + eceC);
          System.out.println("Environment:   " + eneC);
          System.out.println("Health:        " + heC);
          System.out.println("People:        " + peC);
          System.out.println("");
        } else {
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
      System.out.println("Because of Covid many business and companies are cutting losses and laying off workers, thus many people have lost a source of income. Do you wish to propose a relief program and support food banks?");
      System.out.println("");
      C = input.nextInt();
      eceC = 0;
      eneC = 0;
      heC = 0;
      peC = 0;
      
      System.out.println("");
      if (C == 1) {
        eceC = -40;
        eneC = 0;
        heC = 15;
        peC = 35;

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
        eceC = 20;
        eneC = 0;
        heC = -5;
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
  }//method end2222222

  public void E3() {
    Scanner input = new Scanner(System.in);
    int C;
    boolean sure = false;
    String decoy;
    
    while (sure == false) {
      System.out.println("Schools networks are having a tough time coping with changes would you like to direct more resources?");
      System.out.println("");
      C = input.nextInt();
      eceC = 0;
      eneC = 0;
      heC = 0;
      peC = 0;
      
      System.out.println("");
      if (C == 1) {
        eceC = -5;
        eneC = -5;
        heC = -5;
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
          System.out.println("Health: Small");
          System.out.println("People: Small");
          System.out.println("");
        }

        sure = SURE();
      } else {
        eceC = 0;
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
      System.out.println("Would you like to direct more check up tools to better detect covid cases to major institutions?");
      System.out.println("");
      C = input.nextInt();
      eceC = 0;
      eneC = 0;
      heC = 0;
      peC = 0;
      
      System.out.println("");
      if (C == 1) {
        eceC = -15;
        eneC = -15;
        heC = 15;
        peC = 20;

        if (ASCC == true) {
          System.out.println("Economy:       " + eceC);
          System.out.println("Environment:   " + eneC);
          System.out.println("Health:        " + heC);
          System.out.println("People:        " + peC);
          System.out.println("");
        } else {
          System.out.println("Economy: Small");
          System.out.println("Environment: Small");
          System.out.println("Health: Small");
          System.out.println("People: Large");
          System.out.println("");
        }

        sure = SURE();
      } else {
        eceC = 20;
        eneC = 0;
        heC = -10;
        peC = -5;

        if (ASCC == true) {
          System.out.println("Economy:       " + eceC);
          System.out.println("Environment:   " + eneC);
          System.out.println("Health:        " + heC);
          System.out.println("People:        " + peC);
          System.out.println("");
        } else {
          System.out.println("Economy: Large");
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
      System.out.println("Your personal body guard recommends you set up a personal protection unit, will you do so?");
      System.out.println("");
      C = input.nextInt();
      eceC = 0;
      eneC = 0;
      heC = 0;
      peC = 0;
      
      System.out.println("");
      if (C == 1) {
        eceC = 0;
        eneC = 0;
        heC = -10;
        peC = -15;
        Security = true;

        if (ASCC == true) {
          System.out.println("Economy:       " + eceC);
          System.out.println("Environment:   " + eneC);
          System.out.println("Health:        " + heC);
          System.out.println("People:        " + peC);
          System.out.println("");
        } else {
          System.out.println("Health: Small");
          System.out.println("People: Small");
          System.out.println("");
        }

        sure = SURE();
      } else {
        eceC = 0;
        eneC = 0;
        heC = 0;
        peC = 0;
        Security = false;

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
  }//method end55555
}
//refugees