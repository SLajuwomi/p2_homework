/**
 * A Rock, Paper, Scissors player container
 *
 * @author  Stephen Lajuwomi
 * @version for P2
 *
*/

public class RPSPlayerContainer {
   protected RPSPlayer [] players;
   protected int numPlayers;


   public RPSPlayerContainer() {
      players = new RPSPlayer[100];
      numPlayers=0;
   }

   /**
	 * Adds a new Rock Paper Scissors player
    * 
    * @param p A RPSplayer object
    * @return The new number of players in array
	 */
   public int add(RPSPlayer p) {
      players[numPlayers] = p;
      return numPlayers++;
   }

   /**
	 * Displays the players and their wins and losses
    */
   public void display() {
      int i;
      System.out.printf("%-15s %7s %7s\n","ID", "PLAYER", "WINS", "LOSSES");
      System.out.println("------------------------------------------------");
      for (i=0; i<numPlayers; i++) {
         System.out.printf("%-15s %7d %7d\n",players[i].name,players[i].wins,players[i].losses);
      }
   }
}