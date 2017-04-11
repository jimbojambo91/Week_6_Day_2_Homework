import static org.junit.Assert.*;
import org.junit.*;

public class DigitalCameraTest{
  Photographer photographer;
  DigitalCamera digitalCamera;

  @Before 
  public void before() {
    photographer = new Photographer();
    digitalCamera = new DigitalCamera("Nikon 34T"); 
  }

  @Test 
  public void getDetails() {
  assertEquals("Nikon 34T", digitalCamera.printDetails());
  }

}