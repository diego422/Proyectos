package TicTacToeExamen;

import TicTacToeExamen.Board;
import TicTacToeExamen.Player;
import TicTacToeExamen.TicTacToe;
import java.util.Scanner;

/**
 * @author Diego Herrera López
 * @author James Arias Avalos
 */
public class ThreeStripes {

    /**
     * @param args the command line arguments
     *
     */
    static Scanner teclado = new Scanner(System.in);

    /**
     *
     * este codigo presenta un tablero para el juego de TicTacToe, trae su
     * funcion de jugar con 2 personas, J1 y J2 que viene de la clase Player. Se
     * muestra quien es el ganador o si hay un empate.
     *
     */
    public static void main(String[] args) {
        TicTacToe callTTT = new TicTacToe();
        Player a = new Player();
        Board b = new Board();
        int row, column;

        boolean posValidate, correct;

        /*No salimos hasta que uno gane o no haya mas posibilidades 
        en el tablero de juego
        
         */
        Scanner change = new Scanner(System.in);

        System.out.println("seleccione 1 si desea Jugar Player Vs Player");
        System.out.println("seleccione 2 si desea Jugar Bot Vs Bot");
        System.out.println("seleccione 3 si desea Jugar Player Vs Bot");
        int changeto = change.nextInt();
        switch (changeto) {

            case 1:
                while (!callTTT.endGame()) {

                    do {

                        //mostramos al jugador que le toca el turno 
                        callTTT.showCurrentShift();

                        //muestra el tablero de la partida para empezar a jugar
                        callTTT.showBoard();

                        correct = false;
                        row = askLocation("Elija la fila");
                        column = askLocation("Elija la columna");

                        //Validamos la posicion  que el usuario desea llegar
                        posValidate = callTTT.validatePosition(row, column);

                        //Si es valido, comprobamos que no haya ningun simbolo
                        if (posValidate) {

                            /*Si no contiene simbolo, significa que es correcto,
                    valida si la posicion es valida
                             */
                            if (!callTTT.placeValue(row, column)) {
                                correct = true;
                            } else {
                                System.out.println("Esta posicion ya esta ocupada");
                            }
                        } else {
                            System.out.println("La posicion no es valida");
                        }

                        //Mientras no sea correcto, no se puede salir del do while
                    } while (!correct);

                    /*
            depende del turno de la partida, inserta un simbolo u otro del
            del jugador 1 o jugador 2
                     */
                    callTTT.insert(row, column, a);

                    callTTT.changeShift();
                }

                //Muestra el tablero en el cual se esta jugando
                callTTT.showBoard();

                callTTT.sampleWinner(a);
                break;
            case 2:
                boolean P = true;
                while (!callTTT.endGame()) {
                    do {
                        correct = false;

                        //bots
                        row = bot();
                        column = bot();
                        posValidate = callTTT.validatePosition(row, column);

                        if (posValidate) {
                            if (!callTTT.placeValue(row, column)) {
                                correct = true;
                            }
                        }

                        //Funciona para filrar los numeros y asi asignar una posicion 
                    } while (!correct);

                    //muestra el tablero de la partida para empezar a jugar
                    callTTT.showBoard();
                    //mostramos al bot que le toca el turno 
                    callTTT.showCurrentShiftBot();

                    //Hace el cambio de turno
                    callTTT.changeShift();

                    callTTT.insert(row, column, a);

                }

                //Muestra el tablero en el cual se esta jugando
                callTTT.showBoard();
                callTTT.sampleWinnerBot(a);
                //Muestra el tablero en el cual se jugo
                callTTT.showBoard();
                break;

            case 3:

                while (!callTTT.endGame()) {

                    do {
                        //Muestra el tablero en el cual se esta jugando
                        callTTT.showBoard();

                        correct = false;

                        if (callTTT.turn == false) {
                            row = bot();
                            column = bot();

                        } else {

                            row = askLocation("Elija la fila");
                            column = askLocation("Elija la columna");
                        }

                        //Validamos la posicion  que el usuario desea llegar
                        posValidate = callTTT.validatePosition(row, column);

                        //comprobamos que no haya ningun simbolo
                        if (posValidate) {

                            /*Si no contiene simbolo, significa que es correcto,
                    valida si la posicion es valida
                             */
                            if (!callTTT.placeValue(row, column)) {
                                correct = true;
                            } else {
                                if (callTTT.turn == true) {
                                    System.out.println("Esta posicion ya esta ocupada");
                                }
                            }
                        } else {
                            if (callTTT.turn == true) {
                                System.out.println("La posicion no es valida");
                            }

                        }

                        //Mientras no sea correcto, no se puede salir del do while
                    } while (!correct);

                    //muestra el turno del jugador o el bot
                    callTTT.showCurrentShiftBotVsPlayer();

                    /*
            depende del turno de la partida, inserta un simbolo u otro del
            del jugador 1 o jugador 2
                     */
                    callTTT.insert(row, column, a);
                    callTTT.changeShift();
                    ;

                }
                //Muestra el tablero en el cual se esta jugando
                callTTT.showBoard();
                //Muestra al ganador 
                callTTT.sampleWinnerBotVSPlayer(a);
                //Muestra el tablero en el cual se esta jugando
                callTTT.showBoard();
                break;

        }

    }

    public static int askLocation(String message) {

        System.out.println(message);
        int number = teclado.nextInt();

        return number - 1;

    }

    public static int bot() {

        int botOne = (int) (Math.random() * 3);

        return botOne;

    }

}
