package it.morfoza.java101.pokemon;


/**
 * Created by Wojt on 2016-07-29.
 */
public class Main {
    public static void main(String[] args) {


        Pokemon pokemon = new Pokemon("Pikachu", 1000, 100 );
        Pokemon pokemon2 = new Pokemon("Charizard",2000, 200);
        Pokemon pokemon3 = new Pokemon("Bulbasaur", 2000, 300);

        System.out.println(pokemon);
        System.out.println(pokemon2);
        System.out.println(pokemon3);

        pokemon3.attack(pokemon);


        System.out.println(pokemon);
        System.out.println(pokemon2);
        System.out.println(pokemon3);

        if(pokemon.isConscious()) {
            System.out.println("Pokemon is conscious");
        } else {
            System.out.println("Pokemon is unconscious");
        }


    }
}
