public abstract class RPSTournament extends RPSPlayerContainer {

   /**
    * Constructor of RPSTournament that calls the parent class constructor
    */
   public RPSTournament() {
      super();
   }

   /**
    * Sorts the array of players using a four line sort
    */
   public void sort() {
      int i, j;
      RPSPlayer temp;
      for (i=0; i<numPlayers-1; i++) {
         for (j=i+1; j<numPlayers; j++){
            if (players[j].compareTo(players[i]) > 0) {
               temp = players[i];
               players[i] = players[j];
               players[j] = temp;
            }
         }
      }
   }

   public abstract void play();

}
