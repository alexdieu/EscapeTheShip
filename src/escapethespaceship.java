package escapethespaceship;

public class escapethespaceship {
    public static void main(String[] args) {
        escapethespaceship game = new escapethespaceship();
        game.initiate();
    }

    private MazeMap mazeMap;
    private Hero hero;
    private InputHandler inputHandler;
    private ETTFrame ettFrame;

    private void initiate() {
        MapLoader mapLoader = new MapLoader();

        inputHandler = new InputHandler(this);

        mazeMap = new MazeMap(mapLoader.loadMap("map"));
        hero = new Hero(this);

        ettFrame = new ETTFrame(this);
        ettFrame.draw();
    }

    public MazeMap getMazeMap() {
        return mazeMap;
    }

    public Hero getHero() {
        return hero;
    }

    public InputHandler getInputHandler() {
        return inputHandler;
    }

    public ETTFrame getETTFrame() {
        return ettFrame;
    }
}