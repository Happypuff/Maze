package maze;

public class MazeBuilder
{
    private MazePiece finishingPiece;
    private MazePiece startingPiece;

    void build()
    {
        MazePiece startingPiece = new EmptySpace();
        finishingPiece = new EmptySpace();
        startingPiece.setNorthPiece(finishingPiece);
        finishingPiece.setSouthPiece(startingPiece);
    }
    
     public MazePiece getStartingPiece()
     {
     return startingPiece; 
     }
}
