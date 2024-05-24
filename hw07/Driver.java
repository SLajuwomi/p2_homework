/**
 * A driver for a Rock Paper Scissors tournament
 *
 * @author  Stephen Lajuwomi
 * @version for P2
 *
*/

public class Driver
{
	public static void main(String [] args)
	{
		RoundRobinTournament players = new RoundRobinTournament();

		ComputerRPSPlayer a, b, c, d, e, f, g;
		
		a = new ComputerRPSPlayer("Mary Jo");
		b = new ComputerRPSPlayer("Jack");
		c = new ComputerRPSPlayer("Mike");
		d = new ComputerRPSPlayer("Suzanna");
		e = new ComputerRPSPlayer("Stephen");
		f = new ComputerRPSPlayer("Bronny");
		g = new ComputerRPSPlayer("Caison");

		players.add(a);
		players.add(b);
		players.add(c);
		players.add(d);
		players.add(e);
		players.add(f);
		players.add(g);

		System.out.println("0 is the code for "+RPSPlayer.translate(0));
		System.out.println("1 is the code for "+RPSPlayer.translate(1));
		System.out.println("2 is the code for "+RPSPlayer.translate(2));
		System.out.println("3 is the code for "+RPSPlayer.translate(3));
		System.out.println("---------------------------------");

		players.play();
		players.sort();
		players.display();
	}
}


