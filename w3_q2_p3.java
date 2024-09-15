package week3;

public class w3_q2_p3
{
	public static void main(String args[])
	{
		int target_num = (int)(Math.random()*10);
		System.out.println(target_num);
		System.out.println("Starting Guessing Game: Guess the number");
		w3_q2_p2 game1 = new w3_q2_p2();
		game1.start(target_num);
	}//main
}//game launcher
