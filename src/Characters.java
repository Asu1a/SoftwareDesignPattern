import ObserverPattern.Observer;
import StrategyPattern.WeaponBehavior;

abstract public class Characters implements Observer {

    WeaponBehavior weaponBehavior;

    void performFight() {
        weaponBehavior.weaponAttack();
    }
    void display(){};

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    public void update(String message) {
        System.out.println("New update: " + message);
    }

}
