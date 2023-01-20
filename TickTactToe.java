package sdf;

import java.util.Arrays;

public class TickTactToe {

    
    public void printBoard(String[] board){
        
        System.out.println(" --- --- --- ");
        System.out.printf("| %s | %s | %s |\n",board[0],board[1],board[2]);
        System.out.println(" --- --- ---");
        System.out.printf("| %s | %s | %s |\n",board[3],board[4],board[5]);
        System.out.println(" --- --- ---");
        System.out.printf("| %s | %s | %s |\n",board[6],board[7],board[8]);
        System.out.println(" --- --- ---");
        
    }

    public String checkWinner(String[] board){

        String line ="";

        String winner="";

        int i=0;
        while(i<8){

            switch(i){
                case 0: line = board[0] + board[1] + board[2];
                break;

                case 1: line = board[3] + board[4] + board[5];
                break;
                
                case 2: line = board[6] + board[7] + board[8];
                break;

                case 3: line = board[0] + board[3] + board[6];
                break;

                case 4: line = board[1] + board[4] + board[7];
                break;

                case 5: line = board[2] + board[5] + board[8];
                break;

                case 6: line = board[0] + board[4] + board[8];
                break;
                
                case 7: line = board[2] + board[4] + board[6];
                break;
            }
            i++;
            
            if(line.equals("XXX")){
                winner = "x";
                i = 9 ;
            }
            else if(line.equals("OOO")){
                winner ="O";
                i = 9;
            }
            else{
                for(int j =0;j<9;j++){
                    if(Arrays.asList(board).contains(String.valueOf(j+1)))
                    break;
                    else if(j==8){
                        winner = "draw";
                    }
                }
            }
        }

        return winner;
    }
}
