import java.util.Scanner;
import java.util.Random;

class RPS {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        String[] rps = {"r","p","s"};
        String CompMove = rps[new Random().nextInt(rps.length)];
        
        String playerMove;

        while(true){
            System.out.print("Enter your move:");
            playerMove = input.nextLine();
            System.out.println("Computer Move "+ CompMove);

            if(playerMove.equals("r")||playerMove.equals("p")||playerMove.equals("s")){
                break;
            }else{
                System.out.print("please enter valid move!");
            }
        }

        if(playerMove.equals(CompMove)){
            System.out.println("the game is tie!");
        }else if(playerMove.equals( "r")){
            if(CompMove.equals("p")){
                System.out.println("you Lose!");
            }else if(CompMove.equals("s")){
                System.out.println("You Won");
            }
        }else if(playerMove.equals("p")){
            if(CompMove.equals("s")){
                System.out.println("You lose");
            }else if(CompMove.equals("r")){
                System.out.println("You Won");
            }
        }else if(playerMove.equals("s")){
            if(CompMove.equals("r")){
                System.out.println("You Lose!");
            }else if(CompMove.equals("p")){
                System.out.println("You WON");
            }
        }


    }
}