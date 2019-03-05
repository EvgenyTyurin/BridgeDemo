/**
 * Refined abstraction 1
 */

class Mage extends RPGPerson {
    Mage(PersonRace personRace) {
        super(personRace);
    }

    @Override
    void attack() {
        super.attack();
        System.out.println("Fireball!");
    }
}
