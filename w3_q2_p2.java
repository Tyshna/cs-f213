package week3;

import java.util.Scanner;
public class w3_q2_p2
{
	w3_q2_p1 p1 = new w3_q2_p1();
	w3_q2_p1 p2 = new w3_q2_p1();
	w3_q2_p1 p3 = new w3_q2_p1();
	public void start(int target)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose player. Type 1,2 or 3 to choose.");
		int ch = sc.nextInt();
		switch(ch)
		{
		case 1:
		{
			System.out.println("Player 1 chosen");
			p1.guess();
			for(int i=0;i<3;i++)
			{
				if((p1.num!=target) && i<3)
				{
					System.out.println("Incorrect guess. Guess again.");
					p1.guess();					
				}//if
				else if(i>=3)
				{
					System.out.println("Game Lost");
					System.exit(0);
				}//else
			}//for
					System.out.println("Yay! Guess is correct");
			break;
		}//case 1
		case 2:
		{
			System.out.println("Player 2 chosen");
			p2.guess();
			for(int i=0;i<3;i++)
			{
				if((p2.num!=target) && i<3)
				{
					System.out.println("Incorrect guess. Guess again.");
					p2.guess();					
				}//if
				else if((i>=2) && p2.num!=target)
				{
					System.out.println("Game Lost");
					System.exit(0);
				}//else
			}//for
					System.out.println("Yay! Guess is correct");
			break;
		}//case 2
		case 3:
		{
			System.out.println("Player 3 chosen");
			p3.guess();
			for(int i=0;i<3;i++)
			{
				if((p3.num!=target) && i<3)
				{
					System.out.println("Incorrect guess. Guess again.");
					p3.guess();					
				}//if
				else if(i>=3)
				{
					System.out.println("Game Lost");
					System.exit(0);
				}//else
			}//for
					System.out.println("Yay! Guess is correct");
			break;
		}//case 3
		}//switch
		sc.close();
	}//start
}//guess_game