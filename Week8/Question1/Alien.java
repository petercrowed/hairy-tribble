public class Alien {

  public static final int SNAKE_ALIEN = 0;
  public static final int OGRE_ALIEN = 1;
  public static final int MARSHMALLOW_MAN_ALIEN = 2;

  protected int type;
  protected int damage;
  public int health;
  public String name;

  public Alien(int health, String name) {
    this.health = health;
    this.name = name;
  }

  public int getAlienType() {
    return this.type;
  }

  public String getAlienTypeName() {
    switch (type) {
      case Alien.SNAKE_ALIEN:
      return "Snake";
      case Alien.OGRE_ALIEN:
      return "Ogre";
      case Alien.MARSHMALLOW_MAN_ALIEN:
      return "Marshmallow";
      default:
      return "";
    }
  }

  public int getDamage() {
    return this.damage;
  }
}