/**
 * Programa que permite que dos usuarios humanos
 * jueguen al gato (tic-tac-toe)
 */
package TicTacToe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author diego
 */
public class TicTacToe {

    public static char[][] gato = new char[3][3];

    public static void imprimirPosiciones() {
        int pos = 1;
        System.out.println("Selecciona una posición en el tablero: ");
        System.out.println("Las casillas marcadas con X u O ya están ocupadas");
        for (int i = 0; i < gato.length; i++) {
            for (int j = 0; j < gato.length; j++) {
                if (gato[i][j] == 'X' || gato[i][j] == 'O') {
                    System.out.print(" " + gato[i][j]);
                } else {
                    System.out.print(" " + pos);
                }
                pos++;
            }
            System.out.println();
        }
    }

    public static boolean casillaNoOcupada(int posicion) {
        switch (posicion) {
            case 1:
                return gato[0][0] != ' ';
            case 2:
                return gato[0][1] != ' ';
            case 3:
                return gato[0][2] != ' ';
            case 4:
                return gato[1][0] != ' ';
            case 5:
                return gato[1][1] != ' ';
            case 6:
                return gato[1][2] != ' ';
            case 7:
                return gato[2][0] != ' ';
            case 8:
                return gato[2][1] != ' ';
            case 9:
                return gato[2][2] != ' ';
            default:
                return false;
        }
    }

    public static void registrarJugada(char player) throws IOException {
        boolean salir = false;
        String entrada;
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        int posicion;
        do {
            imprimirPosiciones();
            System.out.println("Escriba el número de casilla en donde desea tirar: ");
            entrada = bufer.readLine();
            posicion = Integer.parseInt(entrada);
            if (casillaNoOcupada(posicion)) {
                switch (posicion) {
                    case 1:
                        gato[0][0] = player;
                        break;
                    case 2:
                        gato[0][1] = player;
                        break;
                    case 3:
                        gato[0][2] = player;
                        break;
                    case 4:
                        gato[1][0] = player;
                        break;
                    case 5:
                        gato[1][1] = player;
                        break;
                    case 6:
                        gato[1][2] = player;
                        break;
                    case 7:
                        gato[2][0] = player;
                        break;
                    case 8:
                        gato[2][1] = player;
                        break;
                    case 9:
                        gato[2][2] = player;
                        break;
                }
                salir = true;
            } else {
                System.out.println("Casilla no válida, escriba una posición valida");
            }
        } while (!salir);
    }

    public static void imprimirGato() {
        System.out.println("El gato hasta el momento: ");
        for (char[] gato1 : gato) {
            for (int j = 0; j < gato.length; j++) {
                System.out.print("   " + gato1[j]);
            }
            System.out.println();
        }

    }

    public static boolean ganaPorRenglon(char player) {
        for (char[] gato1 : gato) {
            if (gato1[0] == player && gato1[1] == player && gato1[2] == player) {
                return true;
            }
        }
        return false;
    }

    public static boolean ganaPorColumna(char player) {
        for (int i = 0; i < gato.length; i++) {
            if (gato[0][i] == player && gato[1][i] == player && gato[2][i] == player) {
                return true;
            }
        }
        return false;
    }

    public static boolean ganaPorDiagonales(char player) {
        // Busca ganador en la columna de izquierda a derecha
        if (gato[0][0] == player && gato[1][1] == player && gato[2][2] == player) {
            return true;
        }

        if (gato[0][2] == player && gato[1][1] == player && gato[2][0] == player) {
            return true;
        }

        return false;
    }

    public static boolean hayGanador(char player) {
        if (ganaPorRenglon(player)) {
            return true;
        }

        if (ganaPorColumna(player)) {
            return true;
        }

        if (ganaPorDiagonales(player)) {
            return true;
        }

        return false;
    }

    public static boolean hayEspacio() {
        for (char[] gato1 : gato) {
            for (int j = 0; j < gato.length; j++) {
                if (gato1[j] == '_') {
                    return true;
                }
            }
        }
        return false;
    }

    public static void inicializarTablero() {
        for (int i = 0; i < gato.length; i++) {
            for (int j = 0; j < gato.length; j++) {
                gato[i][j] = '_';
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        char player = 'X';

        boolean terminar = false;
        inicializarTablero();
        do {
            registrarJugada(player);
            imprimirGato();
            
            if (hayGanador(player)) {
                System.out.println("Felicidades jugador " + player);
                System.out.println("Has ganado el juego");
                terminar = true;
            } else {
                if (!hayEspacio()) {
                    // Ya no hay casillas disponibles, el juego se empató
                    System.out.println("El juego termina en empate");
                    terminar = true;
                } else if (player == 'X') {
                    player = 'O';
                } else {
                    player = 'X';
                }
            }
        } while (!terminar);

    }

}
