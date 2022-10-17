package TicTacToeExamen;

import TicTacToeExamen.Player;
import TicTacToeExamen.Board;

/**
 * esta clase TicTacToe contiene todos los metodos que se utilizan para crear
 * este juego, cada uno con diferente funcion que se necesita
 *
 */
public class TicTacToe {
//este public char se utiliza para crear la matriz cuadrada de 3x3

    public char[][] gamePanel;
    //este boolean funciona para saber el turno de cada persona si le toca a j1 o j2
    public boolean turn;

    /**
     * en este metodo se llaman la clases que se van a utilizar como player y
     * board y se crea la matriz 3x3 y incializamos el tablero
     */
    public TicTacToe() {
        Player a = new Player();

        Board b = new Board();
        b.setEmpty('-');
        turn = true;
        this.gamePanel = new char[3][3];
        this.initializeboard();
    }

    /**
     * Este metodo lo que hace es inicializar el tablero y rellenarlo con - en
     * cada espacio.
     */
    public void initializeboard() {

        for (int i = 0; i < gamePanel.length; i++) {
            for (int j = 0; j < gamePanel.length; j++) {
                gamePanel[i][j] = '-';

            }
        }

    }

    /**
     *
     * este metodo funciona para saber cuando se termina el juego, para esto se
     * utiliza los metodos full board y los metodos line,column, diagonal para
     * saber si es diferente de -.
     */
    public boolean endGame() {

        if (boardFull()
                || line() != '-'
                || column() != '-'
                || diagonal() != '-') {
            return true;
        }

        return false;
    }

    /**
     * este metodo funciona para saber si la partida ya no tiene un guion"-"
     * para que se siga jugando o sino para que se termine el juego
     *
     */
    public boolean boardFull() {

        for (int i = 0; i < gamePanel.length; i++) {
            for (int j = 0; j < gamePanel[0].length; j++) {
                if (gamePanel[i][j] == '-') {
                    return false;
                }
            }
        }

        return true;

    }

    /**
     * este metodo funciona para saber si alguna linea de la matriz esta llena y
     * saber si se gano por linea
     */
    public char line() {

        char symbol;
        boolean coincidence;

        for (int i = 0; i < gamePanel.length; i++) {

            coincidence = true;
            //Cogemos el simbolo de la fila
            symbol = gamePanel[i][0];
            if (symbol != '-') {
                for (int j = 1; j < gamePanel[0].length; j++) {
                    //sino coincide ya no habra ganadro en esta fila
                    if (symbol != gamePanel[i][j]) {
                        coincidence = false;
                    }
                }

                //Si no se mete en el if, devuelvo el simbolo ganador
                if (coincidence) {
                    return symbol;
                }

            }

        }

        //Si no hay ganador, devuelvo el simbolo por defecto
        return '-';

    }

    /**
     * este metodo funciona para saber si alguna diagonal de la matriz esta
     * llena y saber si se gano por diagonal
     */
    public char diagonal() {

        char symbol;
        boolean coincidence = true;

        //Diagonal principal
        symbol = gamePanel[0][0];
        if (symbol != '-') {
            for (int i = 1; i < gamePanel.length; i++) {
                //sino coincide ya no habra ganador en esta fila
                if (symbol != gamePanel[i][i]) {
                    coincidence = false;
                }
            }

            //Si no se mete en el if, devuelvo el simbolo ganador
            if (coincidence) {
                return symbol;
            }

        }

        coincidence = true;

        //Diagonal inversa
        symbol = gamePanel[0][2];
        if (symbol != '-') {
            for (int i = 1, j = 1; i < gamePanel.length; i++, j--) {
                //sino coincide ya no habra ganadro en esta fila
                if (symbol != gamePanel[i][j]) {
                    coincidence = false;
                }
            }

            //Si no se mete en el if, devuelvo el simbolo ganador
            if (coincidence) {
                return symbol;
            }
        }

        //Si no hay ganador, devuelvo el simbolo por defecto
        return '-';

    }

    /**
     * este metodo funciona para saber si alguna columna de la matriz esta 
     * llena y saber si se gano por columna
     */
    public char column() {

        char symbol;
        boolean coincidence;

        for (int j = 0; j < gamePanel.length; j++) {

            //Reiniciamos la coincidence
            coincidence = true;
            //Cogemos el simbolo de la columna
            symbol = gamePanel[0][j];
            if (symbol != '-') {
                for (int i = 1; i < gamePanel[0].length; i++) {
                    //sino coincide ya no habra ganadro en esta fila
                    if (symbol != gamePanel[i][j]) {
                        coincidence = false;
                    }
                }

                //Si no se mete en el if, devuelvo el simbolo ganador
                if (coincidence) {
                    return symbol;
                }

            }

        }

        //Si no hay ganador, devuelvo el simbolo por defecto
        return '-';

    }
   /**
    * 
    * este metodo funciona para que los usuarios puedan ver quien gano, si
    * jugador 1 o jugador 2
    */
    public void winner(char symbol, int type, Player a) {
        if (symbol == a.getJ1()) {
            System.out.println("Ha ganado el Jugador 1, felicidades");
        }
        if (symbol == a.getJ2()) {
            System.out.println("ha ganado el jugador 2, felicidades");
        }

    }
    public void winnerBot(char symbol, int type, Player a) {
        if (symbol == a.getJ1()) {
             System.out.println("_______");
            System.out.println("Ha ganado el Bot 1, felicidades");
        }
        if (symbol == a.getJ2()) {
             System.out.println("_______");
            System.out.println("ha ganado el Bot 2, felicidades");
        }

    }
    
     public void winnerBotPlayer(char symbol, int type, Player a) {
        if (symbol == a.getJ1()) {
            System.out.println("_______");
            System.out.println("Ha ganado el Jugador, felicidades");
        }
        if (symbol == a.getJ2()) {
            System.out.println("_______");
            System.out.println("ha ganado el Bot, felicidades");
        }

    }
/**
 * 
 * este metodo se utiliza para que el codigo pueda saber cuales son las formas 
 * de ganar, si gano en columana, linea o diagonal y el metodo Winner lo utilice
 * para saber con el simbolo si el jugador 1 o 2 gano.
 */
    public void sampleWinner(Player a) {

        char symbol = line();

        if (symbol != '-') {

            winner(symbol, 1, a);

            return;

        }

        symbol = column();

        if (symbol != '-') {
            winner(symbol, 2, a);
            return;
        }
        symbol = diagonal();
        if (symbol != '-') {
            winner(symbol, 3, a);
            return;
        }
        System.out.println("La partida quedo en empate");

    }
    public void sampleWinnerBot(Player a) {

        char symbol = line();

        if (symbol != '-') {

            winnerBot(symbol, 1, a);

            return;

        }

        symbol = column();

        if (symbol != '-') {
            winnerBot(symbol, 2, a);
            return;
        }
        symbol = diagonal();
        if (symbol != '-') {
            winnerBot (symbol, 3, a);
            return;
        }
        System.out.println("La partida quedo en empate");

    }
     public void sampleWinnerBotVSPlayer(Player a) {

        char symbol = line();

        if (symbol != '-') {

            winnerBotPlayer(symbol, 1, a);

            return;

        }

        symbol = column();

        if (symbol != '-') {
            winnerBotPlayer(symbol, 2, a);
            return;
        }
        symbol = diagonal();
        if (symbol != '-') {
            winnerBotPlayer (symbol, 3, a);
            return;
        }
        System.out.println("La partida quedo en empate");

    }
/**
 * 
 * este metodo funciona para que cambie de turno de jugador 1 a jugador 2
 * y pueda ir intercalandose entre jugador 1 y jugador 2.
 */
    public void insert(int row, int column, Player a) {
        if (turn) {
            gamePanel[row][column] = a.getJ1();
        } else {
            gamePanel[row][column] = a.getJ2();
        }
    }
/**
 * este metodo funciona para mostra el tablero en el que se esta jugado para
 * que el usuario pueda reconocer que campos estan ocupados y poder ver como va
 * el juego
 */
    public void showBoard() {

        for (int i = 0; i < gamePanel.length; i++) {
            for (int j = 0; j < gamePanel[0].length; j++) {
                System.out.print(gamePanel[i][j] + " ");
            }
            System.out.println("");
        }

    }
 /**
  * Este metodo funciona para que le usuario reconozca cuando es el turno en 
  * el cual le toca jugar.
  */
    public void showCurrentShift() {

        if (turn) {
            System.out.println("Turno del jugador 1");
        } else {
            System.out.println("Turno del jugador 2");
        }

    }
     public void showCurrentShiftBot() {

        if (turn) {
            System.out.println("_______");
            System.out.println("Turno del bot 1");
                 
        } else {
             System.out.println("_______");
            System.out.println("Turno del bot 2");
                
        }

    }
     public void showCurrentShiftBotVsPlayer() {

        if (turn) {
            System.out.println("_______");
            System.out.println("Turno del Jugador");
        } else {
            System.out.println("_______");
            System.out.println("Turno del Bot");
        }

    }
     
     
     
     
     
     
  /**
   * este metodo funciona para hacer el cambio de turno de jugador 1 a jugador 2
   */
    public void changeShift() {
        turn = !turn;
    }
    
    
    
   /**
    * 
    *este metodo sirve para validar la posicion, para que el usuario reconozca 
    * que no esta dentro del parametro del tablero o el codigo le de un mensaje 
    * al usuario que necesita escoger otra campo del tablero
    */
    public boolean validatePosition(int row, int column) {

        if (row >= 0 && row < gamePanel.length && column >= 0 && column < gamePanel.length) {
            return true;
        }
        return false;

    }
  /**
   * Este metodo sirve para que la persona no pueda escoger un campo del tablero
   * ya utilizado por el otro jugador o por el mismo.
   * 
   */
    public boolean placeValue(int row, int column) {
        if (this.gamePanel[row][column] != '-') {
            return true;
        }

        return false;
    }

}