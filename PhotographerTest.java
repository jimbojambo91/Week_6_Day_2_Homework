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
    analogueCamera = new AnalogueCamera("Polaroid 600"); 
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

  @Test
  public void listAllPrintables(){
    photographer.add(digitalCamera);
    photographer.add(analogueCamera);
    String result = "Nikon 34T Polaroid 600 ";
    assertEquals(result, photographer.returnAllPrintables());
  }

  @Test
  public void canAddToJournal(){
    photographer.addToJournal("day1", 5);
    assertEquals(photographer.journalCount(), 1);
  }

  @Test
  public void journalTotal(){
    photographer.addToJournal("day1", 5);
    photographer.addToJournal("day2", 2);
    photographer.addToJournal("day3", 3);
    assertEquals(10, photographer.journalTotal());
  }


}