import java.util.ArrayList;
import java.util.List;

public class WaterPokemon extends Pokemon{


    private String type = "water";
    private List<String> attacks = new ArrayList<String>();

    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
        this.type = type;
        attacks.add("hydropump");
        attacks.add("surf");
        attacks.add("hydrocanon");
        attacks.add("raindance");
    }

    public String getType() {
        return type;
    }

    public List<String> getAttacks() {
        return attacks;
    }

    public void setAttacks(List<String> attacks) {
        this.attacks = attacks;
    }

    void hydroPump(Pokemon name, Pokemon enemy){
        System.out.printf("%s uses HydroPump on %s\n", name, enemy);
    };

    void surf(Pokemon name, Pokemon enemy) {
        System.out.printf("%s uses Surf on %s\n", name, enemy);
    }

    void hydroCanon(Pokemon name, Pokemon enemy){
        System.out.printf("%s uses HydroCanon on %s\n", name, enemy);
    }

    void rainDance(Pokemon name, Pokemon enemy){
        System.out.printf("%s uses RainDance on %s\n", name, enemy);
    };

}
