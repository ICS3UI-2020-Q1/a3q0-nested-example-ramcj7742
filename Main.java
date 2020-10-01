import java.util.Scanner;
/**
 * Example program for nested statements
 * @author Jaden Ramcharan
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Creates scanner for user input
    Scanner input = new Scanner(System.in);

    //switch case example
    //get the user choice between 1 and 5
    System.out.println("please make a selection (1-5)");
    int choice = input.nextInt();
    switch(choice){
      case 1:
       System.out.println("Here is your chocolate bar");
       break;
      case 2:
       System.out.println("Here are your Skittles");
       break;
      case 3:
       System.out.println("Here are your M&M's");
       break;
      case 4:
       System.out.println("Here are your chips");
      default:
       System.out.println("Invalid choice");

    }


    //nested statements example
    //Asks user if animal has feathers
    System.out.println("Does the animal have feathers? (yes/no)");
    String featherAnswer = input.nextLine();

    //check to see the feather status
    if(featherAnswer.equals("yes")){
      //get feather colour
      System.out.println("What colour are the feathers? (red/blue)");
      String featherColour = input.nextLine();

      //determine what type of bird
      if(featherColour.equals("blue")){
        System.out.println("That is a blue jay");
      }else if(featherColour.equals("red")){
        System.out.println("That is a cardinal");
      }

      //if the user answered no
    }else{

    }
    
  }
}
