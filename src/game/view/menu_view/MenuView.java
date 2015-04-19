package game.view.menu_view;


import game.model.menu.GameMenu;

import javax.swing.*;
import java.awt.*;

public class MenuView extends JComponent {
    GameMenu gameMenu;

    public MenuView (GameMenu m){
        gameMenu = m;
    }

    @Override
    public void paint(Graphics g) {
        //sSystem.out.println(gameMenu.getSelectedOption());

        super.paint(g);
        drawBackground(g);
        int x = getHeight()/2;
        int y = getHeight()/2 - 20;

        drawTitles(g, x, y);

        for ( String option : gameMenu.getOptions() ){

            if(option.equals(gameMenu.getSelectedOption())){
                drawOption(g, x, y, option, true );
            } else {
                drawOption(g, x, y, option, false );
            }

            y += 50;
        }
    }

    private void drawTitles( Graphics g,int x, int y) {
        g.setColor(Color.WHITE);
        Font f = new Font("consolas", Font.BOLD, 20);
        g.setFont(f);
        g.drawString(gameMenu.getTitle(), x, y-70);
        f = new Font("consolas", Font.BOLD, 12);
        g.setFont(f);
        g.drawString(gameMenu.getSubtitle(), x, y-30);
    }

    private void drawOption( Graphics g,int x, int y, String option, boolean selected){

        Graphics2D g2d = (Graphics2D) g;

        Color bground = (selected)? Color.BLACK : Color.WHITE;
        Color fground = (selected)? Color.WHITE : Color.BLACK;


        g.setColor(bground);
        g2d.fillRect(x, y, 160, 40);
        Font f = new Font("consolas", Font.BOLD, 12);
        g.setFont(f);
        g.setColor(fground);
        g2d.drawRect(x, y, 160, 40);
        g.drawString(option, x+20, y+20);
    }

    private void drawBackground( Graphics g ) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());
    }


}
