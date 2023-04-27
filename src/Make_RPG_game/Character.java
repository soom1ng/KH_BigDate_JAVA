package Make_RPG_game;

public class Character extends Unit implements GameAction {
    // 생성자의 매개변수로 전달 받는 값으로 캐릭터의 기본 능력치를 설정

    public Character(String name, int pP, int mP, double pH, double mH, int ultra, int hp) {
        this.name = name;
        this.pPower = pP;
        this.mPower = mP;
        this.pHit = pP;
        this.mHit = mP;
        this.ultraPower = ultra;
        this.hp = hp;
    }
    @Override // 물리 공격력 : 물리적인 힘 * 원래는 확률로 계산하는게 원칙이지만 코드를 간단하게 하기 위함 .
    public double pAttack() {
        return pPower * pHit;
    }

    @Override // 마법 공격력
    public double mAttack() {
        return mPower * mHit;
    }

    @Override // 궁극기 : 특수 능력
    public int ultimate() {
        return ultraPower;
    }

    @Override // 해당 캐릭터가 공격을 받아서 받는 피해량 반영 함 .
    public boolean setDamage(double damage) {
        if (hp > damage) {
            hp -= damage;
            System.out.println("남아있는 " + name + "의 체력은" + hp + "입니다.");
            return false; // 캐릭터가 살아있음을 의미함 .
        } else {
            System.out.println(name + "이 죽었습니다. 게임을 종료합니다.");
            return true;
        }
    }
}
