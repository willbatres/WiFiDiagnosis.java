import java.util.Scanner;

/*
 * Class: CMSC203 
 * Instructor: Khandan Monsh
 * Due: 2/04/2021
 * Description: A program to troubleshoot Wifi connection 
 * errors by prompting the user to enter yes or no input
 *  and trying different steps to resolve the issue.
 * Platform/compiler: Java compiler
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: William Batres
*/

public class WiFiDiagnosis {

	public static void main(String[] args) {
		
		Scanner userYes_or_No = new Scanner(System.in);
		int decisionTerminator = 1;
		
		
		System.out.println("If you have a problem with internet "
				+"connectivity, this WiFi Diagnosis might work.");
		System.out.println("First step: reboot your computer");
		System.out.println("Are you able to connect "
				+ "with the internet? (yes or no)");
		
		String userDecision;
		userDecision = userYes_or_No.nextLine();
		switch (userDecision) 
		{
			case "Yes":
			case "yes":
			{
				System.out.println("Rebooting your computer" +
						" seemed to work");
				decisionTerminator = 0;
				break;
			
			}
			case "No":
			case "no":
			{
				System.out.println("Second step: reboot your router" +
					" Now are you able to connect with internet?"
					+ " (yes or no)");
				break;
			
			}
		}
		if(decisionTerminator == 1)
		{
			userDecision = userYes_or_No.nextLine();
			switch (userDecision) 
			{
				case "Yes":
				case "yes":
				{
					System.out.println("Rebooting your router" +
						" seemed to work");
					decisionTerminator = 0;
					break;
			
				}
				case "No":
				case "no":
				{
					System.out.println("Third step: Make sure the cables connecting" +
							" connecting the router are firmly plugged in and?"
							+ " power is getting to the router");
					System.out.println("Now are you able to connect with" +
								"with internet?");
					break;
			
				}
			}
			
		}
		if(decisionTerminator == 1)
		{
			userDecision = userYes_or_No.nextLine();
			switch (userDecision) 
			{
				case "Yes":
				case "yes":
				{
					System.out.println("Connecting the cables" +
						" seemed to work");
					decisionTerminator = 0;
					break;
			
				}
				case "No":
				case "no":
				{
					System.out.println("Fourth step: Move the computer closer" +
							" to the router and try to connect");
					System.out.println("Now are you able to connect with" +
							"with internet?");
					break;
			
				}
			}
		if(decisionTerminator == 1)
		{
			userDecision = userYes_or_No.nextLine();
			switch (userDecision) 
			{
				case "Yes":
				case "yes":
				{
					System.out.println("Moving the computer closer" +
							" seemed to work");
					decisionTerminator = 0;
					break;
				
				}
				case "No":
				case "no":
				{
					System.out.println("Fifth step: Contact your ISP");
					break;
				
				}
			}
		}

	}
		
		
	}

}
