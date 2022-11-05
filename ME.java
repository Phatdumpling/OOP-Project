//Part of event package
package event;

import java.util.Scanner;

public class ME {
  //The first 4 instance variables represents the change of each value that will partake during the respective method(eceC change in Economy, eneC change in Environment, heC change in Health, peC change in People)
  //The boolean ASCC is taken in when the object is constucted and will represent the all sight value within the other classes
  public int eceC;
  public int eneC;
  public int heC;
  public int peC;
  public boolean ASCC;

  //ME constuctor will constuct each instance variable
  public ME(int ECEC, int ENEC, int HEC, int PEC, boolean ASC1) {
    this();
    eneC = ECEC;
    eneC = ENEC;
    heC = HEC;
    peC = PEC;
    ASCC = ASC1;
  }

  public ME () {
  }


  //SURE method will Ask the user if they want to lock in their decision during an event method. If they say yes a second time it will go through with the event method and we will go back to the main method. Returns boolean for the while loop in event method.
  //The reason the sure method exists is to help with showing the changes of the 4 primary values Economy, Environment, Health, and People. Similar to lapse: a forgotten world if you drag the card to one side and do not let go it will show a large circle or a big circle which represents the impact that choice will have on each stat
  public boolean SURE() {
    Scanner input = new Scanner(System.in);
    int C;
    String decoy;
    System.out.println("Are you sure?");
    System.out.println("");
    C = input.nextInt();
    System.out.println("");
    if (C == 1) {
      return true;
    } else {
      return false;
    }
  }
}