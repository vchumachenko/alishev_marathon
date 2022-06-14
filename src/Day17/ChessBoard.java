package Day17;

import java.util.Arrays;

public class ChessBoard {
    private static ChessPiece[][] array;


    public ChessBoard(ChessPiece [][] array) {
        this.array = array;
    }

    public static void print(){
        for (ChessPiece[] chessPieces : array) {
            for (ChessPiece chessPiece : chessPieces) {
                System.out.print(chessPiece.toString());
            }
            System.out.println();
        }


    }
}
