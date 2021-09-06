public class Controle {
    public int direita;
    public int esquerda;

    public void setDireita(int d) {
        this.direita = d;
        if(d == 5) {
            this.esquerda = this.esquerda - 1;
        }
    }
    public void setEsquerda(int e) {
        this.esquerda = e;
    }
}