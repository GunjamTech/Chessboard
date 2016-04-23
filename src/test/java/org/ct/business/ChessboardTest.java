package org.ct.business;

import org.junit.Before;
import org.junit.Test;


public class ChessboardTest {

    PrintChessBoardRows chessboard;
    @Before
    public void setup () {
chessboard= new PrintChessBoardRows();
    }

    @Test(expected=IllegalArgumentException.class)
    public void ShouldThrowExceptionWhenWrongNumberOfRows() throws Exception {

       chessboard.printChessBoardRows("nnnP/PP");

    }
    @Test(expected=IllegalArgumentException.class)
    public void ShouldThrowExceptionWhenWrongNumberOfSquares() throws Exception {

        chessboard.printChessBoardRows("r1bk3r/p2pBpNp/n4n2/1p1NP2P/6P1/3P4/P1P1K3/q5b1bbbb");

    }

    @Test(expected=IllegalArgumentException.class)
    public void ShouldThrowExceptionWhenUnexpectedCharacter() throws Exception {

        chessboard.printChessBoardRows("3w4/7p/7p/7p/8/8/8/8");

    }

}