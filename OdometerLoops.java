/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odometerloops;
import java.util.Scanner;
/**
 *
 * @author kendrabooker
 */
public class OdometerLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception
           
	{
             Scanner ky = new Scanner(System.in);
             int userInput;
             System.out.print("Which base (2 - 10): ");
             userInput = ky.nextInt();
             
		for ( int thous=userInput; thous<10; thous++ )
		{
			for ( int hund=userInput; hund<10; hund++ )
			
				for ( int tens=userInput; tens<10; tens++ )
				
					for ( int ones=userInput; ones<10; ones++ )
					
						System.out.println( " " + thous + "" + hund + "" + tens + "" + ones + "\r" );
						Thread.sleep(10);
					
				
			
		}

		System.out.println();
	}
}