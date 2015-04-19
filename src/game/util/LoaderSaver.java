package game.util;

import game.Game;
import game.model.entity.Avatar;
import game.model.entity.Entity;
import game.model.game_world.GameWorld;
import game.model.game_world.Grass;
import game.model.game_world.Terrain;
import game.model.item.Item;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class LoaderSaver {

    private static final String SAVE_LOCATION = "saved_games/";
    private static final String MAP_LOCATION = "res/map/";

    public LoaderSaver(){

    }
    public ComponentInputMap loadDefaultMenuInputMap(JComponent view ){
        ComponentInputMap inputMap = new ComponentInputMap( view );
        inputMap.put(KeyStroke.getKeyStroke("W"), "N");
        inputMap.put(KeyStroke.getKeyStroke("X"), "S");
        inputMap.put(KeyStroke.getKeyStroke("S"), "select");
        return inputMap;
    }
    public GameWorld loadNewGameWorld( Game game ) {
        Terrain[][] terrains = loadTerrains();


        return null;
    }
    public GameWorld loadGameWorld( Game game ) {



        return null;
    }

    private Terrain[][] loadTerrains(){

        char[][] terrainChars = readTerrains();


        Terrain[][] terrains = new Terrain[terrainChars.length][terrainChars[0].length];
        int y = 0;
        for(char[] tc : terrainChars){
            int x = 0;
            for(char c : terrainChars[y]){
                switch (c){
                    case 'G':
                        // TODO FINISH TERRAINS
                        terrains[y][x] = new Grass();
                        break;
                    case 'M':
                        terrains[y][x] = new Grass();
                        break;
                    case 'D':
                        terrains[y][x] = new Grass();
                        break;
                    case 'R':
                        terrains[y][x] = new Grass();
                        break;

                }
                x++;
            }
            y++;
        }

        return terrains;

    }

    private char[][] readTerrains(){
        BufferedReader input  = null;
        char terrains[][] = null;
        try{
            input = new BufferedReader(
                    new FileReader(MAP_LOCATION + "terrain1.txt"));

            String line = input.readLine();
            String split[] = line.split(",");
            int mapWidth = Integer.parseInt(split[0]);
            int mapHeight = Integer.parseInt(split[1]);

            terrains = new char[mapWidth][mapHeight];
            int i = 0;
            while( (line = input.readLine()) != null ){
                if(i<mapHeight)
                    terrains[i]= line.toCharArray();
            }
        } catch (Exception e ){
            e.printStackTrace();
        } finally {
            if(input != null){
                try {
                    input.close();
                } catch (IOException e){
                    //error closing the file
                    e.printStackTrace();
                }
            }
        }

        if(terrains == null){
            terrains = new char[10][10];
            Arrays.fill(terrains, 'G');
        }

        return terrains;
    }


    public void save( GameWorld world ){

    }

    public void save( Avatar a ){

    }

    public void save( Terrain[][] terrains ){

    }

    public void save( Entity[][] entities ){

    }

    public void save( Item[][] entities ){

    }

    public void save( ComponentInputMap inputMap ){

    }


}
