/**
 * Refined abstraction 2
 */

class Warrior extends RPGPerson {
    Warrior(PersonRace personRace) {
        super(personRace);
    }

    @Override
    void attack() {
        super.attack();
        System.out.println("Sword hit!");
    }
}
