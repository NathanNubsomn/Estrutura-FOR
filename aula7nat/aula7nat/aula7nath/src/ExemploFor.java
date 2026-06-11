public class ExemploFor {
    public static void main(String[] args) {
        System.out.println("Iniciando a Contagem de bonûs");
        // O Loop vai rodar de 1 até 5

        for (int nivel = 1; nivel<5; nivel++ ){
            int score = nivel*100; // Calcula os pontos !
            System.out.println("Level" + nivel + "Alcançamos! Pontuação"+score + "XP");
        }
        System.out.println("Fim da fase! você mandou Bem!");
    }
}
