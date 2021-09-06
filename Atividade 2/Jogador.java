public class Jogador {
    public static void main(String[] args) {
        Jogador j = new Jogador();
        Controle c = new Controle();

        j.jogar(5, 5, c);
    }
    public void jogar(int direita, int esquerda, Controle c) {
        c.setEsquerda(esquerda);
        c.setDireita(direita);

        System.out.println("Direita: "+c.direita+" \nEsquerda: "+c.esquerda);
    }
}