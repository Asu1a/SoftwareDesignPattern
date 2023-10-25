package DecoratorPattern;

import StrategyPattern.WeaponBehavior;

public class E_Speed extends Effect_Decorator{

    //Позволяет нам упаковать базовое оружие внутри DecoratorPattern.E_Speed
    public E_Speed(WeaponBehavior weaponBehavior) {
        super(weaponBehavior);
    }

    //Переопределяет метод useWeapon()
    @Override
    public void weaponAttack() {
        super.weaponAttack();
        System.out.println(" +Speed");
    }

}
