import java.util.*;
import java.io.*;

public class Driver {
  public static void main(String[] args) {
    HashMap<Integer,Snake> snakes = new  HashMap<Integer,Snake>();
    HashMap<Integer,Ladder> ladders = new  HashMap<Integer,Ladder>();
    Scanner in = new Scanner(System.in);
    System.out.println("Enter number of snakes :");
    int nsnakes = in.nextInt();
    in.nextLine();
    System.out.println("Enter starting and ending positions of snakes :");
    for (int i = 0;i<nsnakes;i++) {
      int start = in.nextInt();
      int end = in.nextInt();
      Snake snake = new Snake(start,end);
      snakes.put(start,snake);
    }
    System.out.println("Enter number of ladders :");
    int nLadders = in.nextInt();
    in.nextLine();
    System.out.println("Enter starting and ending positions of ladders :");
    for (int i = 0;i<nLadders;i++) {
      int start = in.nextInt();
      int end = in.nextInt();
      Ladder ladder = new Ladder(start,end);
      ladders.put(start,ladder);
    }
    Board board = new UserBoard(snakes,ladders);
    Queue<Player> playerQueue = new LinkedList<Player>();
    System.out.println("Enter number of players : ");
    int nPlayers = in.nextInt();
    in.nextLine();
    for (int i = 0; i<nPlayers ;i++) {
      System.out.println("Enter player-"+i+" name :");
      String name = in.nextLine();
      Player player = new Player(name);
      playerQueue.add(player);
    }
    System.out.println("Enter number of dices : ");
    int nDices = in.nextInt();
    in.nextLine();
    SnakeAndLadder game = new SnakeAndLadder(playerQueue,nDices);
    game.playGame(board);
  }
}
