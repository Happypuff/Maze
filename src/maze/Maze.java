package maze;

public class Maze 
{
    public static void main(String[] args) 
    {
        new Maze().getGoing();
    }

    private void getGoing()
    {
      new MazeBuilder().build(); 
    }
}
