public class guereiro {
    public static void main(String[] args) {
        int botaoApertado = 3;
        switch (botaoApertado){
            case 1:
                System.out.println("você escolheu o Guerreiro Klof!");
                break;
            case 2:
                System.out.println("Você escolheu o mago!");
                break;
            case 3:
                System.out.println("Você escolheu a Arqueira");
                break;
            default:
                System.out.println("Código inválido! personagem");
        }
    }
}
