/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemoncardgame.models;

/**
 *
 * @author askilic
 */
public class Butterfree extends Pokemon {

    private int attackPower;

    public Butterfree() {
        super("Butterfree", "Fly","src/images/8.png");
        this.attackPower = 10;
        super.setPokemonID(8);
    }

    public Butterfree(int attackPower, String pokemonName, String pokemonType) {
        super(pokemonName, pokemonType);
        this.attackPower = attackPower;
        super.setPokemonID(8);
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }
    @Override
    public int showAttackPower(){
        System.out.println(this.getPokemonName()+" have "+this.attackPower
        +" attack power");
        return this.attackPower;
    }
}
