import java.util.List;

public interface PokemonGym {

    void printPokemon();

    void enteredTheGym(PokemonTrainer player1);

    void fightRound(PokemonTrainer trainer, PokemonGymOwner owner );

    //void printPokemon(List<Pokemon> pokemons);
    abstract void printPokemon();



}
