//We are the sole authors of the work in this repository.
import structure5.*;
import java.util.Comparator;

public class NameComparator implements Comparator<Student>{
  /*
   * pre: method parameters are valid Student objects
   * post: returns -1 if Student a's name comes alphabetically before Student b's,
      0 if they are the same, and 1 if Student a's name comes after Student b's
   */
  public int compare(Student a, Student b){
     /*$ You can also just return a.getName().compareTo(b.getName()) since this
         will output -1, 0, or 1 accordingly :). */
    if(a.getName().compareToIgnoreCase(b.getName()) < 0){
      return -1;
    }
    else if(a.getName().compareToIgnoreCase(b.getName()) == 0){
      return 0;
    }
    else{
      return 1;
    }
  }

}
