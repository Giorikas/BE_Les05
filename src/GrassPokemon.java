import java.util.ArrayList;
import java.util.List;

public class GrassPokemon extends Pokemon {

    private String type = "grass";
    private List<String> attacks = new ArrayList<String>();

    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
        this.type = type;
        attacks.add("leafStorm");
        attacks.add("solarBeam");
        attacks.add("leechSeed");
        attacks.add("leaveBlade");
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

    void leafStorm(Pokemon name, Pokemon enemy){
        System.out.printf("%s uses leafStorm on %s\n", name, enemy);
    };

    void solarBeam(Pokemon name, Pokemon enemy) {
        System.out.printf("%s uses Solarbeam on %s\n", name, enemy);
    }

    void leechSeed(Pokemon name, Pokemon enemy){
        System.out.printf("%s uses Leechseed on %s\n", name, enemy);
    }

    void leaveBlade(Pokemon name, Pokemon enemy){
        System.out.printf("%s uses Leaveblade on %s\n", name, enemy);
    };

}
