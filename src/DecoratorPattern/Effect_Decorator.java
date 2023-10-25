package DecoratorPattern;
import StrategyPattern.WeaponBehavior;

public abstract class Effect_Decorator implements WeaponBehavior {
    //Ссылка
    WeaponBehavior weaponBehavior;

    //Конструтор показывает нам какое оруже мы улучшаем
    public Effect_Decorator(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    @Override
    public void weaponAttack() {
        weaponBehavior.weaponAttack();
    }
}
