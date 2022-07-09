
public class BattleshipGame {

    private Field field;

    public BattleshipGame(int height, int width, int nShips) {
        field = new Field(height, width, nShips);

        putShips(nShips);
    }

    private void putShips(int nShips) {
        for (int i = 0; i < nShips; i++) {
            int row;
            int col;

            do {
                row = (int) (Math.random() * field.getHeight());
                col = (int) (Math.random() * (field.getWidth() - 1));
            } while (field.isShip(row, col) || field.isShip(row, col + 1));

            field.putShip(row, col);
            field.putShip(row, col + 1);
        }
    }

    public void run() {

        field.print();

        while (!field.isGameOver()) {

            Target target = getTarget();
            while (!field.isCovered(target.row, target.col)) {
                Out.println("This cell is already uncovered, pick another!");
                target = getTarget();
            }

            if (field.hit(target.row, target.col)) {
                Out.println("You hit something!");
            }

            field.print();
            Out.println(String.format("There are still %d cell(s) with a ship", field.getCoveredShips()));
        }

        Out.println("Nice! You won!");
    }

    private Target getTarget() {

        Out.print("Row: ");
        int row = Main.receiveInt(0, field.getHeight() - 1);

        Out.print("Col: ");
        int col = Main.receiveInt(0, field.getWidth() - 1);

        return new Target(row, col);
    }
}
