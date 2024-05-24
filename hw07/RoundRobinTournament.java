public class RoundRobinTournament extends RPSTournament {

   /**
	 * Plays each RPS player verses each other
    * In a round robin tournament style
	 */
   public void play() {
      int i,j;
      for (i=0; i<numPlayers; i++) {
         for (j=0; j<numPlayers; j++) {
            if (i!=j)
               players[i].fight(players[j]);
            }
         }
   }
}
