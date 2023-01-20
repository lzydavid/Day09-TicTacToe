package sdf;

import java.util.Scanner;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }
    public static void main(String[] args) {
        
        String player = "X";
        String winner = "";

        
        String[] tttboard = new String[9]; 
        for(int i=0;i<9;i++){
            tttboard[i] = String.valueOf(i+1);
        }

        TickTactToe ttt = new TickTactToe();
        ttt.printBoard(tttboard);

        Scanner scanner = new Scanner(System.in);

        while(winner == ""){
            
            System.out.println("TicTackToe Game"); 
            System.out.println("---------------"); 
            System.out.println(player + " will play now");
        
            
            Integer input;

            input = scanner.nextInt();

            if((input>=1)&&(input<10)){

            }
            else{
                System.out.println("Invalid input: Only number 1 to 9 is allowed.");
                continue;
            }

            if((tttboard[input-1]).equals(String.valueOf(input))){
                tttboard[input-1] = player;

                if(player.equalsIgnoreCase("X")){
                    player = "O";
                }
                else{
                    player = "X";
                }
            }
            else{
                System.out.println("Position already taken up. Please enter another position number");
            }

            ttt.printBoard(tttboard);
            winner = ttt.checkWinner(tttboard);

            if(winner.equalsIgnoreCase("draw")){
                System.out.println("Its a "+ winner);
            }
            else{
                System.out.println("The winner of this game is "+ winner);
            }
        }

        scanner.close();
    }
}
