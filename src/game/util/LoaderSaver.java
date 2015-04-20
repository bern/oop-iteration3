package game.util;

import game.Game;
import game.model.entity.Avatar;
import game.model.entity.Entity;
import game.model.game_world.GameWorld;
import game.model.game_world.terrain.*;

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

    // brand new game load all the default stuff!
    public GameWorld loadNewGameWorld( Game game ) {
        GameWorld gameWorld = loadDefaultGameWorld ( game );

        // TODO IMPLEMENT LOAD  DEFAULT ITEMS
        //Items[] items = loadDefaultItems(){}
        //gameWorld.setItems( null);

        // TODO IMPLEMENT LOAD  DEFAULT ENTITIES
        //Items[] items = loadDefaultItems(){}



        return gameWorld;
    }

    public void saveGameWorld( GameWorld world ){

    }


    // LOAD THINGS THAT NEVER CHANGE... like terrains, area effects,
    private GameWorld loadDefaultGameWorld( Game game ) {

        Terrain[][] terrains = loadTerrains();
        Entity e = new Avatar(new Location(20, 21));

        return new GameWorld( game, terrains, e);
    }

    public Terrain[][] loadTerrains(){

        char[][] terrainChars = readTerrains();

        System.out.println(terrainChars[0].length + terrainChars.length);

        Terrain[][] terrains = new Terrain[terrainChars[0].length][terrainChars.length];

        for(int y = 0; y< terrainChars.length; y++){
            for(int x = 0; x< terrainChars.length; x++){
                switch (terrainChars[y][x]) {
                    case'G':
                        terrains[y][x] = new Grass(new Location(x, y));
                        break;
                    case'M':
                        terrains[y][x] = new Mountain(new Location(x, y));
                        break;
                    case'D':
                        terrains[y][x] = new Dirt(new Location(x, y));
                        break;
                    case'R':
                        terrains[y][x] = new River(new Location(x, y));
                        break;
                    case'W':
                        terrains[y][x] = new Water(new Location(x, y));
                        break;

                }

            }
            System.out.println("");
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
                i++;
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




    private void save( Avatar a ){

    }

    private void save( Terrain[][] terrains ){

    }

    private void save( Entity[][] entities ){

    }

    private void save( ComponentInputMap inputMap ){

    }


}
