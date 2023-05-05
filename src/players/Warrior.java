package players;

import logic.RPG_Game;

public class Warrior extends Hero {
    public Warrior(int health, int damage, String name) {
        super(health, damage, SuperAbility.CRITICAL_DAMAGE, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (boss.getHealth() > 0) {
            int coefficient = RPG_Game.random.nextInt(9) + 2;
            boss.setHealth(boss.getHealth() - coefficient * this.getDamage());
            System.out.println("Warrior hits critically: " + coefficient * this.getDamage());
        }
    }
}
