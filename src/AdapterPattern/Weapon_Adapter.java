package AdapterPattern;
import StrategyPattern.WeaponBehavior;

public class Weapon_Adapter implements WeaponBehavior {
    MagicBehavior magicBehavior;

    public Weapon_Adapter(MagicBehavior magicBehavior){
        this.magicBehavior = magicBehavior;
    }

    @Override
    public void weaponAttack(){
        magicBehavior.magicAttack();
    }
}
