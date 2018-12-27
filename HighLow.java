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
public class HighLow {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number between 1 and 99:");
        int input = sc.nextInt();
        int count = 1;
        int num = (int)(Math.random()*100);
        while(input!=num)
        {
            if(input<num)
                System.out.println("Higher");
            else
                System.out.println("Lower");
            count++;
            input = sc.nextInt();
        }
        System.out.println("Woohoo! You guessed it right in "+count+" trials");
    }
}
