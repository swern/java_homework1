import static org.junit.Assert.assertEquals;
import org.junit.*;

public class PlaystationTest{
  Playstation playstation;
  Game game;

  @Before
  public void before(){
    playstation = new Playstation("Kearns");
    game = new Game("Blur");
  }

  @Test
  public void hasOwner(){
    assertEquals("Kearns", playstation.getOwner());
  }

  @Test 
  public void driveStartsEmpty(){
    assertEquals(0, playstation.gameCount());
  }

  @Test
  public void canPlayGame(){
    playstation.play(game);
    assertEquals(1, playstation.gameCount());
  }

  @Test
  public void driveIsFull(){
    for(int i = 0; i < 1; i++){
      playstation.play(game);
      assertEquals(true, playstation.driveFull());
    }
  }

  @Test
  public void shouldEmptyWhenEjected(){
    playstation.play(game);
    assertEquals(1, playstation.gameCount());
    playstation.ejectGame();
    assertEquals(0, playstation.gameCount());
  }
}