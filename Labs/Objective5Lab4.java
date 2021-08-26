import java.util.Scanner;

public class Objective5Lab4 {
  public static void main(String[] args) {
    int userNum;
    Scanner kb = new Scanner(System.in);

    System.out.println("Please enter a whole number:");
    userNum = kb.nextInt();

    if((userNum % 2) == 0) {
      System.out.println("The number " + userNum + " is even.");
    }
    else {
      System.out.println("The number " + userNum + " is odd.");
    }
  }
}
