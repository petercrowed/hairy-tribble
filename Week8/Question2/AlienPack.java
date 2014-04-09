public class AlienPack {

  private Alien[] aliens;

  public AlienPack(int numAliens) {
    this.aliens = new Alien[numAliens];
  }

  public void addAlien(Alien newAlien, int index) {
    aliens[index] = newAlien;
  }

  public Alien[] getAlien() {
    return aliens;
  }

  public int calculateDamage() {
    int damage = 0;
    for (int i = 0; i < aliens.length; i++) {
      damage += aliens[i].getDamage();
    }

    return damage;
  }

}