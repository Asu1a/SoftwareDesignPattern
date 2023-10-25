public class CharacterFactory {

    public static Characters createCharacter(String type) {
        if ("King".equalsIgnoreCase(type)) {
            return new King("Sultan");
        }
        else if ("Knight".equalsIgnoreCase(type)) {
            return new Knight();
        }
        else if ("Queen".equalsIgnoreCase(type)){
            return new Queen();
        }
        else if ("Troll".equalsIgnoreCase(type)){
            return new Troll();
        }
        throw new RuntimeException("Unknown character!!!");
    }
}