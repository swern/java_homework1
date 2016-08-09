public class Playstation{
  private String owner;
  private Game[] drive;

  public Playstation(String owner){
    this.owner = owner;
    this.drive = new Game[1];
  }

  public String getOwner(){
    return this.owner;
  }

  public int gameCount(){
    int count = 0;
    for(Game game : drive){
      if(game != null) {
        count++;
      }
    }
    return count;
  }

  public void play(Game game){
      if(driveFull()) return;
    int gameCount = gameCount();
    drive[gameCount] = game;
  }

  public boolean driveFull(){
    return gameCount() == drive.length;
  }

  public void ejectGame(){
    for(int i = 0; i < drive.length; i++){
      drive[i] = null;
    }
  }
}