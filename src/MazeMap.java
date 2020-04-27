package escapethespaceship;

import java.util.ArrayList;
import java.util.List;

public class MazeMap {
    private final char WALL_CHAR = '#';
    private final char OPEN_SPACE_CHAR = ' ';
    private final char EXIT_CHAR = 'X';

    private char[][] map;
    private Coord mapSize;
    private Coord exit;
    private ArrayList<Coord> openSpaces;


    public MazeMap(char[][] map) {
        this.map = map;

        mapSize = findMapSize();
        exit = findExit();
        openSpaces = findOpenSpaces();
    }

    public boolean wallAt(int x, int y) {
        return map[x][y] == WALL_CHAR;
    }

    public Coord randomOpenCoord() {
        return openSpaces.get((int) Math.floor(Math.random() * openSpaces.size()));
    }

    public Coord getMapSize() {
        return mapSize;
    }

    public char getCharAt(int x, int y) {
        return map[x][y];
    }

    private Coord findMapSize() {
        return new Coord(map.length, map[0].length);
    }

    //Top left corner is (0,0)
    private Coord findExit() {
        for(int x = 0; x < map.length; x++) {
            for(int y = 0; y < map[0].length; y++) {
                if(map[x][y] == EXIT_CHAR) {
                    return new Coord(x,y);
                }
            }
        }
        System.out.println("Sortie Introuvable");
        return new Coord(0,0);
    }

    private ArrayList<Coord> findOpenSpaces() {
        ArrayList<Coord> coords = new ArrayList<Coord>();

        for(int x = 0; x < map.length; x++) {
            for(int y = 0; y < map[0].length; y++) {
                if(map[x][y] == OPEN_SPACE_CHAR) {
                    coords.add(new Coord(x, y));
                }
            }
        }

        return coords;
    }
}

