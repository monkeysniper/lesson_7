public class Warrior extends Hero {
    public Warrior(int damage, int health, String typePower) {
        super(damage, health, typePower);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Warrior применил супер способность "+getTypePower());
    }
}
