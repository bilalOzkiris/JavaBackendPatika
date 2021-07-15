public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void fight() {
        if (isWeightsOK()) {
            openingLine();
            printScore();
            do {
                if (whoHits() == this.f1) {
                    System.out.println(this.f1.name + " hits " + this.f1.damage + " to " + this.f2.name);
                    this.f2.health = this.f1.hit(f2);
                } else {
                    System.out.println(this.f2.name + " hits " + this.f2.damage + " to " + this.f1.name);
                    this.f1.health = this.f2.hit(f1);
                }
                printScore();
            } while (this.f1.health > 0 && this.f2.health > 0);
            System.out.println(whoWins().name + " has the VICTORY!");
        } else {
            System.out.println("Weights are not matched!");
        }
    }

    public boolean isWeightsOK() {
        return (f1.weight >= this.minWeight && f1.weight <= this.maxWeight) &&
                (f2.weight >= this.minWeight && f2.weight <= this.maxWeight);
    }
    // calculating at every turn.
    public Fighter whoHits() {
        double randomValue = Math.random() * 100;
        if (randomValue <= 50) {
            return this.f1;
        } else {
            return this.f2;
        }
    }

    public Fighter whoWins() {
        if (this.f1.health == 0) {
            return this.f2;
        } else {
            return this.f1;
        }
    }

    public void printScore() {
        System.out.println(this.f1.name + " = " + this.f1.health +
                " ----- " + this.f2.name + " = " + this.f2.health);
    }

    public void openingLine() {
        System.out.println(this.f1.name + " VS " + this.f2.name);
        System.out.println("---Let's fight!!!---");
    }

}
