import java.util.*;
import java.io.*;

public class Player {
  private String name;
  private int loc = 0;
  ArrayList<Integer> path = new ArrayList<Integer>(
            Arrays.asList(0));
  public Player (String name) {
    this.name = name;
  }
  public void updatePath(int pos) {
    path.add(pos);
  }
  public void getPath() {
    System.out.println(name+" ");
    for (Integer i : path) {
      System.out.print(i+" ");
    }
    System.out.println();
  }
  public String getName () {
    return name;
  }
  public void setLocation (int loc) {
    this.loc = loc;
  }
  public int getLocation () {
    return loc;
  }
}
