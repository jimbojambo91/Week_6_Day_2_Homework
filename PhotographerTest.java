import static org.junit.Assert.*;
import org.junit.*;

public class PhotographerTest{
  Photographer photographer;
  DigitalCamera digitalCamera;
  AnalogueCamera analogueCamera;

  @Before 
  public void before() {
    photographer = new Photographer();
    digitalCamera = new DigitalCamera("Nikon 34T"); 
  }

  @Test
  public void camerasStartsEmpty(){
    assertEquals(0, photographer.printableCount());
  }

  @Test
  public void canAddCamera(){
    photographer.add(digitalCamera);
    assertEquals(1, photographer.printableCount());
  }

  @Test
  public void canRemoveCamera(){
    photographer.remove();
    assertEquals(0, photographer.printableCount());
  }


}