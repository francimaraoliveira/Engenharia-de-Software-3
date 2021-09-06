public class Jogador2 {
    public static void main(String[] args) {
        Jogador j = new Jogador();
        Controle c = new Controle();

        j.jogar(5, 5, c);
    }
    public void jogar(int direita, int esquerda, Controle c) {
        c.setEsquerda(esquerda);
        c.direita = direita;

        System.out.println("Direita:"+c.getDireita()+" \nEsquerda:"+c.getEsquerda());
    }
}