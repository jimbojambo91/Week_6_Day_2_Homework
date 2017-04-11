import java.util.*;

public class Photographer {
  private ArrayList<Printable> printables;
  private HashMap<String, Integer> journal;

  public Photographer(){
    this.printables = new ArrayList<Printable>();
    this.journal = new HashMap<String, Integer>();
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

  public void addToJournal(String day, Integer count){
    journal.put(day, count);
  }

  public int journalCount(){
    return journal.size();
  }

  public int journalTotal(){
    int total = 0;
    Set<String> keys = journal.keySet();
    for(String key : keys ){
      total += journal.get(key);
    }
    return total;
  }
}