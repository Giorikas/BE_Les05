import java.util.List;
import java.util.ArrayList;

public class ElectricPokemon extends Pokemon{

    private String type = "electric";
    private List<String> attacks = new ArrayList<String>();

    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
        this.type = type;
        attacks.add("electroball");
        attacks.add("thunderpunch");
        attacks.add("thunder");
        attacks.add("volttackle");
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
    void thunderPunch(Pokemon name, Pokemon enemy){
        System.out.printf("%s uses ThunderPunch on %s\n", name, enemy);
    };

    void electroBall(Pokemon name, Pokemon enemy) {
        System.out.printf("%s uses ElectroBall on %s\n", name, enemy);
    }

    void thunder(Pokemon name, Pokemon enemy){
        System.out.printf("%s uses Thunder on %s\n", name, enemy);
    }

    void voltTackle(Pokemon name, Pokemon enemy){
        System.out.printf("%s uses VoltTackle on %s\n", name, enemy);
    };

}
