package sdf;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }
    public static void main(String[] args) {
        

        String[] tttboard = new String[9]; 
        for(int i=0;i<9;i++){
            tttboard[i] = String.valueOf(i+1);
        }

        TickTactToe ttt = new TickTactToe();
        ttt.printBoard(tttboard);

        System.out.println("TicTackToe Game"); 

    }
}
