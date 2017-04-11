import static org.junit.Assert.*;
import org.junit.*;

public class AnalogueCameraTest{
  Photographer photographer;
  AnalogueCamera analogueCamera;

  @Before 
  public void before() {
    photographer = new Photographer();
    analogueCamera = new AnalogueCamera("Polaroid 600"); 
  }

  @Test 
  public void getDetails() {
  assertEquals("Polaroid 600", analogueCamera.printDetails());
  }

}