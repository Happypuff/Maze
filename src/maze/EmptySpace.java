package maze;

public class EmptySpace implements MazePiece
{
    MazePiece north = new RunsEastWestWall();
    MazePiece east = new RunsNorthSouthWall();
    MazePiece south = new RunsEastWestWall();;
    MazePiece west = new RunsNorthSouthWall();

    @Override
    public MazePiece getNorthPiece()
    {
        return north;
    }

    @Override
    public void setNorthPiece(MazePiece mazePiece)
    {
        north = mazePiece;
    }

    @Override
    public MazePiece getEastPiece()
    {
        return east;
    }

    @Override
    public void setEastPiece(MazePiece mazePiece)
    {
        east = mazePiece;
    }

    @Override
    public MazePiece getSouthPiece()
    {
        return south;
    }

    @Override
    public void setSouthPiece(MazePiece mazePiece)
    {
        south = mazePiece;
    }

    @Override
    public MazePiece getWestPiece()
    {
        return west;
    }

    @Override
    public void setWestPiece(MazePiece mazePiece)
    {
        west = mazePiece;
    }
}
