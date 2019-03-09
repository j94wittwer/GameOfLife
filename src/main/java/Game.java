public class Game {
    public Game game;

    public Game(Game game) {
        this.game = game;
    }

    public static void main(String args[]){
        Rules rules = new Rules(10, 100, 50);
        rules.randomSeed();
        rules.printGrid();
    }
}
