package maze;

public class MazeBuilder
{
    private MazePiece finishingPiece;

    void build()
    {
        MazePiece startingPiece = new EmptySpace();
        finishingPiece = new EmptySpace();
        startingPiece.setNorthPiece(finishingPiece);
        finishingPiece.setNorthPiece(new RunsEastWestWall());
        finishingPiece.setSouthPiece(startingPiece);

    }
}
