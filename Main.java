public class Main {
  public static void main(String[] args) {
    //System.out.println("SEMonster!");

    Player player = new Player();
    Monster monster = new Monster();

    System.out.println("SEMONSTER GAME");
    System.out.println("Show draw monster!");

    player.drawMonsters();
    player.showDeck();
    //Monster monster = new Monster();
    //System.out.println(monster.toString());

  }
}
