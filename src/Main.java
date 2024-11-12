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

        //Deleted knight2

        game.addSubscriber(king);
        game.removeSubscriber(king);

        game.addSubscriber(knight);


        game.newUpdate("Added two bosses, and 3 new types of weapons");

        // TEST CHANGES

        king.display();
        king.performFight();

    }
}