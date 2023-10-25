package DecoratorPattern;
import StrategyPattern.WeaponBehavior;

public class E_Fire extends Effect_Decorator{

    public E_Fire(WeaponBehavior weaponBehavior) {
        super(weaponBehavior);
    }

    @Override
    public void weaponAttack() {
        super.weaponAttack();
        System.out.println(" +Fire");
    }
}
