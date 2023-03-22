import java.util.ArrayList;
import java.util.List;

public class FirePokemon extends Pokemon{

    private String type = "fire";
    private List<String> attacks = new ArrayList<String>();

    public FirePokemon(String name, int level, int hp, String food, String sound){
        super(name, level, hp, food, sound);
        this.type = type;
        attacks.add("inferno");
        attacks.add("pyroball");
        attacks.add("firelash");
        attacks.add("flamethrower");
    }

    public String getType() {
        return type;
    }

    // public void setType(String type) {
        // this.type = type;}


    public List<String> getAttacks() {
        return attacks;
    }

    void inferno(Pokemon name, Pokemon enemy){
        System.out.printf("%s uses Inferno on %s\n", name, enemy);
    };

    void fireLash(Pokemon name, Pokemon enemy) {
        System.out.printf("%s uses Firelash on %s\n", name, enemy);
    }

    void flameThrower(Pokemon name, Pokemon enemy){
        System.out.printf("%s uses FlameThrower on %s\n", name, enemy);
    }

    void pyroBall(Pokemon name, Pokemon enemy){
        System.out.printf("%s uses PyroBall on %s\n", name, enemy);
    };

}
