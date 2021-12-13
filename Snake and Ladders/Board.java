import java.util.*;
import java.io.*;


public interface Board {
  public void setSnakesAndLadders();
  public HashMap<Integer,Snake> getSnakes();
  public HashMap<Integer,Ladder> getLadders();
  public int getDestination();
}

class Board1 {
  private int destination = 100;
  private HashMap<Integer,Snake> snakes = new  HashMap<Integer,Snake>();
  private HashMap<Integer,Ladder> ladders = new  HashMap<Integer,Ladder>();
  public int getDestination() {
    return destination;
  }
  public void setSnakesAndLadders() {
    for (int i = 10,d = 6;i < destination;i = 2*i - 6,d++) {
      Snake snake = new Snake (i,i-d);
      snakes.put(i,snake);
    }
    for (int i = 6,u = 11;i<destination-15;i = 2*i - 4,u = 2*u + 1) {
      Ladder ladder = new Ladder (i,u);
      ladders.put(i,ladder);
    }
  }
  public HashMap<Integer,Snake> getSnakes() {
    return snakes;
  }
  public HashMap<Integer,Ladder> getLadders() {
    return ladders;
  }
}

class Board2 {
  private int destination = 100;
  private HashMap<Integer,Snake> snakes = new  HashMap<Integer,Snake>();
  private HashMap<Integer,Ladder> ladders = new  HashMap<Integer,Ladder>();
  public int getDestination() {
    return destination;
  }
  public void setSnakesAndLadders() {
    for (int i = 10,d = 6;i < destination;i = 2*i - 6,d++) {
      Snake snake = new Snake (i,i-d);
      snakes.put(i,snake);
    }
    for (int i = 6,u = 11;i<destination-15;i = 2*i - 4,u = 2*u + 1) {
      Ladder ladder = new Ladder (i,u);
      ladders.put(i,ladder);
    }
  }
  public HashMap<Integer,Snake> getSnakes() {
    return snakes;
  }
  public HashMap<Integer,Ladder> getLadders() {
    return ladders;
  }
}

class Board3 {
  private int destination = 100;
  private HashMap<Integer,Snake> snakes = new  HashMap<Integer,Snake>();
  private HashMap<Integer,Ladder> ladders = new  HashMap<Integer,Ladder>();
  public int getDestination() {
    return destination;
  }
  public void setSnakesAndLadders() {
    for (int i = 10,d = 6;i < destination;i = 2*i - 6,d++) {
      Snake snake = new Snake (i,i-d);
      snakes.put(i,snake);
    }
    for (int i = 6,u = 11;i<destination-15;i = 2*i - 4,u = 2*u + 1) {
      Ladder ladder = new Ladder (i,u);
      ladders.put(i,ladder);
    }
  }
  public HashMap<Integer,Snake> getSnakes() {
    return snakes;
  }
  public HashMap<Integer,Ladder> getLadders() {
    return ladders;
  }
}

class UserBoard implements Board{
  private int destination = 100;
  private HashMap<Integer,Snake> snakes = new  HashMap<Integer,Snake>();
  private HashMap<Integer,Ladder> ladders = new  HashMap<Integer,Ladder>();
  public UserBoard (HashMap<Integer,Snake> snakes,HashMap<Integer,Ladder> ladders) {
    this.snakes = snakes;
    this.ladders = ladders;
  }
  public int getDestination() {
    return destination;
  }
  public void setSnakesAndLadders() {

  }
  public HashMap<Integer,Snake> getSnakes() {
    return snakes;
  }
  public HashMap<Integer,Ladder> getLadders() {
    return ladders;
  }
}
