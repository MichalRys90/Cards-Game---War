public class Main {
    public static void main(String[] args) throws InterruptedException {
        NormalBattle normalBattle = new NormalBattle();
        ColorBattle colorBattle = new ColorBattle();
        RarityBattle rarityBattle = new RarityBattle();
        rarityBattle.gerRarityBattle();
        colorBattle.getColorBattle();
        normalBattle.getValuesFromDecks();
    }
}