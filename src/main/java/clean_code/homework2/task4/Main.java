package clean_code.homework2.task4;

public class Main {

  public static void main(String[] args) {
    WeaponFactory bow = new BowFactory();
    WeaponFactory sword = new SwordFactory();
    WeaponFactory gun = new GunFactory();
    bow.createWeapon();
    bow.printWeaponAttack();
    sword.createWeapon();
    sword.printWeaponAttack();
    gun.printWeaponAttack();
  }

}
