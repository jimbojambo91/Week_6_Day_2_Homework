public class Photographer {
  private ArrayList<Camera> cameras;

  public Photographer(){
    this.cameras = new ArrayList<Camera>();
  }

   public void add(Camera camera){
    cameras.add(camera);
  }
}