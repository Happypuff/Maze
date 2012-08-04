package maze;

public class RunsNorthSouthWall implements MazePiece
{
    MazePiece north;
    MazePiece east;
    MazePiece south;
    MazePiece west;

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
