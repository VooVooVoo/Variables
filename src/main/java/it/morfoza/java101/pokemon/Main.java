package it.morfoza.java101.pokemon;

import javax.sound.midi.Soundbank;

/**
 * Created by Wojt on 2016-07-29.
 */
public class Main {
    public static void main(String[] args) {


        Pokemon pokemon = new Pokemon();

        String pokemonDescription = pokemon.toString();

        System.out.println(pokemonDescription);

    }
}
