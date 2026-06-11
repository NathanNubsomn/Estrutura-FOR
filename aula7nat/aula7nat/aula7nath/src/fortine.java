public class fortine {
    public static void main(String[] args) {
        System.out.println("Recupere Hp!Você achou um kit médico");

        for (int HP = 20 ;HP<=100;HP+=15) {
            int score = HP * 15;
            System.out.println("Seu Hp está regenerado" + HP + "%");
        }
        System.out.println("Sua vida está em 100%");
    }
}
