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
public class Dice {
    public static void one(){
    System.out.println("-------"+"\n"+"|     |"+"\n"+"|  *  |"+"\n"+"|     |"+"\n"+"-------");
    }
    public static void two(){
    System.out.println("-------"+"\n"+"| *   |"+"\n"+"|     |"+"\n"+"|   * |"+"\n"+"-------");
    }
    public static void three(){
    System.out.println("-------"+"\n"+"| *   |"+"\n"+"|  *  |"+"\n"+"|   * |"+"\n"+"-------");
    }
    public static void four(){
    System.out.println("-------"+"\n"+"| * * |"+"\n"+"|     |"+"\n"+"| * * |"+"\n"+"-------");
    }
    public static void five(){
    System.out.println("-------"+"\n"+"| * * |"+"\n"+"|  *  |"+"\n"+"| * * |"+"\n"+"-------");
    }
    public static void six(){
    System.out.println("-------"+"\n"+"| * * |"+"\n"+"| * * |"+" \n"+"| * * |"+"\n"+"-------");
    }
    public static void main(String args[]){
        System.out.println("******Welcome******\n If you get a number greater than that of computer than you win\nPress any number to Start\nOR\nPress 0 to quit");
        
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        if(p==0)
        {
            System.exit(0);
        }
        else
        {
            int a=0;
            for(int i=0;i>=0;i++)
            {
                a = (int)(Math.random()*10);
                if(a>=1&&a<=6)
                    break;
            }
            System.out.println("You:");
            switch(a)
            {
                case 1 : one();
                break;
                case 2 : two();
                break;
                case 3 : three();
                break;
                case 4 : four();
                break;
                case 5 : five();
                break;
                case 6 : six();
                break;
            }
            int b=0;
            for(int i=0;i>=0;i++)
            {
                b = (int)(Math.random()*10);
                if(b>=1&&b<=6)
                    break;
            }
            System.out.println("Computer:");
            switch(b)
            {
                case 1 : one();
                break;
                case 2 : two();
                break;
                case 3 : three();
                break;
                case 4 : four();
                break;
                case 5 : five();
                break;
                case 6 : six();
                break;
            }
            if(a>b)
                System.out.println("Woohoo! You won");
            else if(b>a)
                System.out.println("Alas! You Lost");
            else
                System.out.println("It's tie");
        }
    }
}
