import java.util.*;

public class Photographer {
  private ArrayList<Camera> cameras;

  public Photographer(){
    this.cameras = new ArrayList<Camera>();
  }

  public int cameraCount(){
    return cameras.size();
  }

   public void add(Camera camera){
    cameras.add(camera);
  }

  public Camera remove(){
    if(cameraCount() > 0) {
      return cameras.remove(0);
    }
    return null;
  }
}