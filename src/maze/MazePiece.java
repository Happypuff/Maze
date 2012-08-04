/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package maze;

/**
 *
 * @author heidi
 */
public interface MazePiece
{
    MazePiece getNorthPiece();
    void setNorthPiece(MazePiece mazePiece);
    MazePiece getEastPiece();
    void setEastPiece(MazePiece mazePiece);
    MazePiece getSouthPiece();
    void setSouthPiece(MazePiece mazePiece);
    MazePiece getWestPiece();
    void setWestPiece(MazePiece mazePiece);
    
}
