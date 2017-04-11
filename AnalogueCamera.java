public class AnalogueCamera implements Printable {

  private String name;

  public AnalogueCamera(String name){
    this.name = name;
  }

  public String printDetails(){
    return this.name;
  }

}