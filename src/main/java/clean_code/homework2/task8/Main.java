package clean_code.homework2.task8;

public class Main {

  public static void main(String[] args) {
    Character hero = new Character.Builder().setMagic("Fire").setDamage(30).setHealth(100)
        .setArmor(70).createCharacter();
    hero.printCharacterInfo();
  }

}
