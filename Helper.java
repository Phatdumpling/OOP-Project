//Part of menu package
package menu;

import java.util.Scanner;

public class Helper {
  //4 main values to check
  private int EC;
  private int EN;
  private int H;
  private int P;

  //Main values are constructed when creating a helper object in PI constructor
  public Helper(int EC, int EN, int H, int P) {
    this.EC = EC;
    this.EN = EN;
    this.H = H;
    this.P = P;
  }

  //This method gives advice to user if a value goes too low and tells the user to watch out for that value
  public String advice() {
    String advice = "";
    if (EC < 40) {
      advice += "\nBe careful of your money you are at risk of going bankrupt!";
    }

    if (EN < 40) {
      advice += "\nYour country is going less green by the day take care of your country's environment.";
    }

    if (H < 40) {
      advice += "\nMany of your people are getting sick put more effort into healthcare.";
    }

    if (P < 40) {
      advice += "\nYou are losing the favor of the people by the day find a way to please the populus.";
    }

    advice += "\n";
    return advice;
  }

  //I dont know why I made toString return advice but ok it works so im keeping it here
  public String toString() {
    return advice();
  }
}