import messages.*;
import phones.*;
import storage.*;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args)
	{
		
		
		Message messages[] = new Message[2];
		Scanner input = new Scanner(System.in);
		
		//Create TextMessage and add it to message array 
		System.out.println("Enter Information for a TextMessage");
		messages[0] = new TextMessage();
		messages[0].setData(input.next());
		
		// Create photo message and add it to message array
		System.out.println("Enter Information for a PhotoMessage");
		messages[1] = new PhotoMessage();
		messages[1].setData(input.next());
		
		input.close(); // Close Scanner to avoid memory leaks
		
		Android Galaxyj7 = new Android();
		
		//Sending all messages from collections using android send method 
		for(int i=0;i<messages.length;i++)
		{
			Galaxyj7.send(messages[i]);
		}
		
		//Emptying Message collection
		for(int i=0;i<messages.length;i++)
		{
			messages[i] = null;
		}
		
		Galaxyj7.viewAllMessages();
	}

}
