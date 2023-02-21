package main.java.Models;

public class Combination {

    private CombinationType type;
    private int[] nominals;

    public CombinationType getType() {
        return type;
    }

    public int[] getNominals() {
        return nominals;
    }

    public Combination(CombinationType type, int[] nominals) {
        this.type = type;
        this.nominals = nominals;
    }

    // TODO: сделать необходимые конструкторы
}
