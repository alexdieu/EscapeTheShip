package escapethespaceship;

public class Hero {
    private final char UP_MARKER = '^';
    private final char DOWN_MARKER = 'v';
    private final char LEFT_MARKER = '<';
    private final char RIGHT_MARKER = '>';
    private char currentMarker = 'v';

    private escapethespaceship game;

    private Coord position;

    public Hero(escapethespaceship game) {
        this.game = game;

        position = game.getMazeMap().randomOpenCoord();
    }

    public Coord getPosition() {
        return position;
    }

    public char getMarker() {
        return currentMarker;
    }

    public void moveUp() {
        if(currentMarker != UP_MARKER) {
            currentMarker = UP_MARKER;
        } else if(!game.getMazeMap().wallAt(position.x - 1, position.y)) {
            position.x -= 1;
        }
        game.getETTFrame().draw();
    }

    public void moveDown() {
        if(currentMarker != DOWN_MARKER) {
            currentMarker = DOWN_MARKER;
        } else if(!game.getMazeMap().wallAt(position.x + 1, position.y)) {
            position.x += 1;
        }
        game.getETTFrame().draw();
    }

    public void moveLeft() {
        if(currentMarker != LEFT_MARKER) {
            currentMarker = LEFT_MARKER;
        } else if(!game.getMazeMap().wallAt(position.x, position.y - 1)) {
            position.y -= 1;
        }
        game.getETTFrame().draw();
    }

    public void moveRight() {
        if(currentMarker != RIGHT_MARKER) {
            currentMarker = RIGHT_MARKER;
        } else if(!game.getMazeMap().wallAt(position.x, position.y + 1)) {
            position.y += 1;
        }
        game.getETTFrame().draw();
    }
}
