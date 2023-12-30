package game_project;
import java.util.Scanner;
public class Game {
	public Weapon pressButton()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the score: ");
		int score=sc.nextInt();
		if(score<=400)
		{
			System.out.println("knief is unlocked");
			Knief k=new Knief();sc.close();
			return k;
		}
		else if(score<=800)
		{
			System.out.println("You got the both Knief and Gun");
			System.out.println("Press 1 for Knief Or press 2 for gun");
			int x=sc.nextInt();
			sc.close();
			switch(x)
			{
			case 1:
				System.out.println("You have selected 1 so you got the knief");
				Knief k=new Knief();
				return k;
			case 2:
				System.out.println("You have selected 2 so you got the gun");
				Gun g=new Gun    ();
				return g;
			default:
				System.out.println("Invalid Input");
				return null;
			}
		}
		else
		{
			System.out.println("You got all Knief, Gun & Bomb");
			System.out.println("Press 1 for Knief, 2 for Gun & 3 for Bomb");
			int x=sc.nextInt();
			sc.close();
			switch(x)
			{
			case 1:
				System.out.println("You unlocked the knief");
				Knief k=new Knief();
				return k;
			case 2:
				System.out.println("You unlocked the Gun");
				Gun g=new Gun();
				return g;
			case 3:
				System.out.println("You unlocked the Bomb");
				Bomb b=new Bomb();
				return b;
			default:
				System.out.println("Invalid input");
				return null;
			}
		}
	}
}
