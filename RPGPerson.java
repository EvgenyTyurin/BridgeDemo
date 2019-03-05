/**
 * Abstraction class
 */

abstract class RPGPerson {
    private PersonRace personRace;

    RPGPerson(PersonRace personRace) {
        this.personRace = personRace;
    }

    void attack() {
        personRace.warCry();
    }

}
