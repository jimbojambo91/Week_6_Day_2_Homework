import java.util.*;

public class Photographer {
  private ArrayList<Printable> printables;
  private HashMap<String, Integer> journal = new HashMap<String, Integer>();

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

  public String returnAllPrintables(){
    String words = "" ;
    for(Printable printable : this.printables){
      words += printable.printDetails() + " ";
    }
    return words;
  }
}