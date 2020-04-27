package escapethespaceship;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class InputHandler implements KeyListener {

    private final char MOVE_UP = 'z';
    private final char MOVE_DOWN = 's';
    private final char MOVE_LEFT = 'q';
    private final char MOVE_RIGHT = 'd';

    private escapethespaceship game;

    public InputHandler(escapethespaceship game) {
        this.game = game;
    }

    public void keyTyped(KeyEvent e) {

    }
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyChar()) {
            case MOVE_UP:
                game.getHero().moveUp();
                break;
            case MOVE_DOWN:
                game.getHero().moveDown();
                break;
            case MOVE_LEFT:
                game.getHero().moveLeft();
                break;
            case MOVE_RIGHT:
                game.getHero().moveRight();
                break;
            default:
                break;
        }
    }
    public void keyReleased(KeyEvent e) {

    }
}