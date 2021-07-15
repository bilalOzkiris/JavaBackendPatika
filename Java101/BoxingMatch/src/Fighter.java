public class Fighter {
    String name;
    int health;
    int weight;
    int damage;
    double dodgeRate;

    public Fighter(String name, int health, int weight, int damage, double dodgeRate) {
        this.name = name;
        this.health = health;
        this.weight = weight;
        this.damage = damage;
        this.dodgeRate = (dodgeRate >= 0 && dodgeRate <= 100) ? dodgeRate : 0;
    }

    public int hit(Fighter f) {
        if (f.isDodged()) {
            System.out.println("OMG!! " + f.name + " dodges the hit.");
            return f.health;
        } else return Math.max(f.health - this.damage, 0);
    }

    public boolean isDodged() {
        return Math.random() * 100 <= this.dodgeRate;
    }

}
