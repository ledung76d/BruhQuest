package gamestates;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

import main.GamePanel;

public class GameOver implements Statemethods{
	GamePanel gp;
	public int commandNum = 0;
	public GameOver(GamePanel gp) {
        this.gp = gp;
	}
	@Override
	public void draw(Graphics2D g2) {
		// TODO Auto-generated method stub
		drawGameOverScreen(g2);
	}
	private void drawGameOverScreen(Graphics2D g2) {
        g2.setColor(new Color(0, 0, 0, 150));
        g2.fillRect(0, 0, gp.screenWidth, gp.screenHeight);
        g2.setFont(g2.getFont().deriveFont(Font.BOLD, 90f));
        int x;
        int y;
        String text;

        text = "You died";
        // shadow
        g2.setColor(Color.black);
        x = getXforCenteredText(text,g2);
        y = gp.tileSize * 4;
        g2.drawString(text, x, y);
        // text
        g2.setColor(Color.red);
        g2.drawString(text, x - 4, y - 4);
        // retry
        g2.setColor(Color.white);
        g2.setFont(g2.getFont().deriveFont(Font.BOLD, 40f));
        text = "Retry";
        x = getXforCenteredText(text,g2);
        y += gp.tileSize * 4;
        g2.drawString(text, x, y);
        if (commandNum == 0) {
            g2.drawString(">", x - 40, y);
        }
        // quit
        text = "Quit";
        x = getXforCenteredText(text,g2);
        y += 55;
        g2.drawString(text, x, y);
        if (commandNum == 1) {
            g2.drawString(">", x - 40, y);
        }
        
    }
	public int getXforCenteredText(String text,Graphics2D g2) {
	    int length = (int) g2.getFontMetrics().getStringBounds(text, g2).getWidth();
	    int x = gp.screenWidth / 2 - length / 2;
	    return x;
	}

}
