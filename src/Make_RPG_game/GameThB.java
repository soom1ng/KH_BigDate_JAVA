package Make_RPG_game;
// 쓰레드 생성, GameThA 마법사 캐릭터에 대한 구현
public class GameThB extends Thread  {

    private Character warrior;
    private Character wizard;
    public GameThB (Character warrior, Character wizard) {
        this.warrior = warrior;
        this.wizard = wizard;
    }
    @Override
    public void run() {
        int normal;
        int special;
        boolean endGame = false;

        while (true) {
            try {
                sleep(3300); // 3초 마다 반복
                normal = (int) (Math.random() * 2); // 50% 확률
                special = (int) (Math.random() * 18); // 5% 확률
                if (normal == 1) {
                    System.out.println("마법 공격 : " + warrior.name + "에게 " + wizard.mAttack() + " 데미지를 입혔습니다.");
                    endGame = warrior.setDamage(wizard.mAttack());
                } else {
                    System.out.println("물리 공격 : " + warrior.name + "에게 " + wizard.pAttack() + " 데미지를 입혔습니다.");
                    endGame = warrior.setDamage(wizard.pAttack());
                }
                if(special == 10) { // 1/18 확률로 발동
                    System.out.println(wizard.name + "의 궁극기 발동 ! ");
                    System.out.println(warrior.name + "에게 " + wizard.ultimate() + " 데미지를 입혔습니다.");
                    endGame = warrior.setDamage(wizard.ultimate());
                }
                if (endGame) System.exit(0);
            } catch (InterruptedException e) {}
        }
    }
}