package main.java.Models;

public class DiceSet {
    int nominal;
    int count;
    DiceSet() {
        nominal = 0;
        count = 0;
    }
    public DiceSet(int value, int count) {
        this.nominal =  value;
        this.count = count;
    }
    public int getNominal() {
        return nominal;
    }
    public void setNominal(int value) {
        this.nominal = value;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
    public void incrementCount () {
        this.count++;
    }
}


//    sixDiceSet ()

