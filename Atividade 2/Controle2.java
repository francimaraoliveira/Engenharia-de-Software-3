public class Controle2 {
    private int direita;
    private int esquerda;

    public int getDireita() {
        return direita;
    }
    public void setDireita(int direita) {
        this.direita = direita;
        if(direita == 5) {
            this.esquerda --;
        }
    }
    public int getEsquerda() {
        return esquerda;
    }
    public void setEsquerda(int esquerda) {
        this.esquerda = esquerda;
    }
} 