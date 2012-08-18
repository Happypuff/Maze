package maze;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JPanel;

public class MazeJPanel extends JPanel
{
    double x,y;
    @Override
    protected void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        MazeBuilder mb = new MazeBuilder();
        MazePiece startingPiece = mb.getStartingPiece();
        drawMaze(startingPiece, x, y, g2);
    }

    private void drawMaze(MazePiece startingPiece, double x, double y, Graphics2D g2)
    {
        Rectangle r = new Rectangle(
                5,
                10,
                22,
                42
                );
        g2.setPaint(Color.RED);
    }
}
