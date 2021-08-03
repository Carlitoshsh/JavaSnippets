package semana3.repaso;

public class Triqui {
    String[][] tablero = new String[3][3];

    public Triqui() {
        for (int i = 0; i < this.tablero.length; i++) {
            for (int j = 0; j < this.tablero[i].length; j++) {
                this.tablero[i][j] = "a";
            }
        }
    }

    void marcarCasilla(String simbolo, int fila, int columna) {
        this.tablero[fila][columna] = simbolo;
    }

    String verificarGanador() {
        String caracterGanador = "a";

        // Filas
        for (int i = 0; i < this.tablero.length; i++) {
            if (this.tablero[i][0].equals(this.tablero[i][1]) && this.tablero[i][1].equals(this.tablero[i][2])
                    && !this.tablero[i][0].equals("a")) {
                caracterGanador = this.tablero[i][0];
                return caracterGanador;
            }
        }

        // Columnas
        for (int j = 0; j < this.tablero.length; j++) {
            if (this.tablero[0][j] == this.tablero[1][j] && this.tablero[1][j] == this.tablero[2][j]
                    && this.tablero[0][j] != "a") {
                caracterGanador = this.tablero[0][j];
                return caracterGanador;
            }
        }

        // Diagonal principal
        if (this.tablero[0][0] == this.tablero[1][1] && this.tablero[1][1] == this.tablero[2][2]
                && this.tablero[0][0] != "a") {
            caracterGanador = this.tablero[0][0];
            return caracterGanador;
        }

        if (this.tablero[0][2] == this.tablero[1][1] && this.tablero[1][1] == this.tablero[2][0]
                && this.tablero[1][1] != "a") {
            caracterGanador = this.tablero[1][1];
            return caracterGanador;
        }

        return caracterGanador;
    }

    String verificarCasilla(int fila, int columna) {
        return this.tablero[fila][columna];
    }

    public String toString() {
        String stringBuilder = "";
        for (int i = 0; i < this.tablero.length; i++) {
            for (int j = 0; j < this.tablero[i].length; j++) {
                stringBuilder += this.tablero[i][j] + " ";
            }
            stringBuilder += "\n";
        }
        return stringBuilder;
    }

    public static void main(String[] args) {
        Triqui triqui = new Triqui();
        System.out.println(triqui.toString());
        triqui.marcarCasilla("X", 1, 0);
        triqui.marcarCasilla("X", 1, 2);
        triqui.marcarCasilla("X", 0, 2);
        triqui.marcarCasilla("O", 0, 2);
        triqui.marcarCasilla("O", 1, 1);
        triqui.marcarCasilla("O", 2, 0);
        System.out.println(triqui.toString());
        System.out.println(triqui.verificarGanador());
    }
}
