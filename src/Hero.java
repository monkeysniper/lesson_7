public abstract class Hero implements HavingSuperAbility {
    private int health;
    private int damage;
    private String typePower;

    public Hero(int damage, int health, String typePower) {
        this.damage = damage;
        this.health = health;
        this.typePower = typePower;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getTypePower() {
        return typePower;
    }

    public void setTypePower(String typePower) {
        this.typePower = typePower;
    }
}


//Создать интерфейс HavingSuperAbility (имеющий супер способность) добавить в него 1 абстрактный метод applySuperAbility();
//2. Создать абстрактный класс Hero с полями здоровье, урон и тип супер способности и реализовать интерфейс HavingSuperAbility.
//3. Создать 3 класса героев Magic, Medic, Warrior и наследовать их от класса Hero. В каждом классе по своему реализовать метод applySuperAbility() следующим образом - просто распечатать что то вроде того “Warrior применил супер способность CRITICAL DAMAGE”.
//        4. В классе Main создать массив из 3х разных героев, затем через цикл применить супер способность каждого героя.
//        5. В классе медик добавить поле healPoints, затем добавить метод increaseExperience, в котором бы при вызове увеличивалось количество единиц лечения на 10%.
//        6. При прохождении через массив в пункте 4 увеличить опыт лечения медика, сделав приведение типов (Type Casting).