package clean_code.homework2.task8;

public class Character {

  private int health;
  private int damage;
  private int armor;
  private String magic;

  public Character(int health, int damage, int armor, String magic) {
    this.health = health;
    this.damage = damage;
    this.armor = armor;
    this.magic = magic;
  }

  public Character(Builder builder) {
    this.health = builder.health;
    this.damage = builder.damage;
    this.armor = builder.armor;
    this.magic = builder.magic;
  }

  public void printCharacterInfo() {
    System.out.println("Character: " + magic);
    System.out.println("Health: " + health);
    System.out.println("Damage: " + damage);
    System.out.println("Armor: " + armor);
  }

  static class Builder {

    private int health;
    private int damage;
    private int armor;
    private String magic;

    public Builder setHealth(int health) {
      this.health = health;
      return this;
    }

    public Builder setDamage(int damage) {
      this.damage = damage;
      return this;
    }

    public Builder setArmor(int armor) {
      this.armor = armor;
      return this;
    }

    public Builder setMagic(String magic) {
      this.magic = magic;
      return this;
    }

    public Character createCharacter() {
      return new Character(this);
    }
  }
}
