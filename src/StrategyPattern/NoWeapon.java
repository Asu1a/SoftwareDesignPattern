package StrategyPattern;

import StrategyPattern.WeaponBehavior;

public class NoWeapon implements WeaponBehavior {

    public void weaponAttack() {
        System.out.println("I have no weapon");
    }

}
