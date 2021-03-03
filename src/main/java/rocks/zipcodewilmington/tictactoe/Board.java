package rocks.zipcodewilmington.tictactoe;

import java.util.Arrays;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    Character[][] tempBoard;
    public Board(Character[][] matrix) {
    this.tempBoard = matrix;
    }

    public Boolean isInFavorOfX() {

        if(this.tempBoard[0][0] == 'X' && this.tempBoard[0][0] == this.tempBoard[0][1] && this.tempBoard[0][1] == this.tempBoard[0][2]) {
            return true;
        } else if (this.tempBoard[1][0] == 'X' && this.tempBoard[1][0] == this.tempBoard[1][1] && this.tempBoard[1][1] == this.tempBoard[1][2]) {
            return true;
        } else if (this.tempBoard[2][0] == 'X' && this.tempBoard[2][0] == this.tempBoard[2][1] && this.tempBoard[2][1] == this.tempBoard[2][2]) {
            return true;
        } else if (this.tempBoard[0][0] == 'X' && this.tempBoard[0][0] == this.tempBoard[1][0] && this.tempBoard[1][0] == this.tempBoard[2][0]) {
            return true;
        } else if (this.tempBoard[0][1] == 'X' && this.tempBoard[0][1] == this.tempBoard[1][1] && this.tempBoard[1][1] == this.tempBoard[2][1]) {
            return true;
        } else if (this.tempBoard[0][2] == 'X' && this.tempBoard[0][2] == this.tempBoard[1][2] && this.tempBoard[1][2] == this.tempBoard[2][2]) {
            return true;
        } else if (this.tempBoard[0][0] == 'X' && this.tempBoard[0][0] == this.tempBoard[1][1] && this.tempBoard[1][1] == this.tempBoard[2][2]) {
            return true;
        } else if (this.tempBoard[0][2] == 'X' && this.tempBoard[0][2] == this.tempBoard[1][1] && this.tempBoard[1][1] == this.tempBoard[2][0]) {
            return true;
        } else return false;

    }

    public Boolean isInFavorOfO() {

        if(this.tempBoard[0][0] == 'O' && this.tempBoard[0][0] == this.tempBoard[0][1] && this.tempBoard[0][1] == this.tempBoard[0][2]) {
            return true;
        } else if (this.tempBoard[1][0] == 'O' && this.tempBoard[1][0] == this.tempBoard[1][1] && this.tempBoard[1][1] == this.tempBoard[1][2]) {
            return true;
        } else if (this.tempBoard[2][0] == 'O' && this.tempBoard[2][0] == this.tempBoard[2][1] && this.tempBoard[2][1] == this.tempBoard[2][2]) {
            return true;
        } else if (this.tempBoard[0][0] == 'O' && this.tempBoard[0][0] == this.tempBoard[1][0] && this.tempBoard[1][0] == this.tempBoard[2][0]) {
            return true;
        } else if (this.tempBoard[0][1] == 'O' && this.tempBoard[0][1] == this.tempBoard[1][1] && this.tempBoard[1][1] == this.tempBoard[2][1]) {
            return true;
        } else if (this.tempBoard[0][2] == 'O' && this.tempBoard[0][2] == this.tempBoard[1][2] && this.tempBoard[1][2] == this.tempBoard[2][2]) {
            return true;
        } else if (this.tempBoard[0][0] == 'O' && this.tempBoard[0][0] == this.tempBoard[1][1] && this.tempBoard[1][1] == this.tempBoard[2][2]) {
            return true;
        } else if (this.tempBoard[0][2] == 'O' && this.tempBoard[0][2] == this.tempBoard[1][1] && this.tempBoard[1][1] == this.tempBoard[2][0]) {
            return true;
        } else return false;
    }

    public Boolean isTie() {

        if(this.tempBoard[0][0] == this.tempBoard[0][1] && this.tempBoard[0][1] == this.tempBoard[0][2]) {
            return false;
        } else if (this.tempBoard[1][0] == this.tempBoard[1][1] && this.tempBoard[1][1] == this.tempBoard[1][2]) {
            return false;
        } else if (this.tempBoard[2][0] == this.tempBoard[2][1] && this.tempBoard[2][1] == this.tempBoard[2][2]) {
            return false;
        } else if (this.tempBoard[0][0] == this.tempBoard[1][0] && this.tempBoard[1][0] == this.tempBoard[2][0]) {
            return false;
        } else if (this.tempBoard[0][1] == this.tempBoard[1][1] && this.tempBoard[1][1] == this.tempBoard[2][1]) {
            return false;
        } else if (this.tempBoard[0][2] == this.tempBoard[1][2] && this.tempBoard[1][2] == this.tempBoard[2][2]) {
            return false;
        } else if (this.tempBoard[0][0] == this.tempBoard[1][1] && this.tempBoard[1][1] == this.tempBoard[2][2]) {
            return false;
        } else if (this.tempBoard[0][2] == this.tempBoard[1][1] && this.tempBoard[1][1] == this.tempBoard[2][0]) {
            return false;
        } else return true;
    }

    public String getWinner() {
        if(isInFavorOfX() == true) {
            return "X";
        } else if(isInFavorOfO() == true) {
            return "O";
        } else return "";
    }

}
