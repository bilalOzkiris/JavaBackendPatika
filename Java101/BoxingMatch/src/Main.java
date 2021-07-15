public class Main {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("Rocky", 160, 110, 20, 20);
        Fighter fighter2 = new Fighter("Apollo", 140, 120, 15, 40);
        Ring madisonSquareGarden = new Ring(fighter1, fighter2, 110, 180);
        madisonSquareGarden.fight();
    }
}
