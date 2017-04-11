import java.util.*;

public class Photographer {
  private ArrayList<Printable> printables;

  public Photographer(){
    this.printables = new ArrayList<Printable>();
  }

  public int printableCount(){
    return printables.size();
  }

   public void add(Printable printable){
    printables.add(printable);
  }

  public Printable remove(){
    if(printableCount() > 0) {
      return printables.remove(0);
    }
    return null;
  }
}