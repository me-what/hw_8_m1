package players;

public class Berserk extends Hero {
    private int blockedDamage;

    public Berserk(int health, int damage, String name) {
        super(health, damage, SuperAbility.BLOCK_DAMAGE_AND_REVERT, name);
    }

    public void setBlockedDamage(int blockedDamage) {
        this.blockedDamage = blockedDamage;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int getDamageOfBerserk = boss.getDamage() + this.getDamage();
        boss.setHealth(boss.getHealth() - getDamageOfBerserk);
        System.out.println("Berserk dealt blocked damage: " + getDamageOfBerserk);
    }
}
