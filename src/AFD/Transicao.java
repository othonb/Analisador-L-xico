package AFD;

public class Transicao {

    private Estado estadoAtual; // Estado atual da transição
    private Estado estadoFinal; // Estado final da transição
    private char simboloLido; // Símbolo lido para mudar de transição

    public Estado getEstadoAtual() {
        return estadoAtual;
    }

    public void setEstadoAtual(Estado estadoAtual) {
        this.estadoAtual = estadoAtual;
    }

    public Estado getEstadoFinal() {
        return estadoFinal;
    }

    public void setEstadoFinal(Estado estadoFinal) {
        this.estadoFinal = estadoFinal;
    }

    public char getSimboloLido() {
        return simboloLido;
    }

    public void setSimboloLido(char simboloLido) {
        this.simboloLido = simboloLido;
    }
}
