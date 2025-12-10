package clean_code.homework2.task4;

public abstract class WeaponFactory {

  abstract Weapon createWeapon();

  public void printWeaponAttack() {
    Weapon weapon = createWeapon();
    weapon.attack();
  }

}
