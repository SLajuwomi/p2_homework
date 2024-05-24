import java.util.Scanner;

public class Driver
{
	public static void main(String [] args)
	{
		RPSPlayerContainer player = new RPSPlayerContainer();
		ComputerRPSPlayer a, c;
		HumanRPSPlayer b;
		a= new ComputerRPSPlayer("Stephen");
		b= new HumanRPSPlayer("John");
		c= new ComputerRPSPlayer("mark");
		player.add(a);
		player.add(b);
		player.add(c);
		player.display();

	// 	System.out.println("0 is the code for "+RPSPlayer.translate(0));
	// 	System.out.println("1 is the code for "+RPSPlayer.translate(1));
	// 	System.out.println("2 is the code for "+RPSPlayer.translate(2));
	// 	System.out.println("3 is the code for "+RPSPlayer.translate(3));
	// 	System.out.println("---------------------------------");



	// 	do {
	// 		a.fight(b);
	// 	} 
	// 	while ( (b.getWins() != 3) && (a.getWins() != 3) );

	// 	b.display();
	// 	a.display();

	// 	if (b.getWins() >= 3) 
	// 		System.out.println(b.getName()+" wins! (best three out of five)");
	// 	else
	// 		System.out.println(a.getName()+" wins! (best three out of five)");
	// }
}
}

