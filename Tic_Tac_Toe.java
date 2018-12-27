/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgnew;
import java.util.Scanner;
/**
 *
 * @author ATUL JAIN
 */
public class Tic_Tac_Toe 
{
    static final int X=1, O=-1, EMPTY=0;
    static int board[][] = new int[3][3];
    static int player;
    
    public static void main(String args[])
    {
        clearBoard();
        Scanner sc = new Scanner(System.in);
        System.out.println("****Welcome****\nPlayer1 is X\nPlayer2 is O\nEnter index number to fill a cell");
        int row=0, col=0;
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                if(board[i][j]==0)
                {
                    row = sc.nextInt();
                    col = sc.nextInt(); 
                    mark(row, col);
                }
                if(win(board[row][col]))
                {
                    System.out.println(" is Winner");
                    System.exit(0);
                }
            }
        }
    }
    public static void clearBoard()
    {
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
                board[i][j]=EMPTY;
            player = X;
        }
    }
    public static boolean win(int check)
    {
        return( board[0][0] + board[0][1] + board[0][2]==check*3||
                board[1][0] + board[1][1] + board[1][2]==check*3||
                board[2][0] + board[2][1] + board[2][2]==check*3||
                board[0][0] + board[1][1] + board[2][2]==check*3||
                board[2][0] + board[1][1] + board[0][2]==check*3);
    }
    public static void mark(int a, int b)
    {
        if(a>2 || b>2 || a<0 || b<0)
        {
            System.out.println("Invalid Index");
        }
        else if(board[a][b]!=EMPTY)
        {
            System.out.println("Space already filled");
        }
        else
        {
            board[a][b] = player;
            player =- player;
            String x = "";
            for(int i=0; i<3; i++)
            {
                for(int j=0; j<3; j++)
                {
                    switch(board[i][j])
                    {
                        case 1: x = "X";
                        break;
                        case -1: x = "O";
                        break;
                        case 0: x = " ";
                        break;
                    }
                    if(j==2)
                        System.out.print(x);
                    else
                        System.out.print(x+" | ");
                }
             if(i!=2)
                System.out.println("\n----------");
            }
        }
    }
    
}
