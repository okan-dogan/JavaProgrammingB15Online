package repl_it;
/*
Given a 8x8 two-dimensional array of strings named chessboard.
Initialize values inside an array accordingly to the chess board.
So first element in the array, chessboard[0][0] should have a value "1a",
and last element in the array, chessboard[7][7] should have a value "8h".
 */

import java.util.Arrays;

public class Repl_It_171_2D_Arrays_Chess_Board {

    public static void main(String[] args) {
        String[][] chessBoard = new String[8][8];
        //WRITE YOUR CODE HERE

        String str = "abcdefgh";
        for (int i=0; i<8 ;i++){
            for (int j=0; j<8 ;j++){
                chessBoard[i][j]=(i+1)+""+str.charAt(j);
            }
        }

        //DO NOT CHANGE
        System.out.println(Arrays.deepToString(chessBoard));
    }
}




