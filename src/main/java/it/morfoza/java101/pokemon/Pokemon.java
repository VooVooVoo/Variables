package it.morfoza.java101.pokemon;

/**
 * Created by Wojt on 2016-07-29.
 */
public class Pokemon {


    private String name;
    private long health;
    private long combatpower;

    public Pokemon(String name, long health, long combatpower) {

        this.name = name;
        this.combatpower = combatpower;
        this.health = health;
    }
    public String toString() {
        return "Pokemon: " + name + ", Health: " + health + ", Combat Power: " + combatpower;
    }

    public void takeAttack(long combatpower) {
        health -= combatpower;
    }


    public boolean isConscious() {
        if (health>0) {
            return true;
        }
        else {
            return false;
        }
    }

    public void attack(Pokemon pokemon) {
        if(this != pokemon) {
            pokemon.takeAttack(combatpower);

            System.out.println(pokemon + " gets attacked for " + combatpower + " by ?");
        }
    }
}
