import AdapterPattern.M_Wind;
import AdapterPattern.Weapon_Adapter;
import DecoratorPattern.E_Fire;
import ObserverPattern.Game;
import StrategyPattern.AxeBehavior;
import StrategyPattern.BowBehavior;
import StrategyPattern.SwordBehavior;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();

        Characters king = CharacterFactory.createCharacter("king");
        king.setWeaponBehavior(new BowBehavior());
        Characters knight = CharacterFactory.createCharacter("knight");
        knight.setWeaponBehavior(new SwordBehavior());

        Characters knight2 = CharacterFactory.createCharacter("knight");
        knight.setWeaponBehavior(new AxeBehavior());

        game.addSubscriber(king);
        game.removeSubscriber(king);

        game.addSubscriber(knight);
        game.addSubscriber(knight2);


        game.newUpdate("Added two bosses, and 3 new types of weapons");


        king.display();
        king.performFight();

    }
}