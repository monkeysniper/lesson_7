public class Magic extends Hero {
    public Magic(int damage, int health, String typePower) {
        super(damage, health, typePower);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Magic применил супер способность "+getTypePower());
    }
}
