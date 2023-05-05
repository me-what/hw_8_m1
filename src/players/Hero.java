package players;

public abstract class Hero extends GameEntity implements HavingSuperAbility {
    private SuperAbility ability;

    public Hero(int health, int damage, SuperAbility ability, String name) { // конструктор класса Hero
        super(health, damage, name);
        this.ability = ability;
    }

    public SuperAbility getAbility() {
        return ability;
    }

    public void attack(Boss boss) {
        if (boss.getHealth() > 0) {
            boss.setHealth(boss.getHealth() - this.getDamage());
        }
    }
}