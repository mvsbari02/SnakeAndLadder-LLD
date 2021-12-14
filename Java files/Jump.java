import java.util.*;
import java.io.*;

public class Jump {
  private int initPos;
  private int finalPos;
  public Jump(int initPos,int finalPos) {
    this.initPos = initPos;
    this.finalPos = finalPos;
  }
  public int getFinalPos () {
    return finalPos;
  }
}
