/**
 * Bridge pattern demo
 * 2019 Mar Evgeny Tyurin
 * RPGPerson - abstraction, PersonRace - implementor
 */

public class BridgeDemo {

    /** Test rpg-person, using it's methods */
    static private void testRPGPerson(RPGPerson rpgPerson) {
        rpgPerson.attack();
    }

    /** App run point */
    public static void main(String[] args) {
        // Elf mage
        testRPGPerson(new Mage(new Elf()));
        // Orc warrior
        testRPGPerson(new Warrior(new Orc()));
        // Orc mage!
        testRPGPerson(new Mage(new Orc()));
        // Elf warrior!!!
        testRPGPerson(new Warrior(new Elf()));
    }
}
