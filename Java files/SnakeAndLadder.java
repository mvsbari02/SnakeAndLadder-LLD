import java.util.*;
import java.io.*;

public class SnakeAndLadder {
  private int nDice;
  private Queue<Player> playerQueue = new LinkedList<Player>();
  public SnakeAndLadder (Queue<Player> playerQueue,int Dice) {
    this.playerQueue = playerQueue;
    this.nDice = nDice;
  }
  public void playGame(Board b) {
    int finalDestination = b.getDestination();
    Dice dice = new NormalDice();
    HashMap snakes = b.getSnakes();
    HashMap ladders = b.getLadders();
    while (playerQueue.size() > 1) {
      Player player = playerQueue.poll();
      int curPos = player.getLocation();
      int move = dice.throwDice();
      while (move%6 == 0) {
        move += dice.throwDice();
        if (move == 18) {
          move = 0;
          break;
        }
      }
      if (curPos+move <= finalDestination) {
        int nexPos;
        if (snakes.containsKey(curPos + move)) {
          Snake s = (Snake) snakes.get(curPos + move);
          nexPos = s.getFinalPos();
        }else if (ladders.containsKey(curPos + move)) {
          Ladder l =  (Ladder) ladders.get(curPos + move);
          nexPos = l.getFinalPos();
        }else {
          nexPos = curPos + move;
        }
        player.setLocation(nexPos);
        player.updatePath(nexPos);
      }
      if (player.getLocation() == finalDestination) {
        System.out.println("Hurray "+player.getName()+" has won the game");
        player.getPath();
      }else {
        playerQueue.add(player);
      }
    }
  }
}
